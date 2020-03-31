package sk.itsovy.project.ros.dao;

import sk.itsovy.project.ros.entity.EntityRestaurant;

import java.util.List;

/**
 * @author Martin Dolinsky
 */
public interface RestaurantDAO {
	public List<EntityRestaurant> getRestaurants();

	void saveRestaurant(EntityRestaurant restaurant);
}
