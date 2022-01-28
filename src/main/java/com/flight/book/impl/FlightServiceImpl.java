package com.flight.book.service.impl;

import java.sql.Time;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.book.dto.FlightRequest;
import com.flight.book.entity.Flight;
import com.flight.book.exception.FlightAlreadyExistsException;
import com.flight.book.repository.FlightRepository;
import com.flight.book.service.FlightService;

@Service
@Transactional
public class FlightServiceImpl implements FlightService{

	@Autowired
	FlightRepository flightRepo;
	
	
	@Override
	public Flight addFlight(FlightRequest flightRequest) throws FlightAlreadyExistsException {
		Flight flight = new Flight(flightRequest.getFlight_name(),flightRequest.getAirline_name(),  flightRequest.getSource_name(), flightRequest.getDest_name(),
				flightRequest.getTime(), flightRequest.getAmount());
				
		return flightRepo.save(flight);
	}
	
}
