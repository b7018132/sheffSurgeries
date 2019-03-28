package com.ebee

class Doctor {

	String doctorName
	String qualifications
	String position
	String doctorEmail
	String password
	String doctorOffice
	String doctorPhone
	String bio

	static hasMany=[prescriptions:Prescription, appointments:Appointment, patients:Patient, nurses:Nurse]

	String toString(){
	return doctorName
	}

    static constraints = {
	doctorName nullable: false, blank: false
	qualifications nullable: false, blank: false
	position nullable: false, blank: false
	doctorEmail nullable: false, blank: false, email: true
	password nullable: false, blank: false, password: true
	doctorOffice nullable: false, blank: false
	doctorPhone nullable: false, blank: false
	bio nullable: false, blank: false, maxSize:5000, widget:'textarea'
    }
}
