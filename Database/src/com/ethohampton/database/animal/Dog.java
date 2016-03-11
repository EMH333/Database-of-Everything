package com.ethohampton.database.animal;

public class Dog extends AnimalObject {

	private DogType type;


	/**
	 * Creates a dog
	 * 
	 * @param gender
	 * @param health
	 * @param isAdult
	 */
	public Dog(Gender gender, float health, boolean adult) {
		this.isAlive = true;
		this.gender = gender;
		this.health = health;
		this.isAdult = adult;
	}

	
	/**
	 * @return the type
	 */
	public DogType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(DogType type) {
		this.type = type;
	}
}
