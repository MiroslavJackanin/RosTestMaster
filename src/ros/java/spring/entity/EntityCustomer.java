package ros.java.spring.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "customer", schema = "restaurantOrderingSystem")
public class EntityCustomer {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @Column(name = "first_name", nullable = false, length = 50)
    private String customerFirstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String customerLastName;

    @Column(name = "email", nullable = false, length = 100)
    private String customerEmail;

    @Column(name = "phoneNumber", nullable = false, length = 100)
    private String customerPhone;

    @Column(name = "password", nullable = false, length = 100)
    private String customerPassword;

    @Transient
    private String customerCheckPassword;

    @Column(name = "registrationDate", nullable = false)
    private Timestamp registrationDate;

    public EntityCustomer() {
    }
    public EntityCustomer(String customerFirstName, String customerLastName, String customerPassword, String customerCheckPassword, String customerEmail, String customerPhone, Timestamp registrationDate){
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.customerPassword = customerPassword;
        this.customerCheckPassword = customerCheckPassword;
        this.registrationDate = registrationDate;
    }

    public int getCustomerId() {
        return customerId;
    }
    public String getCustomerFirstName() {
        return customerFirstName;
    }
    public String getCustomerLastName(){
        return customerLastName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }
    public String getCustomerPassword() {
        return customerPassword;
    }
    public String getCustomerCheckPassword() {
        return customerCheckPassword;
    }
    public Timestamp getRegistrationDate() {
        return registrationDate;
    }

    public void setCustomerId(int id) {
        this.customerId = id;
    }
    public void setCustomerFirstName(String firstName) {
        this.customerFirstName = firstName;
    }
    public void setCustomerLastName(String lastName){
        this.customerLastName = lastName;
    }
    public void setCustomerEmail(String email) {
        this.customerEmail = email;
    }
    public void setCustomerPhone(String phone) {
        this.customerPhone = phone;
    }
    public void setCustomerPassword(String password) {
        this.customerPassword = password;
    }
    public void setCustomerCheckPassword(String customerCheckPassword) {
        this.customerCheckPassword = customerCheckPassword;
    }
    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "EntityCustomer{" +
                "id=" + customerId +
                ", firstName='" + customerFirstName + '\'' +
                ", lastName='" + customerLastName + '\'' +
                ", email='" + customerEmail + '\'' +
                ", phone='" + customerPhone + '\'' +
                ", password='" + customerPassword + '\'' +
                ", checkPassword='" + customerCheckPassword + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityCustomer that = (EntityCustomer) o;
        return customerId == that.customerId &&
                Objects.equals(customerFirstName, that.customerFirstName) &&
                Objects.equals(customerLastName, that.customerLastName) &&
                Objects.equals(customerEmail, that.customerEmail) &&
                Objects.equals(customerPhone, that.customerPhone) &&
                Objects.equals(customerPassword, that.customerPassword) &&
                Objects.equals(customerCheckPassword, that.customerCheckPassword) &&
                Objects.equals(registrationDate, that.registrationDate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerFirstName, customerLastName, customerEmail, customerPhone, customerPassword, customerCheckPassword,registrationDate);
    }
}
