package com.wx_hospital.utils;

import com.wx_hospital.pojo.ReportBaobiao;

import org.apache.http.entity.ContentType;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class poiReadExcelInfo {

    private static final String EXCEL_XLS = "xls";
    private static final String EXCEL_XLSX = "xlsx";

    public static void checkExcelVaild(MultipartFile file) throws Exception {
        if (file == null){
            throw new Exception("文件不存在");
        }
        if (!((file.getName().endsWith(EXCEL_XLS) || file.getName().endsWith(EXCEL_XLSX)))){
            throw new Exception("文件不是Excel");
        }

    }

    public static String getCellValue(Cell cell){
        String cellValue = "";
        if(cell == null){
            return cellValue;
        }
        //把数字当成String来读，避免出现1读成1.0的情况
        if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC){
            cell.setCellType(Cell.CELL_TYPE_STRING);
        }
        //判断数据的类型
        switch (cell.getCellType()){
            case Cell.CELL_TYPE_NUMERIC: //数字
                cellValue = String.valueOf(cell.getNumericCellValue());
                break;
            case Cell.CELL_TYPE_STRING: //字符串
                cellValue = String.valueOf(cell.getStringCellValue());
                break;
            case Cell.CELL_TYPE_BOOLEAN: //Boolean
                cellValue = String.valueOf(cell.getBooleanCellValue());
                break;
            case Cell.CELL_TYPE_FORMULA: //公式
                cellValue = String.valueOf(cell.getCellFormula());
                break;
            case Cell.CELL_TYPE_BLANK: //空值
                cellValue = "";
                break;
            case Cell.CELL_TYPE_ERROR: //故障
                cellValue = "非法字符";
                break;
            default:
                cellValue = "未知类型";
                break;
        }
        return cellValue;
    }

    public static List<ReportBaobiao> readExcel(MultipartFile file) throws Exception {
        List<ReportBaobiao> resolveRuleList = new ArrayList<ReportBaobiao>();
        try {
            checkExcelVaild(file);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

        //文件流
        InputStream is = file.getInputStream();
        Workbook workbook = null;
        if(file.getName().endsWith(EXCEL_XLS)){  //Excel 2003
            workbook = new HSSFWorkbook(is);
        }else if(file.getName().endsWith(EXCEL_XLSX)){  // Excel 2007/2010
            workbook = new XSSFWorkbook(is);
        }
        //获取Excel文件第一个sheet
        Sheet sheet = workbook.getSheetAt(0);

        int count = 0;
        //遍历每一行数据
        for (Row row : sheet){
            //过滤第一行数据
            if (count<1){
                count++;
                continue;
            }
            ReportBaobiao resolveRule = new ReportBaobiao();
            //遍历每一列数据
            int c = 0;
            for (Cell cell : row){
                String value = getCellValue(cell);
               /* if (c<5){
                    resolveRule.setName(null);
                }*/
                switch (c){
                    case 0:
                        resolveRule.setName(value);
                        break;
                    case 1:
                        resolveRule.setJiehuo(value);
                        break;
                    case 2:
                        resolveRule.setCankaozhi(value);
              /*          break;
                    case 3:
                        resolveRule.setEnable(Boolean.parseBoolean(value.toLowerCase()));
                        break;
                    case 4:
                        resolveRule.setNote(value);
                        break;
                    case 5:
                        String[] strings = value.split("###");
                        List<Pattern> patternList = new ArrayList<Pattern>();
                        Pattern pattern = null;
                        for (int x = 0;x<strings.length;x++){
                            pattern = Pattern.compile(strings[x]);
                            patternList.add(pattern);
                        }
                        resolveRule.setRuleRegex(patternList);
                        break;*/
                }
                c++;
            }
            resolveRuleList.add(resolveRule);
        }
        return resolveRuleList;
    }

    public static List<ReportBaobiao> Res(String  pathname){
        List<ReportBaobiao> resolveRuleList = null;
        try {
        /*    Scanner scanner = new Scanner(System.in);*/
            System.out.println("请输入文件绝对路径(如:E:/解析规则.xlsx)：");
            File file = new File(pathname);

            FileInputStream inputStream = new FileInputStream(file);
            //File 转 MultipartFile
            MultipartFile mMultipartFile = new MockMultipartFile(file.getName(),file.getName(),
                    ContentType.APPLICATION_OCTET_STREAM.toString(),inputStream);

            resolveRuleList = readExcel(mMultipartFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resolveRuleList;
    }

    public static void main(String[] args) throws IOException {
        String wenjian="test";

//        String path="D:\\wx_hospital\\reportFile\\"+wenjian+"";
        //List<ReportBaobiao> resolveRuleList = Res(path);
//        for (ReportBaobiao  bus:resolveRuleList) {
//            System.out.println(bus);
//        }


        //判断文件是否存在  如果不存在则不读取返回前端
        File file = new File("D:\\wx_hospital");
        List<ReportBaobiao> list = null;
        try {
            if (!file.exists()) { //文件夹不存在
                System.out.println("异常1");
            }else {//文件夹存在
                File file1 = new File("D:\\wx_hospital\\reportFile");
                if (!file1.exists()) {
                    System.out.println("异常2");
                } else {
                    File file2 = new File("D:\\wx_hospital\\reportFile\\" + wenjian + ".xlsx");
                    if (!file2.exists()) {
                        System.out.println("异常3");
                    } else {
                        String path1 = "D:\\wx_hospital\\reportFile\\" + wenjian + ".xlsx";
                        list = poiReadExcelInfo.Res(path1);//传的前端获取对应的地址（活的最后再改）
//                        for (ReportBaobiao  bus:list) {
//                                   System.out.println(bus);
//                         }
                    }
                }
            }
        } catch (Exception exc) {//捕获异常
            exc.toString();
            System.out.println("异常1111");
        }

        System.out.println(list);



//        //判断文件夹if(){}
//
//        //判断前端传来文件是否为空
//
//        String path2=file+wenjian;
//        List<ReportBaobiao> resolveRuleList = Res(path);
//
//        for (ReportBaobiao  bus:resolveRuleList) {
//            System.out.println(bus);
//        }



    }





}
