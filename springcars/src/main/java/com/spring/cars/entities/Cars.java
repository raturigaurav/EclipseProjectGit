package com.spring.cars.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cars {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;
	private String carName;
	private String carComp;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarComp() {
		return carComp;
	}
	public void setCarComp(String carComp) {
		this.carComp = carComp;
	}
	
	protected Cars(int no, String carName, String carComp) {
		super();
		this.no = no;
		this.carName = carName;
		this.carComp = carComp;
	}
	protected Cars() {
		super();
	}
	
	

	

}
