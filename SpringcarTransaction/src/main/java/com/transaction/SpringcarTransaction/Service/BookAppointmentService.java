package com.transaction.SpringcarTransaction.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.transaction.SpringcarTransaction.Controller.dto.AppointmentFormDto;
import com.transaction.SpringcarTransaction.Entry.Appointment;
import com.transaction.SpringcarTransaction.Entry.Car;
import com.transaction.SpringcarTransaction.Repository.AppointmentRepo;
import com.transaction.SpringcarTransaction.Repository.CarRepo;

public class BookAppointmentService {
	@Autowired
	private AppointmentRepo appointmentRepo;

	@Autowired
	private CarRepo carRepo;

	public String bookAppointment(AppointmentFormDto appointmentFormDto) {

	Car c = new ObjectMapper().convertValue(appointmentFormDto, Car.class);

		Long carNumber = carRepo.save(c).getCarNumber();

		System.out.println("Patient saved successfully.");
		Appointment appointment = new Appointment(new Date(System.currentTimeMillis()), 101L, carNumber);



		Long appointmentNumber = appointmentRepo.save(appointment).getAppointmentNumber();

		return "Appointment Confirmed."+appointmentNumber;
	}


}
