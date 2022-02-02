package com.transaction.SpringcarTransaction.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction.SpringcarTransaction.Entry.Appointment;





@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long>{

}