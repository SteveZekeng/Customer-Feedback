package com.ubagroup.Api.entities;

public enum AttitudeAgent {
	
	souriant(0), nonsouriant(1), ecouteActivePositive(2), nonEcouteActivePositive(3), resolutionEffective(4),
	
	nonResolutionEffective(5), aurevoirEtMerci(6), nonAurevoirEtMerci(7);
	
	int attitude;
	
	private AttitudeAgent(int attitude) {
		this.attitude = attitude;
	}

	public int getAttitude() {
		return attitude;
	}

	

}
