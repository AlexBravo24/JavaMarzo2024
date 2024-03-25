package com;

public class DivisionesLOL {

	private String liga;
	private String division;
	private String Honor;
	private int Elo;
	
public DivisionesLOL() {
		
	}

public DivisionesLOL(String liga, String division, String honor, int elo) {
	super();
	this.liga = liga;
	this.division = division;
	Honor = honor;
	Elo = elo;
}

public String getLiga() {
	return liga;
}

public void setLiga(String liga) {
	this.liga = liga;
}

public String getDivision() {
	return division;
}

public void setDivision(String division) {
	this.division = division;
}

public String getHonor() {
	return Honor;
}

public void setHonor(String honor) {
	Honor = honor;
}

public int getElo() {
	return Elo;
}

public void setElo(int elo) {
	Elo = elo;
}

@Override
public String toString() {
	return "DivisionesLOL [liga=" + liga + ", division=" + division + ", Honor=" + Honor + ", Elo=" + Elo + "]";
}
	

	
	
	
	
	
	
	
	
	
}
