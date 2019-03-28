package com.ebee

class Surgery {

	String name
	String address
	String postcode
	String telephone
	int numberOfPatients
	String description
	float openingTime
	float closingTime
	Boolean registeringNewPatients

	static hasMany=[doctors:Doctor, receptionists:Receptionist, nurses:Nurse, patients:Patient, appointments:Appointment]

	String toString(){
	return name
	}



    static constraints = {
	name nullable: false, blank: false
	address nullable: false, blank: false
	postcode nullable: false, blank: false
	telephone nullable: false, blank: false
	numberOfPatients nullable: false, blank: false
	description nullable: false, blank: false, maxLength:5000, widget:'textarea'	
	openingTime nullable: false, blank: false
	closingTime nullable: false, blank: false
	registeringNewPatients nullable: false, blank: false
	
	
    }
}
