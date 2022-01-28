package com.flight.book.dto;

public class FlightResponse {

	private String message;
	private int flightId;
	
	
	public FlightResponse(String message, int flightId) {
		super();
		this.message = message;
		this.flightId = flightId;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	
	
	
}
