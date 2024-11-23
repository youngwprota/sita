package com.jaxb.test;


import java.io.File;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;

public class XMLValidator {
    public XMLValidator() {
    }

    public static void main(String[] args) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
            Schema schema = factory.newSchema(new File("order.xsd"));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File("order.xml")));
            System.out.println("XML is valid.");
        } catch (SAXException var4) {
            SAXException e = var4;
            System.out.println("XML is not valid: " + e.getMessage());
        } catch (Exception var5) {
            Exception e = var5;
            e.printStackTrace();
        }

    }
}