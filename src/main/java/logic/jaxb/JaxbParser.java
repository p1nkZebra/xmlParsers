package logic.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class JaxbParser {

    public Customer parse(String fileName) {
        try {
            File file = new File(fileName);
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return (Customer) jaxbUnmarshaller.unmarshal(file);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }


    public CustomerList parseList(String fileName) {
        try {
            File file = new File(fileName);
            JAXBContext jaxbContext = JAXBContext.newInstance(CustomerList.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            CustomerList parsedCustomerList = (CustomerList)jaxbUnmarshaller.unmarshal(file);

            return  parsedCustomerList;

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;

    }
}
