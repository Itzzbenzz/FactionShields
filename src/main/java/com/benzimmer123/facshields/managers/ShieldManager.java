package com.benzimmer123.facshields.managers;

import com.benzimmer123.facshields.api.objects.Shield;

public class ShieldManager {

	/**
	 * Method to check if a faction has a stored shield
	 *
	 * @param String facID
	 * @return boolean
	 * 
	 */
	public boolean hasShield(String facID) {
		return false;
	}

	/**
	 * Method to check if a faction has an active shield
	 *
	 * @param String facID
	 * @return boolean
	 * 
	 */
	public boolean checkActive(String facID) {
		return false;
	}

	/**
	 * Method to check if a faction has a cooldown
	 *
	 * @param String facID
	 * @return boolean
	 * 
	 */
	public boolean hasCooldown(String facID) {
		return false;
	}

	/**
	 * Method to remove a factions shield
	 *
	 * @param String facID
	 * 
	 */
	public void removeShield(String facID) {
	}

	/**
	 * Method to remove a factions shield
	 *
	 * @param Shield shield
	 * 
	 */
	public void removeShield(Shield shield) {
	}
}
