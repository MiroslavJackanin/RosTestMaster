package ros.java.spring.dao;

import ros.java.spring.entity.EntityCustomer;

import java.util.List;

public interface DAOCustomer {

    List<EntityCustomer> getCustomers();
}
