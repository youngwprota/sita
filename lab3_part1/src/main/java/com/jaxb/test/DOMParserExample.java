package com.jaxb.test;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMParserExample {
    public DOMParserExample() {
    }

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("order.xml"));
            NodeList items = document.getElementsByTagName("item");

            for(int i = 0; i < items.getLength(); ++i) {
                Node item = items.item(i);
                if (item.getNodeType() == 1) {
                    Element element = (Element)item;
                    String name = element.getElementsByTagName("name").item(0).getTextContent();
                    String quantity = element.getElementsByTagName("quantity").item(0).getTextContent();
                    System.out.println("Item: " + name + ", Quantity: " + quantity);
                }
            }
        } catch (Exception var10) {
            Exception e = var10;
            e.printStackTrace();
        }

    }
}