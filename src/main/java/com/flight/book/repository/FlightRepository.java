package com.flight.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.book.entity.Flight;
import com.flight.book.entity.User;

@Repository
public interface FlightRepository extends JpaRepository<User, Integer> {

	public Flight save(Flight flight);
}
