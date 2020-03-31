package sk.itsovy.project.ros.service;

import sk.itsovy.project.ros.entity.EntityRestaurant;

import java.util.List;

/**
 * @author Martin Dolinsky
 */
public interface RestaurantService {

	public List<EntityRestaurant> getRestaurants();

	void saveRestaurant(EntityRestaurant restaurant);

}
