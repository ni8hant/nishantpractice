package com.nishant.outputfind;

public class Outputfind extends Driver {

	public static void main(String[] args) {

		Driver d = new Driver();
		d.getDetails();

	}

	protected final void getDetails() {
		System.out.println("Test Class");
	}

}

class Driver {
	protected void getDetails() {
		System.out.println("Drived Class");

	}
}
