package com.dev.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.dev.springboot.util.pdf.PDFGenerator;

@SpringBootApplication
@ComponentScan(basePackages = {"com.dev.springboot"})
public class SpringBoot2PdfGenerationApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBoot2PdfGenerationApplication.class, args);
		ApplicationContext ac=SpringApplication.run(SpringBoot2PdfGenerationApplication.class, args);
		
		PDFGenerator pDFGenerator = ac.getBean("pdfGenerator",PDFGenerator.class);
		
		pDFGenerator.generatePdfReport();
	}

}
