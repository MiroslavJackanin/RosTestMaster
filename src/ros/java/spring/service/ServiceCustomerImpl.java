package ros.java.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ros.java.spring.dao.DAOCustomer;
import ros.java.spring.entity.EntityCustomer;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class ServiceCustomerImpl implements ServiceCustomer {

    @Autowired
    private DAOCustomer daoCustomer;

    @Override
    @Transactional
    public List<EntityCustomer> getCustomers() {
        return daoCustomer.getCustomers();
    }

    @Override
    @Transactional
    public void addCustomer(EntityCustomer customer) {
        daoCustomer.addCustomer(customer);
    }

    @Override
    @Transactional
    public EntityCustomer getCustomer(int id) {

        return daoCustomer.getCustomer(id);
    }

    @Override
    @Transactional
    public void deleteCustomer(int id) {

        daoCustomer.deleteCustomer(id);
    }
}
