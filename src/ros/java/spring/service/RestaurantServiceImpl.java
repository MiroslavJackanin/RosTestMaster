package sk.itsovy.project.ros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sk.itsovy.project.ros.entity.EntityRestaurant;
import sk.itsovy.project.ros.dao.RestaurantDAO;

import java.util.List;

/**
 * @author Martin Dolinsky
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	private RestaurantDAO restaurantDAO;

	@Override
	@Transactional
	public List<EntityRestaurant> getRestaurants() {
		return restaurantDAO.getRestaurants();
	}

	@Override
	@Transactional
	public void saveRestaurant(EntityRestaurant restaurant) {
		restaurantDAO.saveRestaurant(restaurant);

	}
}
