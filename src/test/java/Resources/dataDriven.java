package Resources;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Iterator;



import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.CellType;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.util.NumberToTextConverter;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class dataDriven {

 public ArrayList<String> getdata(String testcasename) throws IOException {

 ArrayList<String> a = new ArrayList<String>();

 FileInputStream file = new FileInputStream("C://Users//Dell//Documents//testdata.xlsx");

 XSSFWorkbook workbook = new XSSFWorkbook(file);

 int sheet = workbook.getNumberOfSheets();

 for (int i = 0; i < sheet; i++) {

  if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {



  XSSFSheet sheet1 = workbook.getSheetAt(i);

  Iterator<Row> rows = sheet1.iterator();

  Row Firstrow = rows.next();

  Iterator<Cell> ce = Firstrow.cellIterator();

  int k = 0;

  int column = 0;

  while (ce.hasNext()) {

   Cell value = ce.next();

   if (value.getStringCellValue().equalsIgnoreCase("Testcases")) {

   column = k;

   }

   k++;

  }

  while (rows.hasNext()) {

   Row r = rows.next();

   if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename)) {

   Iterator<Cell> cv = r.cellIterator();

   while (cv.hasNext()) {

    Cell c = cv.next();

    if(c.getCellTypeEnum()==CellType.STRING) {

    a.add(c.getStringCellValue());

    }

    else {

    a.add(NumberToTextConverter.toText(c.getNumericCellValue()));



    }

   }



   }

  }

  }



 }

 return a;

 }



 public static void main(String[] args) throws IOException {



 }

}

