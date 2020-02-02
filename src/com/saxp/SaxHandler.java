package com.saxp;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxHandler extends DefaultHandler {

	

	@Override
	public void endDocument() throws SAXException {
		System.out.println("end document");
	}

	@Override
	public void endElement(String arg0, String arg1, String arg2) throws SAXException {
		System.out.println("</"+arg2+">");
		
	}

	@Override
	public void startDocument() throws SAXException {
		System.out.println("end document");
		
	}

	@Override
	public void startElement(String arg0, String arg1, String arg2, Attributes arg3) throws SAXException {
		System.out.print("<"+arg2+">");
	}
	
	@Override
	public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
		String str=new String(arg0,arg1,arg2);
		System.out.print(str);
		
	}
	

}
