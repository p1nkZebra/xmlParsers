package logic;

import logic.jaxb.Customer;
import logic.jaxb.CustomerList;
import logic.jaxb.JaxbParser;
import logic.jaxb.JaxbWriter;
import logic.sax.SaxParser;
import logic.stax.StaxParser;
import logic.stax.StaxWriter;
import logic.xPath.XPathParser;

import javax.xml.bind.JAXB;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        SimpleDomParser simpleParser = new SimpleDomParser();
//        simpleParser.parse("testXmlFile.xml");
//
//
//        SimpleDomWriter simpleWriter = new SimpleDomWriter();
//        simpleWriter.write("testXmlFile.xml");




//        SaxParser saxParser = new SaxParser();
//        saxParser.parse("phoneBook.xml");




//        StaxParser staxParser = new StaxParser();
//        staxParser.parse("testXmlFile.xml");
//
//
//        StaxWriter staxWriter = new StaxWriter();
//        staxWriter.write("staxWriteFile.xml");




//        XPathParser xPathParser = new XPathParser();
//        xPathParser.parse("testXmlFile.xml");


//        JaxbParser jaxbParser = new JaxbParser();
//        Customer parsedCustomer = jaxbParser.parse("customerForJaxb.xml");
//        System.out.println(parsedCustomer);



//        JaxbParser jaxbParser = new JaxbParser();
//        CustomerList parsedCustomerList = jaxbParser.parseList("customerListForJaxb.xml");
//
//        List<Customer> customers = parsedCustomerList.getCustomerList();
//        if (customers != null) {
//            for (Customer customer : customers ) {
//                System.out.println(customer);
//            }
//        } else {
//            System.out.println("no customers in list");
//        }





//        Customer customer = new Customer();
//        customer.setId(100);
//        customer.setName("CustomerName");
//        customer.setAge(29);
//
//        JaxbWriter jaxbWriter = new JaxbWriter();
//        jaxbWriter.write(customer, "jaxbOutputFile.xml");

    }

}
