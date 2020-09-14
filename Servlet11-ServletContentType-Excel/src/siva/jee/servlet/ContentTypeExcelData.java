package siva.jee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ContentTypeExcelData extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/vnd.ms-excel");
		response.addHeader("Content-Disposition", "attachement;filename=productDetailsData.xls");

		try {
			HSSFWorkbook hSSFWorkbook = new HSSFWorkbook();

			HSSFSheet hSSFSheet = hSSFWorkbook.createSheet("ProductData");

			HSSFRow hSSFRow0 = hSSFSheet.createRow(0);
			hSSFRow0.createCell(0).setCellValue("SNO");
			hSSFRow0.createCell(1).setCellValue("PRODUCT");
			hSSFRow0.createCell(2).setCellValue("PRICE");

			HSSFRow hSSFRow1 = hSSFSheet.createRow(1);
			hSSFRow1.createCell(0).setCellValue("101");
			hSSFRow1.createCell(1).setCellValue("Laptop");
			hSSFRow1.createCell(2).setCellValue("30000");

			HSSFRow hSSFRow2 = hSSFSheet.createRow(2);
			hSSFRow2.createCell(0).setCellValue("102");
			hSSFRow2.createCell(1).setCellValue("Mobile");
			hSSFRow2.createCell(2).setCellValue("9500");

			HSSFRow hSSFRow3 = hSSFSheet.createRow(3);
			hSSFRow3.createCell(0).setCellValue("103");
			hSSFRow3.createCell(1).setCellValue("Bag");
			hSSFRow3.createCell(2).setCellValue("500");
			
			HSSFRow hSSFRow4 = hSSFSheet.createRow(4);
			hSSFRow4.createCell(0).setCellValue("104");
			hSSFRow4.createCell(1).setCellValue("TV");
			hSSFRow4.createCell(2).setCellValue("15000");
			
			hSSFWorkbook.write(response.getOutputStream());
			hSSFWorkbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
