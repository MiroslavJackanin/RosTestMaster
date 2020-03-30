package ros.java.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ros.java.spring.entity.EntityCustomer;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class DAOCustomerImpl implements DAOCustomer {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<EntityCustomer> getCustomers() {

        Session session = sessionFactory.getCurrentSession();
        Query<EntityCustomer> query = session.createQuery("from EntityCustomer ORDER BY customerLastName", EntityCustomer.class);

        return query.getResultList();
    }

    @Override
    public void addCustomer(EntityCustomer customer) {

        customer.setRegistrationDate(new Timestamp(System.currentTimeMillis()));

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customer);
    }

    @Override
    public EntityCustomer getCustomer(int id) {

        Session session = sessionFactory.getCurrentSession();
        return session.get(EntityCustomer.class, id);
    }

    @Override
    public void deleteCustomer(int theId) {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("DELETE FROM EntityCustomer WHERE customerId=:customerId");
        query.setParameter("customerId", theId);
        query.executeUpdate();
    }
}
