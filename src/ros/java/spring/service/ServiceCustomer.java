package ros.java.spring.service;

import ros.java.spring.entity.EntityCustomer;
import java.util.List;

public interface ServiceCustomer {

    List<EntityCustomer> getCustomers();
    void addCustomer(EntityCustomer customer);
}
