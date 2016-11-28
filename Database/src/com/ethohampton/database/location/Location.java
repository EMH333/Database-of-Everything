package com.ethohampton.database.location;

import java.util.Date;

public class Location {

	private double latitude;
	private double longitude;
	private double altitude;

	private boolean isRelative;

	private double x;
	private double y;
	private double z;

	private boolean hasRotation;
	private double xRotation;
	private double yRotation;

	private Date time;

	public Location() {
		time = new Date();
		hasRotation = false;
		isRelative = false;
	}

	public Location(boolean isRelative, double x, double y) {
		if (isRelative) {
			this.isRelative = true;
			this.x = x;
			this.y = y;
		} else {
			this.isRelative = false;
			this.latitude = x;
			this.longitude = y;
		}
	}

	public Location(boolean isRelative, double x, double y, double z) {
		if (isRelative) {
			this.isRelative = true;
			this.x = x;
			this.y = y;
			this.z = z;
		} else {
			this.isRelative = false;
			this.latitude = x;
			this.longitude = y;
			this.altitude = z;
		}
	}

	public Location(boolean isRelative, double x, double y, double z, double xRot, double yRot) {
		if (isRelative) {
			this.isRelative = true;
			this.x = x;
			this.y = y;
			this.z = z;
			this.xRotation = xRot;
			this.yRotation = yRot;
		} else {
			this.isRelative = false;
			this.latitude = x;
			this.longitude = y;
			this.altitude = z;
			this.xRotation = xRot;
			this.yRotation = yRot;
		}
	}

	public Location(boolean isRelative, double x, double y, double xRot, double yRot) {
		if (isRelative) {
			this.isRelative = true;
			this.x = x;
			this.y = y;
			this.xRotation = xRot;
			this.yRotation = yRot;
		} else {
			this.isRelative = false;
			this.latitude = x;
			this.longitude = y;
			this.xRotation = xRot;
			this.yRotation = yRot;
		}
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the altitude
	 */
	public double getAltitude() {
		return altitude;
	}

	/**
	 * @param altitude
	 *            the altitude to set
	 */
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	/**
	 * @return the isRelative
	 */
	public boolean isRelative() {
		return isRelative;
	}

	/**
	 * @param isRelative
	 *            the isRelative to set
	 */
	public void setRelative(boolean isRelative) {
		this.isRelative = isRelative;
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * @return the z
	 */
	public double getZ() {
		return z;
	}

	/**
	 * @param z
	 *            the z to set
	 */
	public void setZ(double z) {
		this.z = z;
	}

	/**
	 * @return the xRotation
	 */
	public double getxRotation() {
		return xRotation;
	}

	/**
	 * @param xRotation
	 *            the xRotation to set
	 */
	public void setxRotation(double xRotation) {
		this.xRotation = xRotation;
	}

	/**
	 * @return the yRotation
	 */
	public double getyRotation() {
		return yRotation;
	}

	/**
	 * @param yRotation
	 *            the yRotation to set
	 */
	public void setyRotation(double yRotation) {
		this.yRotation = yRotation;
	}

	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * @return the hasRotation
	 */
	public boolean hasRotation() {
		return hasRotation;
	}

	/**
	 * @param hasRotation
	 *            the hasRotation to set
	 */
	public void SetHasRotation(boolean hasRotation) {
		this.hasRotation = hasRotation;
	}
}
