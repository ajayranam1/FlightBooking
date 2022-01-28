package com.flight.book.entity;

import javax.persistence.Entity;

@Entity
public class Passenger {

	private int passengerId;
	private int bookingId;
	private String name;
	private int age;
	private String sex;
	private String mealPreference;
	public Passenger(int bookingId, String name, int age, String sex, String mealPreference) {
		super();
		this.bookingId = bookingId;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.mealPreference = mealPreference;
	}
	public Passenger() {
		super();
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMealPreference() {
		return mealPreference;
	}
	public void setMealPreference(String mealPreference) {
		this.mealPreference = mealPreference;
	}
	
	
}
