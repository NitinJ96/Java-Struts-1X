package com.thirdware.excel2pdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Excel2PDF {

	public static void main(String[] args) throws FileNotFoundException, DocumentException, IOException {

	}

//	public void readNwrite(Document document, String excelpath) throws IOException, DocumentException {
//		try  {
//			Workbook workbook = WorkbookFactory.create(new File(excelpath));
//			Iterator<Sheet> sheetIterator = workbook.sheetIterator();
//			int sheetnum = 0;
//			while (sheetIterator.hasNext()) {
//				Sheet sheet = sheetIterator.next();
//				workbook.getSheetAt(sheetnum);
//				sheetnum++;
//
//				DataFormatter dataFormatter = new DataFormatter();
//
//				PdfPTable table = new PdfPTable(7);
//				Paragraph p;
//				Font normal = new Font(FontFamily.TIMES_ROMAN, 12);
//				boolean title = true;
//
//				for (Row row : sheet) {
//					if (row.getRowNum() >= 4 && row.getRowNum() <= 155) {
//						for (Cell cell : row) {
//
//							String cellValue = dataFormatter.formatCellValue(cell);
//							table.addCell(cellValue);
////                            System.out.println(cell.getRowIndex() + " " + cell.getColumnIndex());
////                            System.out.print(cellValue + "\t");
//
//						}
//
//					} else if (row.getRowNum() < 4) {
//						for (Cell cell : row) {
//
//							String cellValue = dataFormatter.formatCellValue(cell);
//
//							p = new Paragraph(cellValue, title ? normal : normal);
//							p.setAlignment(Element.ALIGN_JUSTIFIED);
//							document.add(p);
//						}
//
//					}
//				}
//				document.add(new Paragraph(" "));
//				float[] columnWidths = new float[] { 5f, 0f, 35f, 7f, 7f, 5f, 15f };
//				table.setWidths(columnWidths);
//				table.setTotalWidth(550);
//				table.setLockedWidth(true);
//				document.add(table);
//				for (Row row : sheet) {
//					if (row.getRowNum() > 154) {
//						for (Cell cell : row) {
//
//							String cellValue = dataFormatter.formatCellValue(cell);
//
//							p = new Paragraph(cellValue, title ? normal : normal);
//							p.setAlignment(Element.ALIGN_JUSTIFIED);
//							document.add(p);
//						}
//
//					}
//				}
//			}
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
//
//	}
//
//	public void createpdf(String pdfpath, String excelpath)
//			throws DocumentException, FileNotFoundException, IOException {
//
//		Document document = new Document();
//		PdfWriter.getInstance(document, new FileOutputStream(pdfpath));
//		document.open();
//		readNwrite(document, excelpath);
//		document.close();
//	}

}
