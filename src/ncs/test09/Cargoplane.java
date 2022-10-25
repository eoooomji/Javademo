package ncs.test09;

public class Cargoplane extends Plane {
	public Cargoplane() {

	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) { // 운항
		setFuelSize(getFuelSize() - (distance * 5));
	}
}
