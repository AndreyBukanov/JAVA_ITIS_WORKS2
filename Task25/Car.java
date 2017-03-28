public class Car extends Transport {

	private int fuelLevel;
	
	Car () {
		super();
	}

	Car (String number, int fuelLevel) {
		super(number);
		this.fuelLevel = fuelLevel;
	}

	@Override
	public void come(ParkingPlace parking) {
		if (fuelLevel > 0) {
			super.come(parking);
		}
	}

	@Override
	public void leave(ParkingPlace parking) {
		if (fuelLevel > 0) {
			super.leave(parking);
		}	
	}
}