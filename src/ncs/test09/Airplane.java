package ncs.test09;

public class Airplane extends Plane {
	public Airplane() {
		
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) { // 운항
		setFuelSize(getFuelSize() - (distance * 3));
	}

}
