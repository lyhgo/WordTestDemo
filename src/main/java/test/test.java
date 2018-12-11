package test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
public class test {
public static void main(String[] args) {
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
//	for(int i=0;i<10;i++)
//	{
//		XWPFParagraph paragraph=paragraphs.get(i); 
//		System.out.println(paragraph.getText());
//	}
}
}
