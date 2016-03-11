package com.ethohampton.database.animal;

import com.ethohampton.database.objects.Object;

public class AnimalObject extends Object {

	boolean isAlive;
	float health;
	float hunger;
	Gender gender;
	boolean isAdult;
	float age;
	Object[] eats;

	/**
	 * @return the age
	 */
	public float getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(float age) {
		this.age = age;
	}

	/**
	 * @return the health
	 */
	public float getHealth() {
		return health;
	}

	/**
	 * @param health
	 *            the health to set
	 */
	public void setHealth(float health) {
		this.health = health;
	}

	/**
	 * @return the hunger
	 */
	public float getHunger() {
		return hunger;
	}

	/**
	 * @param hunger
	 *            the hunger to set
	 */
	public void setHunger(float hunger) {
		this.hunger = hunger;
	}

	/**
	 * @return the eats
	 */
	public Object[] getEats() {
		return eats;
	}

	/**
	 * @param eats
	 *            the eats to set
	 */
	public void setEats(Object[] eats) {
		this.eats = eats;
	}

	/**
	 * @return the isAlive
	 */
	public boolean isAlive() {
		return isAlive;
	}

	/**
	 * @param isAlive
	 *            the isAlive to set
	 */
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	/**
	 * @return the isAdult
	 */
	public boolean isAdult() {
		return isAdult;
	}

	/**
	 * @param isAdult
	 *            the isAdult to set
	 */
	public void setAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}

}
