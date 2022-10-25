package ncs.test09;

abstract public class Plane {
	private String planeName;
	private int fuelSize;

	public Plane() {

	}

	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	public void refuel(int fuel) {

	}

	abstract public void flight(int distance);

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuleSize() {
		return fuelSize;
	}

	public void setFuleSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}

}
