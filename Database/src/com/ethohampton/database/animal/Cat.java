package com.ethohampton.database.animal;

public class Cat extends AnimalObject {

	private CatType type;

	/**
	 * Creates a cat
	 * 
	 * @param gender
	 * @param health
	 * @param isAdult
	 */
	public Cat(Gender gender, float health, boolean adult) {
		this.isAlive = true;
		this.gender = gender;
		this.health = health;
		this.isAdult = adult;
	}
	

	/**
	 * @return the type
	 */
	public CatType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(CatType type) {
		this.type = type;
	}

}
