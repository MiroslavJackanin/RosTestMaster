package sk.itsovy.project.ros.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sk.itsovy.project.ros.entity.EntityRestaurant;


import java.util.List;

/**
 * @author Martin Dolinsky
 */
@Repository
public class RestaurantDAOImpl implements RestaurantDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<EntityRestaurant> getRestaurants() {
		Session session = sessionFactory.getCurrentSession();
		Query<EntityRestaurant> query = session.createQuery("from EntityRestaurant", EntityRestaurant.class);
		return query.getResultList();
	}

	@Override
	public void saveRestaurant(EntityRestaurant restaurant) {
		Session session = sessionFactory.getCurrentSession();
		session.save(restaurant);
	}
}
