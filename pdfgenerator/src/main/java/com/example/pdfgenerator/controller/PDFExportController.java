package com.example.pdfgenerator.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pdfgenerator.service.PDFGeneratorService;

@RestController
public class PDFExportController {

	@Autowired
	private  PDFGeneratorService pdfGeneratorService;
	
	
	public PDFExportController(PDFGeneratorService pdfGeneratorService)
	{
		this.pdfGeneratorService=pdfGeneratorService;
	}
	
	
	@GetMapping("/pdf/generate")
	public void generatePDF(HttpServletResponse response) throws IOException
	{
		response.setContentType("application/pdf");
		DateFormat dateFormatter =new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
		String currentDateTime=dateFormatter.format(new Date());
		
		String headerKey="Content-Disposition";
		String headerValue="attachment; filename=pdf_"+currentDateTime+".pdf";
		response.setHeader(headerKey, headerValue);
		
		this.pdfGeneratorService.export(response);
	}
	
}
