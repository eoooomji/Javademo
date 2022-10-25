package ncs.test09;

public class PlaneTest {

	public static void main(String[] args) {
		// Airplane 과 Cargoplane 객체 생성
		// 생성된 객체의 정보 출력
		// Airplane 과 Cargoplane 객체에 100 씩 운항
		// 100 운항 후 객체 정보 출력
		// Airplane 과 Cargoplane 객체에 200 씩 주유
		// 200 주유 후 객체 정보 출력
		Plane airplane = new Airplane("L747", 1000);
		Plane cargoplane = new Cargoplane("c40", 1000);

		System.out.println("plane\tfuelSize");
		System.out.println("-----------------------------");
		System.out.println(airplane.getPlaneName() + "\t" + airplane.getFuelSize());
		System.out.println(cargoplane.getPlaneName() + "\t" + cargoplane.getFuelSize());
		System.out.println("100 운항");
		airplane.flight(100);
		cargoplane.flight(100);
		System.out.println("plane\tfuelSize");
		System.out.println("-----------------------------");
		System.out.println(airplane.getPlaneName() + "\t" + airplane.getFuelSize());
		System.out.println(cargoplane.getPlaneName() + "\t" + cargoplane.getFuelSize());
		System.out.println("200 주유");
		airplane.refuel(200);
		cargoplane.refuel(200);
		System.out.println("plane\tfuelSize");
		System.out.println("-----------------------------");
		System.out.println(airplane.getPlaneName() + "\t" + airplane.getFuelSize());
		System.out.println(cargoplane.getPlaneName() + "\t" + cargoplane.getFuelSize());
		

	} // end main()

} // end class
