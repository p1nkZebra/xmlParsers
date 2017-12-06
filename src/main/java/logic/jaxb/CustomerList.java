package logic.jaxb;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name="customers")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerList {

    @XmlElement(name="customer")
    private List<Customer> customerList;

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerList{");
        sb.append("customers=").append(customerList);
        sb.append('}');
        return sb.toString();
    }
}
