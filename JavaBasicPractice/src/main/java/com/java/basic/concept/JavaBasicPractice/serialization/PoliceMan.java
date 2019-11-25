package com.java.basic.concept.JavaBasicPractice.serialization;

public class PoliceMan extends Person {

	private String stationName;
	private String locality;
	private int hoursworked;
	private PrintOne printone;

	public PoliceMan() {
		super();
	}

	public PoliceMan(String stationNam, String locality, int hoursworked, PrintOne printone) {
		super();
		this.stationName = stationName;
		this.locality = locality;
		this.hoursworked = hoursworked;
		this.printone = printone;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public int getHoursworked() {
		return hoursworked;
	}

	public void setHoursworked(int hoursworked) {
		this.hoursworked = hoursworked;
	}

	public PrintOne getPrintone() {
		return printone;
	}

	public void setPrintone(PrintOne printone) {
		this.printone = printone;
	}

	@Override
	public String toString() {
		return String.format(
				"PoliceMan [stationName=%s, locality=%s, hoursworked=%s, printone=%s, getAge()=%s, getFirstName()=%s, getLastName()=%s, getDateOfBirth()=%s, getHeight()=%s, getNationality()=%s]",
				stationName, locality, hoursworked, printone, getAge(), getFirstName(), getLastName(), getDateOfBirth(),
				getHeight(), getNationality());
	}

}
