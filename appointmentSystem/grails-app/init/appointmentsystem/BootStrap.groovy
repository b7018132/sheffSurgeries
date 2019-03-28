package com.ebee

class BootStrap {

    def init = { servletContext ->
	/* def doctorJones=new Doctor(
	doctorName: 'Jonathor Jones',
	qualifications: 'A-Level',
	position: 'Dr',
	doctorEmail: 'jonathon@email.com',
	password: 'password',
	doctorOffice: '505',
	doctorPhone: '07523478',
	bio: 'His position is not suitable sorry').save()

	def doctorBee=new Doctor(
	doctorName: 'Edward Bee',
	qualifications: 'A-Level',
	position: 'Dr',
	doctorEmail: 'edward@email.com',
	password: 'password',
	doctorOffice: '503',
	doctorPhone: '075333478',
	bio: 'Im actually scared of blood').save()

	def Paracetamol=new Prescription(
	pharmacyName: 'Sharrow',
	prescripNumber: 1,
	medicine: 'Para',
	totalCost: 1.10,
	dateIssued: new Date('15/03/2019'),
	patientPaying: true).save()

	def Ibuprofen=new Prescription(
	pharmacyName: 'Sharrow',
	prescripNumber: 2,
	medicine: 'Ibur',
	totalCost: 1.20,
	dateIssued: new Date('16/03/2019'),
	patientPaying: true).save()

	def Joe=new Patient(
	patientName: 'Joseph',
	patientAddress: '57 Kennel Lane',
	patientResidence: 'Guildford',
	patientDob: new Date('16/03/1999'),
	patientID: 'JG',
	dateRegistered: new Date('16/01/2019'),
	patientPhone: '5893483').save()

	def Bryn=new Patient(
	patientName: 'Bryn',
	patientAddress: '47 Kennel Lane',
	patientResidence: 'Sheffield',
	patientDob: new Date('16/03/1999'),
	patientID: 'J',
	dateRegistered: new Date('16/01/2019'),
	patientPhone: '589333483').save()
	
	def louis=new Nurse(
	nurseName: 'louis bee',
	qualifications: 'A-Level',
	nurseEmail: 'louis@email.com',
	nurseOffice: '502',
	nursePhone: '3022002').save()

	def andrew=new Nurse(
	nurseName: 'andrew bee',
	qualifications: 'A-Level',
	nurseEmail: 'andrew@email.com',
	nurseOffice: '102',
	nursePhone: '30221002').save()

	def sharrow=new Surgery(
	name: 'Sharrow',
	address: '123 sharrow road',
	postcode: '58348',
	telephone: '1283489',
	numberOfPatients: 12,
	description: 'Best Surgery',
	openingTime: 9.30,
	closingTime: 17.30,
	registeringNewPatients: true).save()

	def broomhill=new Surgery(
	name: 'Broomhill',
	address: '123 broomhill road',
	postcode: '5834g8',
	telephone: '1283g89',
	numberOfPatients: 17,
	description: 'Worst Surgery',
	openingTime: 9.30,
	closingTime: 17.30,
	registeringNewPatients: true).save()

	def mike=new Receptionist(
	recepName: 'Mike',
	recepEmail: 'mike@email.com',
	recepUsername: 'mike12',
	recepPassword: 'password',
	recepPhone: '02839028').save()

	def test=new Receptionist(
	recepName: 'test',
	recepEmail: 'mike@email.com',
	recepUsername: 'testing',
	recepPassword: 'password',
	recepPhone: '02839028').save()
	
	def brokenleg=new Appointment(
	appDate: new Date('16/01/2019'),
	appTime: 15.00,
	appDuration: 45,
	roomNumber: '13402',
	patientName: Joe).save()

	def brokenarm=new Appointment(
	appDate: new Date('16/01/2009'),
	appTime: 14.00,
	appDuration: 45,
	roomNumber: '13402',
	patientName: Bryn).save()


patientName:Joe
brokenleg.addToSurgeries(sharrow) */


    }
    def destroy = {
    }
}
