package com.capgemini.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Service;

@Service
public class Tool {
	public String SimpleInsert(String text)
	{
		FileInputStream is = null;
		try {
			is = new FileInputStream("E:\\test.docx");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		XWPFDocument docx = null;
		try {
			docx = new XWPFDocument(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XWPFTable table=docx.getTableArray(1);
		List<XWPFParagraph> paragraphs=table.getRow(2).getCell(1).getParagraphs();
		XWPFParagraph paragraph=paragraphs.get(0); 
		List<XWPFRun> x=paragraph.getRuns();
		x.get(0).setText(text, 0);;
		FileOutputStream teStream = null;
		try {
			teStream = new FileOutputStream("E:\\test1.docx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			docx.write(teStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
}
