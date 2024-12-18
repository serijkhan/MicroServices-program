package in.sameerit.service;

import in.sameerit.request.Passenger;
import in.sameerit.response.Ticket;

public interface MakeMyTripService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicketByNum(Integer ticketNumber);

}
