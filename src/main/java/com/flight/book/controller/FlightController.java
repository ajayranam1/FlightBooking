package com.flight.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flight.book.dto.FlightRequest;
import com.flight.book.dto.FlightResponse;
import com.flight.book.entity.Flight;
import com.flight.book.repository.FlightRepository;
import com.flight.book.service.FlightService;

@RestController
public class FlightController {

		@Autowired
		FlightService flightService;
		
		@PostMapping("/flight/{userId}")
		public FlightResponse addFlight(@PathVariable String userId, @RequestBody @Validated FlightRequest flightRequest) throws Exception {
			Flight flight = flightService.addFlight(flightRequest);
			return new FlightResponse("Flight added successfully" , flight.getFlightId());
		}
		
}
