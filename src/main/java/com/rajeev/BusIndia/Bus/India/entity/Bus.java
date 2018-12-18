package com.rajeev.BusIndia.Bus.India.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Bus")
public class Bus extends InheritanceId{
	@Column(name="busNo")
	private String busNo;
	
	@Column(name="busName")
	private String busName;
	
	@Column(name="depatureCity")
	private String depatureCity;
	
	@Column(name="arrivalCity")
	private String arrivalCity;
	
	@Column(name="dateOfDeparture")
	private Date dateOfDeparture;
	
	@Column(name="estimatedDepartureTime")
	private Timestamp estimatedDepartureTime;

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getDepatureCity() {
		return depatureCity;
	}

	public void setDepatureCity(String depatureCity) {
		this.depatureCity = depatureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	
}
