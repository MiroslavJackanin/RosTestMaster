package ros.java.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ros.java.spring.entity.EntityCustomer;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class DAOCustomerImpl implements DAOCustomer {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<EntityCustomer> getCustomers() {

        Session session = sessionFactory.getCurrentSession();

        Query<EntityCustomer> query = session.createQuery("from EntityCustomer", EntityCustomer.class);

        return query.getResultList();
    }
}
