package com.example.pdfview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.pdfview")
public class PdfviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdfviewApplication.class, args);
	}

}
