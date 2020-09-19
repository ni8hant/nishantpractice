package com.nishant.project;

public class Abc {

}

class TypeException extends Throwable {

	@Override
	public String toString() {
		return "Vehicle Type Not Set";
	}
}

class Vehicles {

	public String type;

	public String model_no;

	public String model_name;

	public String owner_name;

	public String owner_details;

	public Vehicles(String model_no, String model_name, String owner_name, String owner_details) {
		this.model_no = model_no;
		this.model_name = model_name;
		this.owner_name = owner_name;
		this.owner_details = owner_details;
	}

	public Vehicles() {
	}

	public String get_type() {
		return type;
	}

	public String retrieve() throws TypeException {
		return "null";
	}
}

class Car extends Vehicles {

	public Car(String model_no, String model_name, String owner_name, String owner_details) {
		super(model_no, model_name, owner_name, owner_details);
	}

	public Car() {

	}

	public String get_type() {
		return type;
	}

	public void set_type(String type) {
		this.type = type;
	}

	public String retrieve() throws TypeException {
		if (type == null) {
			throw new TypeException();
		}

		return model_no.concat(model_name).concat(owner_details).concat(owner_name);
	}
}
