package com.transaction.SpringcarTransaction.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.SpringcarTransaction.Controller.dto.AppointmentFormDto;
import com.transaction.SpringcarTransaction.Service.BookAppointmentService;

@RestController
public class BookCarAppoinment {

	@Autowired
	private BookAppointmentService bookAppointmentService;
	
	@PostMapping("/car")
	public String bookAppointment(@RequestBody AppointmentFormDto appointmentFormDto) {
		return bookAppointmentService.bookAppointment(appointmentFormDto);
		
	}
}
