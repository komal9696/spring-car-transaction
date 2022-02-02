package com.transaction.SpringcarTransaction.Entry;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


	@Entity
	public class Appointment {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long AppointmentNumber;
		private Date date;
		private String Showroomname;
		private String Showroomaddress;
		private Long patientNumber;
		public Long getAppointmentNumber() {
			return AppointmentNumber;
		}
		public void setAppointmentNumber(Long appointmentNumber) {
			AppointmentNumber = appointmentNumber;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public String getShowroomname() {
			return Showroomname;
		}
		public void setShowroomname(String showroomname) {
			Showroomname = showroomname;
		}
		public String getShowroomaddress() {
			return Showroomaddress;
		}
		public void setShowroomaddress(String showroomaddress) {
			Showroomaddress = showroomaddress;
		}
		public Long getPatientNumber() {
			return patientNumber;
		}
		public void setPatientNumber(Long patientNumber) {
			this.patientNumber = patientNumber;
		}
		public Appointment(Long appointmentNumber, Date date, String showroomname, String showroomaddress,
				Long patientNumber) {
			super();
			AppointmentNumber = appointmentNumber;
			this.date = date;
			Showroomname = showroomname;
			Showroomaddress = showroomaddress;
			this.patientNumber = patientNumber;
		}
		public Appointment(Date date2, long l, Long carNumber) {
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Appoinment [AppointmentNumber=" + AppointmentNumber + ", date=" + date + ", Showroomname="
					+ Showroomname + ", Showroomaddress=" + Showroomaddress + ", patientNumber=" + patientNumber + "]";
		}

}
