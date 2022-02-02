package com.transaction.SpringcarTransaction.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction.SpringcarTransaction.Entry.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Long>{

}
