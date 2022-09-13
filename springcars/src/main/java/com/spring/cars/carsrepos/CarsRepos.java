package com.spring.cars.carsrepos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.cars.entities.Cars;

public interface CarsRepos extends JpaRepository<Cars, Integer>{

}
