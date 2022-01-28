package com.flight.book.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;

@Entity
public class Booking {

	private int bookingId;
	private int userId;
	private int flightId;
	private int noOfPassenger;
	private long bookingAmount;
	private LocalDateTime bookingTime;
	public Booking(int userId, int flightId, int noOfPassenger, long bookingAmount, LocalDateTime bookingTime) {
		super();
		this.userId = userId;
		this.flightId = flightId;
		this.noOfPassenger = noOfPassenger;
		this.bookingAmount = bookingAmount;
		this.bookingTime = bookingTime;
	}
	public Booking() {
		super();
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public int getNoOfPassenger() {
		return noOfPassenger;
	}
	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}
	public long getBookingAmount() {
		return bookingAmount;
	}
	public void setBookingAmount(long bookingAmount) {
		this.bookingAmount = bookingAmount;
	}
	public LocalDateTime getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}
	
	
	
}
