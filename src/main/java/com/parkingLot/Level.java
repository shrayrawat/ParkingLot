package com.parkingLot;

import com.parkingLot.Vehicle.Vehicle;
import com.parkingLot.Vehicle.VehicleSize;

/**
 * Represents a level in a parking lot.
 * 
 * @author srawat1
 *
 */
public class Level {
	private int floor;
	private ParkingSpot[] spots;
	private int availableSpots = 0; // number of free spots
	private static final int SPOTS_PER_ROW = 10;

	public Level(int flr, int numberSpots) {
		floor = flr;
		spots = new ParkingSpot[numberSpots];
		for (int i = 0; i < numberSpots; i++) {
			VehicleSize sz = VehicleSize.LightVehicle;
			int row = i / SPOTS_PER_ROW;
			spots[i] = new ParkingSpot(this, row, i, sz);
		}
		availableSpots = numberSpots;
	}

	public int availableSpots() {
		return availableSpots;
	}

	public ParkingSpot[] getSpots() {
		return spots;
	}

	public void setSpots(ParkingSpot[] spots) {
		this.spots = spots;
	}

	/* Try to find a place to park this vehicle. Return false if failed. */
	public ParkingTicket parkVehicle(Vehicle vehicle) {
		return null;
	}

	/*
	 * Park a vehicle starting at the spot spotNumber, and continuing until
	 * vehicle.spotsNeeded.
	 */
	private boolean parkStartingAtSpot(int spotNumber, Vehicle vehicle) {
		return false;

	}

	/*
	 * find a spot to park this vehicle. Return index of spot, or -1 on failure.
	 */
	private int findAvailableSpots(Vehicle vehicle) {
		return availableSpots;
	}

	public void print() {
	}

	/* When a car was removed from the spot, increment availableSpots */
	public void spotFreed() {
		availableSpots++;
	}

	@Override
	public String toString() {
		return String.valueOf(floor);
	}

}
