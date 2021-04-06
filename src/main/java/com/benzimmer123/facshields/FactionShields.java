package com.benzimmer123.facshields;

import com.benzimmer123.facshields.managers.ShieldManager;

public class FactionShields {
	
	private static final FactionShields instance = new FactionShields();
	private static final ShieldManager shieldManager = new ShieldManager();

	public static FactionShields getInstance() {
		return instance;
	}

	public ShieldManager getShieldManager() {
		return shieldManager;
	}

}