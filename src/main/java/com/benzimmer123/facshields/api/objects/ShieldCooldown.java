package com.benzimmer123.facshields.api.objects;

public interface ShieldCooldown {

	/**
	 * Method to get the end timestamp
	 * 
	 * @return long
	 * 
	 */
	long getEndTimeStamp();

	/**
	 * Method to get the faction id
	 * 
	 * @return String
	 * 
	 */
	String getFactionID();

	/**
	 * Method to serialize a shield
	 */
	void save();

}