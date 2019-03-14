package com.ebee

class Patient {

	String patientName
	String patientAddress
	String patientResidence
	Date patientDob
	String patientID
	Date dateRegistered
	String patientPhone

    static constraints = {

	patientName nullable: false, blank: false
	patientAddress nullable: false, blank: false
	patientResidence nullable: false, blank: false
	patientDob nullable: false, blank: false
	patientID nullable: false, blank: false, unique: true
	dateRegistered nullable: false, blank: false, maxLength:5000, widget:'textarea'	
	patientPhone nullable: false, blank: false
    }
}
