package com.example.pdfgenerator.service;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

@Service
public class PDFGeneratorService {
	public void export(HttpServletResponse response) throws IOException {
		Document document=new Document(PageSize.A4);
		PdfWriter.getInstance(document, response.getOutputStream());
		
		document.open();
		Font fontTitle=FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		fontTitle.setSize(18);
		
		Paragraph paragraph=new Paragraph("This is a tile",fontTitle);
		paragraph.setAlignment(paragraph.ALIGN_CENTER);
		
		Font fontParagraph=FontFactory.getFont(FontFactory.HELVETICA);
		fontParagraph.setSize(12);
		
		Paragraph paragraph2=new Paragraph("This is a paragraph", fontParagraph);
		paragraph2.setAlignment(paragraph2.ALIGN_LEFT);
		
		document.add(paragraph);
		document.add(paragraph2);
		document.close();
	}
}
