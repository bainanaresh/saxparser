package com.saxp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SaxParserTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, FileNotFoundException, IOException {
	
		SAXParserFactory factory=SAXParserFactory.newInstance();
		SAXParser parser=factory.newSAXParser();
	SaxHandler sd=new SaxHandler();
		parser.parse(new FileInputStream("C:\\Users\\BAINA NARESH\\Desktop\\teja\\employee.xml"),sd); 

	}

}
