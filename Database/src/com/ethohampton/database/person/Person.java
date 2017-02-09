package com.ethohampton.database.person;

import java.util.ArrayList;
import java.util.HashMap;

import com.ethohampton.database.car.Car;
import com.ethohampton.database.location.Location;

public class Person extends com.ethohampton.database.object.Object {

	private Gender gender;
	private HashMap<String, Location> locations;
	private ArrayList<Car> cars;

	public Person() {
		super();

	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * @return the locations
	 */
	public HashMap<String, Location> getLocations() {
		return locations;
	}

	/**
	 * @param locations
	 *            the locations to set
	 */
	public void setLocations(HashMap<String, Location> locations) {
		this.locations = locations;
	}

	public void addLocation(Location location) {
		locations.put(location.getUuid().toString(), location);
	}

	/**
	 * @return the cars
	 */
	public ArrayList<Car> getCars() {
		return cars;
	}

	/**
	 * @param cars
	 *            the cars to set
	 */
	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}

	public void addCar(Car car) {
		cars.add(car);
	}

}
