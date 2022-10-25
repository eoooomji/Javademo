package ncs.test04;

public class ProductTest {

	public static void main(String[] args) {
		String name = "갤럭시 s7";
		int price = 563500;
		int quantity = 3;

		Product pr = new Product(name, price, quantity);
		System.out.println(pr.infomation());
		System.out.println("총 구매 가격 : " + (pr.getPrice() * pr.getQuantity()) + "원");

	} // end main()

} // end class
