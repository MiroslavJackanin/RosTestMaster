package sk.itsovy.project.ros.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * @author Martin Dolinsky
 */
@Entity
@Table(name = "restaurant")
public class EntityRestaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
    private int restaurantId;

	@Column(name = "ownerId", nullable = false)
	private int restaurantOwnerId;

	@Column(name = "name", nullable = false, length = 50)
	@NotNull(message = "is required")
	@Size(min = 1,message = "is required")
    private String restaurantName;

	@Column(name = "tables", nullable = false)
	@NotNull(message = "is required")
	@Min(value = 1)
	private int restaurantTables;

	@Column(name = "tags")
	private String restaurantTags;

	@Column(name = "openingHours")
	private String restaurantOpeningHours;

	@Column(name = "capacity")
	@NotNull(message = "is required")
	@Min(value = 1)
	private int restaurantCapacity;

	@Column(name = "address", nullable = false, length = 100)
	@NotNull(message = "is required")
	@Size(min = 1,message = "is required")
	private String restaurantAddress;

	@Column(name = "phoneNumber", nullable = false, length = 45)
	@NotNull(message = "is required")
	@Size(min = 1,message = "is required")
	private String restaurantPhoneNumber;

	@Column(name = "aboutRestaurant")
	private String restaurantAboutRestaurant;

	public EntityRestaurant() {
	}

	public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int id) {
        this.restaurantId = id;
    }

	public int getRestaurantOwnerId() {
		return restaurantOwnerId;
	}

	public void setRestaurantOwnerId(int restaurantOwnerId) {
		this.restaurantOwnerId = restaurantOwnerId;
	}

	public void setRestaurantCapacity(int restaurantCapacity) {
		this.restaurantCapacity = restaurantCapacity;
	}

	public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String name) {
        this.restaurantName = name;
    }

	public int getRestaurantTables() {
		return restaurantTables;
	}

	public void setRestaurantTables(int tables) {
		this.restaurantTables = tables;
	}

	public String getRestaurantTags() {
		return restaurantTags;
	}

	public void setRestaurantTags(String tags) {
		this.restaurantTags = tags;
	}

	public String getRestaurantOpeningHours() {
		return restaurantOpeningHours;
	}

	public void setRestaurantOpeningHours(String openingHours) {
		this.restaurantOpeningHours = openingHours;
	}

	public int getRestaurantCapacity() {
		return restaurantCapacity;
	}

	public void setRestaurantCapacity(Integer capacity) {
		this.restaurantCapacity = capacity;
	}

	public String getRestaurantAddress() {
		return restaurantAddress;
	}

	public void setRestaurantAddress(String address) {
		this.restaurantAddress = address;
	}

	public String getRestaurantPhoneNumber() {
		return restaurantPhoneNumber;
	}

	public void setRestaurantPhoneNumber(String phoneNumber) {
		this.restaurantPhoneNumber = phoneNumber;
	}

	public String getRestaurantAboutRestaurant() {
		return restaurantAboutRestaurant;
	}

	public void setRestaurantAboutRestaurant(String aboutRestaurant) {
		this.restaurantAboutRestaurant = aboutRestaurant;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		EntityRestaurant that = (EntityRestaurant) o;
		return restaurantId == that.restaurantId &&
				restaurantTables == that.restaurantTables &&
				Objects.equals(restaurantName, that.restaurantName) &&
				Objects.equals(restaurantTags, that.restaurantTags) &&
				Objects.equals(restaurantOpeningHours, that.restaurantOpeningHours) &&
				Objects.equals(restaurantCapacity, that.restaurantCapacity) &&
				Objects.equals(restaurantAddress, that.restaurantAddress) &&
				Objects.equals(restaurantPhoneNumber, that.restaurantPhoneNumber) &&
				Objects.equals(restaurantAboutRestaurant, that.restaurantAboutRestaurant);
	}

	@Override
	public int hashCode() {
		return Objects.hash(restaurantId, restaurantName, restaurantTables, restaurantTags, restaurantOpeningHours, restaurantCapacity, restaurantAddress, restaurantPhoneNumber, restaurantAboutRestaurant);
	}

	@Override
	public String toString() {
		return "EntityRestaurant{" +
				"restaurantId=" + restaurantId +
				", restaurantOwnerId=" + restaurantOwnerId +
				", restaurantName='" + restaurantName + '\'' +
				", restaurantTables=" + restaurantTables +
				", restaurantTags='" + restaurantTags + '\'' +
				", restaurantOpeningHours='" + restaurantOpeningHours + '\'' +
				", restaurantCapacity=" + restaurantCapacity +
				", restaurantAddress='" + restaurantAddress + '\'' +
				", restaurantPhoneNumber='" + restaurantPhoneNumber + '\'' +
				", restaurantAboutRestaurant='" + restaurantAboutRestaurant + '\'' +
				'}';
	}
}
