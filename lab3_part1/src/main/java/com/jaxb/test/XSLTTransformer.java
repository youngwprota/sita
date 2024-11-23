package com.jaxb.test;

import java.io.File;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XSLTTransformer {
    public XSLTTransformer() {
    }

    public static void main(String[] args) {
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Source xslt = new StreamSource(new File("order.xslt"));
            Transformer transformer = factory.newTransformer(xslt);
            Source text = new StreamSource(new File("order.xml"));
            transformer.transform(text, new StreamResult(new File("output.html")));
            System.out.println("Transformation complete.");
        } catch (Exception var5) {
            Exception e = var5;
            e.printStackTrace();
        }

    }
}