package ncs.test10;

public class Company {

	public static void main(String[] args) {
		// 1 번의 사용 데이터를 기반으로 객체를 생성하여 배열 에 넣는다.
		// 모든 객체의 기본 정보를 출력한다 (for 문을 이용하여 출력한다.)
		// 모든 객체에 인센티브 100 씩 지급 한 급여를 계산 하고 다시 객체의 salary 에 넣는다.
		// 모든 객체의 정보 와 세금을 출력한다 (for 문을 이용하여 출력한다.)

		Employee[] employees = new Employee[2];
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales", 1200);

		System.out.println("name\tdepartment\tsalary");
		System.out.println("------------------------------------");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(
					employees[i].getName() + "\t" + employees[i].getDepartment() + "\t" + employees[i].getSalary());
		}
		System.out.println("인센티브\t100\t지급");
		((Secretary) employees[0]).incentive(100);
		((Sales) employees[1]).incentive(100);
		System.out.println("name\tdepartment\tsalary\ttax");
		System.out.println("------------------------------------");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getName() + "\t" + employees[i].getDepartment() + "\t"
					+ employees[i].getSalary() + "\t" + employees[i].tax());
		}

	} // end main()

} // end class
