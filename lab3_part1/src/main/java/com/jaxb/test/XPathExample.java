package com.jaxb.test;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;

public class XPathExample {
    public XPathExample() {
    }

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("order.xml"));
            XPathFactory xPathFactory = XPathFactory.newInstance();
            XPath xpath = xPathFactory.newXPath();
            String expression = "/order/customer/name";
            String customerName = xpath.evaluate(expression, document);
            System.out.println("Customer Name: " + customerName);
        } catch (Exception var8) {
            Exception e = var8;
            e.printStackTrace();
        }

    }
}
