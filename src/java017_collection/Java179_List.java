package java017_collection;

public class Java179_List {

	public static void main(String[] args) {
		UserList uList = new UserList();
		uList.add(10);
		uList.add(20);
		uList.add(30);
		uList.add(40);

		System.out.println(uList.size()); // 4

		Integer it1 = (Integer) uList.get(0);
		System.out.println(it1.intValue()); // object -> Integer -> int
		
		try {
		System.out.println(uList.get(0)); // 10
		System.out.println(uList.get(1)); // 20
		System.out.println(uList.get(2)); // 30
		System.out.println(uList.get(3)); // 40
		System.out.println(uList.get(4)); // null
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
		}

		System.out.println(uList.remove(1)); // 20
		System.out.println(uList.size()); // 3
	} // end main()

} // end class
