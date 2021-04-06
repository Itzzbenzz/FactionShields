package com.benzimmer123.facshields.api.objects;

public interface Shield {

	/**
	 * Method to get the faction id
	 * 
	 * @return String
	 * 
	 */
	String getFactionID();

	/**
	 * Method to get the start timestamp
	 * 
	 * @return long
	 * 
	 */
	long getStartTime();

	/**
	 * Method to get the end timestamp
	 * 
	 * @return long
	 * 
	 */
	long getEndTime();

	/**
	 * Method to set if a shield is active
	 * 
	 * @param boolean active
	 * 
	 */
	void setActive(boolean active);

	/**
	 * Method to check if a shield is active
	 * 
	 * @return boolean
	 * 
	 */
	boolean isActive();

	/**
	 * Method to serialize a shield
	 */
	void save();

}
