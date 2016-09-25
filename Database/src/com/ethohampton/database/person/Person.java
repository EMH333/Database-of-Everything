package com.ethohampton.database.person;

import java.util.ArrayList;
import java.util.HashMap;

import com.ethohampton.database.car.Car;
import com.ethohampton.database.location.Location;

public class Person extends com.ethohampton.database.object.Object{

	private Gender gender;
	private HashMap<String, Location> locations;
	private ArrayList<Car> cars;
	
	public Person() {
		super();
	}

}
