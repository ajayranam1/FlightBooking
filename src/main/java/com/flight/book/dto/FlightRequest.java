package com.flight.book.dto;

import java.sql.Time;

public class FlightRequest {

	private String flight_name;
	private String airline_name;
	private String source_name;
	private String dest_name;
	private Time time;
	private int amount;
	
	
	public FlightRequest(String flight_name, String airline_name, String source_name, String dest_name, Time time,
			int amount) {
		super();
		this.flight_name = flight_name;
		this.airline_name = airline_name;
		this.source_name = source_name;
		this.dest_name = dest_name;
		this.time = time;
		this.amount = amount;
	}
	public String getFlight_name() {
		return flight_name;
	}
	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}
	public String getAirline_name() {
		return airline_name;
	}
	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}
	public String getSource_name() {
		return source_name;
	}
	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}
	public String getDest_name() {
		return dest_name;
	}
	public void setDest_name(String dest_name) {
		this.dest_name = dest_name;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
}
