package readFile;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class Ex3_Read_File_XML {
	public static void main(String[] args) {
			File file = new File("D:\\workspace\\JavaPractice\\readFile\\xmlTest");
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			try {
				DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
				Document document = documentBuilder.parse(file);
				
				for(int i = 0; i< document.getElementsByTagName("student").getLength(); i++) {
					System.out.println("firstName: " + document.getElementsByTagName("firstname").item(i).getTextContent());
					System.out.println("lastName: " + document.getElementsByTagName("lastname").item(i).getTextContent());
					System.out.println("Marks: " + document.getElementsByTagName("marks").item(i).getTextContent());
					System.out.println("=============================================");
				}			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
        
}
	
}
