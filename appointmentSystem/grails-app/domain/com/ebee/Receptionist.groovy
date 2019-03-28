package com.ebee

class Receptionist {

	
	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	String recepPhone
	
	String toString(){
	return recepName
	}

    static constraints = {

	recepName nullable: false, blank: false
	recepEmail nullable: false, blank: false, email: true
	recepUsername nullable: false, blank: false, unique:true
	recepPassword nullable: false, blank: false, password:true
	recepPhone nullable: false, blank: false
    }
}
