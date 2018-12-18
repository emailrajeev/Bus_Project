package com.rajeev.BusIndia.Bus.India.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Reservation")
public class Reservation extends InheritanceId{
	private Boolean entry;
	private int numberOfBang;
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private Bus bus;
	public Boolean getEntry() {
		return entry;
	}
	public void setEntry(Boolean entry) {
		this.entry = entry;
	}
	public int getNumberOfBang() {
		return numberOfBang;
	}
	public void setNumberOfBang(int numberOfBang) {
		this.numberOfBang = numberOfBang;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	
	
}
