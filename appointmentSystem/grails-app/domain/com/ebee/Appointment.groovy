package com.ebee

class Appointment {

	Date appDate
	float appTime
	int appDuration
	String roomNumber
	Patient patientName

	static hasMany=[surgeries:Surgery]
	static belongsTo=[Surgery]

	String toString(){
	return patientName
	}

	

    static constraints = {

		
	appDate nullable: false, blank: false
	appTime nullable: false, blank: false
	appDuration nullable: false, blank: false
	roomNumber nullable: false, blank: false
	patientName nullable: false, blank: false
    }
}
