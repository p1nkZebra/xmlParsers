package logic.jaxb;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {

    @XmlElement(name="name")
    private String customerName;

    @XmlElement(name="age")
    private int customerAge;

    @XmlAttribute(name="id")
    private int customerId;


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("name='").append(customerName).append('\'');
        sb.append(", age=").append(customerAge);
        sb.append(", id=").append(customerId);
        sb.append('}');
        return sb.toString();
    }
}
