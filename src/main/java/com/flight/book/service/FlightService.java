
package com.flight.book.service;

import com.flight.book.dto.FlightRequest;
import com.flight.book.entity.Flight;

public interface FlightService {

	public Flight addFlight(FlightRequest flightRequest) throws Exception;
}
