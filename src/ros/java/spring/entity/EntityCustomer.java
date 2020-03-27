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
    private int id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Column(name = "registrationDate", nullable = false)
    private Timestamp registrationDate;

    public EntityCustomer() {
    }
    public EntityCustomer(String name, String password, String email, Timestamp registrationDate){
        this.name = name;
        this.email = email;
        this.password = password;
        this.registrationDate = registrationDate;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public Timestamp getRegistrationDate() {
        return registrationDate;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "EntityCustomer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityCustomer that = (EntityCustomer) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(email, that.email) &&
                Objects.equals(password, that.password) &&
                Objects.equals(registrationDate, that.registrationDate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password, registrationDate);
    }
}
