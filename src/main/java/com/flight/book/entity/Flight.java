package com.flight.book.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;

@Entity
public class Flight {
	
	private int flightId;
	private String airlineName;
	private String flightName;
	private String source;
	private String destination;
	private LocalDateTime time;
	private int amount;
	public Flight(String airlineName, String flightName, String source, String destination, LocalDateTime time,
			int amount) {
		super();
		this.airlineName = airlineName;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.time = time;
		this.amount = amount;
	}
	public Flight() {
		super();
	}
	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	

}
