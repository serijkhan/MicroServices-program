package in.sameerit.service;

import in.sameerit.request.Passenger;
import in.sameerit.response.Ticket;

public interface BookingService {
	
    public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNumber);


}
