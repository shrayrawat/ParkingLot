package com.parkingLot;

import java.util.Date;

import com.parkingLot.Vehicle.Vehicle;

/**
 * Class to represent a parking ticket.
 * 
 * @author srawat1
 *
 */
public class ParkingTicket {

	private static int ticketId = 0;
	Vehicle vehicle;
	Date parkingTimestamp;

	public ParkingTicket(Vehicle vehicle, Date parkingTimestamp) {
		super();
		this.vehicle = vehicle;
		this.parkingTimestamp = parkingTimestamp;
		setTicketId(++ticketId);
	}

	private void setTicketId(int id) {
		this.ticketId = id;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public Date getParkingTimestamp() {
		return parkingTimestamp;
	}

}
