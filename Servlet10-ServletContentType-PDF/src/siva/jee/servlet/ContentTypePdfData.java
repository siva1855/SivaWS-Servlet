package siva.jee.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class ContentTypePdfData extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("application/pdf");
		response.addHeader("Content-Disposition", "attachment;filename=productDetailsData.pdf");

		try {
			Document document = new Document();
			PdfWriter.getInstance(document, response.getOutputStream());
			document.open();
			document.add(new Paragraph("Welcome To PDF Data - ProductDetails"));

			PdfPTable pdfPTable = new PdfPTable(3);
			pdfPTable.addCell("SNO");
			pdfPTable.addCell("PRODUCT");
			pdfPTable.addCell("PRICE");

			
			pdfPTable.addCell("101");
			pdfPTable.addCell("Laptop");
			pdfPTable.addCell("30000");

			pdfPTable.addCell("102");
			pdfPTable.addCell("Mobile");
			pdfPTable.addCell("9000");

			pdfPTable.addCell("103");
			pdfPTable.addCell("Bag");
			pdfPTable.addCell("500");
			
			pdfPTable.addCell("104");
			pdfPTable.addCell("Shoes");
			pdfPTable.addCell("2000");
			
			pdfPTable.addCell("105");
			pdfPTable.addCell("Bike");
			pdfPTable.addCell("85000");
			
			document.add(pdfPTable);
			document.add(new Paragraph(new Date().toString()));
			document.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
