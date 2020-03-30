package ros.java.spring.dao;

import ros.java.spring.entity.EntityCustomer;
import java.util.List;

public interface DAOCustomer {

    List<EntityCustomer> getCustomers();
    void addCustomer(EntityCustomer customer);

    EntityCustomer getCustomer(int id);

    void deleteCustomer(int id);

/*
    boolean validateForm(EntityCustomer customer, String checkPassword);
*/
}
