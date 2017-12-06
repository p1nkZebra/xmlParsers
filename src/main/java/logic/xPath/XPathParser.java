package logic.xPath;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;

public class XPathParser {

    public void parse(String fileName) {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(fileName);

            printCost(document);
            printCost2(document);
            printCost3(document);
            printCost4(document);
            printCost5(document);

        } catch (XPathExpressionException | ParserConfigurationException | SAXException | IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    // Печать всех элементов Cost
    private static void printCost(Document document) throws DOMException, XPathExpressionException {
        System.out.println("Example 1 - Печать всех элементов Cost");
        XPathFactory pathFactory = XPathFactory.newInstance();
        XPath xpath = pathFactory.newXPath();

        // Пример записи XPath
        // Полный путь до элемента
        //XPathExpression expr = xpath.compile("BookCatalogue/Book/Cost");
        // Все элементы с таким именем
        //XPathExpression expr = xpath.compile("//Cost");
        // Элементы, вложенные в другой элемент
        XPathExpression expression = xpath.compile("//Book/Cost");

        NodeList nodes = (NodeList) expression.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < nodes.getLength(); i++) {
            Node n = nodes.item(i);
            System.out.println("Value:" + n.getTextContent());
        }
        System.out.println();
    }
    // Печать элемента Cost у которого атрибут currency='USD'
    private static void printCost2(Document document) throws DOMException, XPathExpressionException {
        System.out.println("Example 2 - Печать элемента Cost у которого атрибут currency='USD'");
        XPathFactory pathFactory = XPathFactory.newInstance();
        XPath xpath = pathFactory.newXPath();
        XPathExpression expr = xpath.compile("BookCatalogue/Book/Cost[@currency='USD']");
        NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < nodes.getLength(); i++) {
            Node n = nodes.item(i);
            System.out.println("Value:" + n.getTextContent());
        }
        System.out.println();
    }

    // Печать элементов Book у которых значение Cost > 4
    private static void printCost3(Document document) throws DOMException, XPathExpressionException {
        System.out.println("Example 3 - Печать элементов Book у которых значение Cost > 4");
        XPathFactory pathFactory = XPathFactory.newInstance();
        XPath xpath = pathFactory.newXPath();
        XPathExpression expression = xpath.compile("BookCatalogue/Book[Cost>4]");
        NodeList nodes = (NodeList) expression.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < nodes.getLength(); i++) {
            Node n = nodes.item(i);
            System.out.println("Value:" + n.getTextContent());
        }
        System.out.println();
    }
    // Печать первого элемента Book
    private static void printCost4(Document document) throws DOMException, XPathExpressionException {
        System.out.println("Example 4 - Печать первого элемента Book");
        XPathFactory pathFactory = XPathFactory.newInstance();
        XPath xpath = pathFactory.newXPath();
        XPathExpression expression = xpath.compile("BookCatalogue/Book[2]");
        NodeList nodes = (NodeList) expression.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < nodes.getLength(); i++) {
            Node n = nodes.item(i);
            System.out.println("Value:" + n.getTextContent());
        }
        System.out.println();
    }

    // Печать цены книги у которой Title начинается с Yogasana
    // Варианты доступа к относительным узлам:
    // ancestor , ancestor-or-self, descendant, descendant-or-self
    // following, following-sibling, namespace, preceding, preceding-sibling
    private static void printCost5(Document document) throws DOMException, XPathExpressionException {
        System.out.println("Example 5 - Печать цены книги у которой Title начинается с 'Yogasana'");
        XPathFactory pathFactory = XPathFactory.newInstance();
        XPath xpath = pathFactory.newXPath();
        XPathExpression expression = xpath.compile("BookCatalogue/Book/Cost"
                + "[starts-with(preceding-sibling::Title, 'Yogasana')"
                + " or "
                + "starts-with(following-sibling::Title, 'Yogasana')]");
        NodeList nodes = (NodeList) expression.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < nodes.getLength(); i++) {
            Node n = nodes.item(i);
            System.out.println("Value:" + n.getTextContent());
        }
        System.out.println();
    }
}
