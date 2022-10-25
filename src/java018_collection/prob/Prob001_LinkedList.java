package java018_collection.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * LinkedList
 * 1 List : 순서적으로 데이터를 저장
 * 2 Stack : LIFO
 * 3 Queue : FIFO
 */

/*
 * booklist.txt파일의 데이터를 Stack으로 처리하여 출력되도록 프로그램을 구현하시오. 
 * title 				publisher 		writer 				price 
 * JSP Programming 		JSPPub 			JSPExpert 			21000 
 * Servlet Programming 	WeBBest 		GoodName 			20000 
 * JDBC Programming 	JDBCBest 		NaDo SQL 			30000 
 * SQL Fundmental		SQLBest 		Na SQL 				47000 
 * Java Programming 	JavaBest 		Kim kava 			25000
 */
public class Prob001_LinkedList {

	public static void main(String[] args) {
//		System.out.print("title               publisher          writer          price\n");
//		LinkedList<String> nStack = new LinkedList<String>();
//
//		try (Scanner sc = new Scanner(new File("./src/java018_collection/prob/booklist.txt"))) {
//			while (sc.hasNextLine()) {
//				String[] str = sc.nextLine().split("/");
//				Book book = new Book(str[0], str[1], str[2], str[3]);
//				nStack.push(book.getTitle() + "     " + book.getPublisher() + "          " + book.getWriter()
//						+ "          " + book.getPrice());
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		while (!nStack.isEmpty())
//			System.out.println(nStack.pop());
//
//		System.out.println("=====================");

		LinkedList<Book> stack = new LinkedList<Book>();
		try (Scanner ss = new Scanner(new File("./src/java018_collection/prob/booklist.txt"))) {
			while (ss.hasNextLine()) {
				String[] line = ss.nextLine().split("/");
				Book bk = new Book(line[0], line[1], line[2], line[3]);
				stack.push(bk);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (!stack.isEmpty()) {
			Book book = stack.pop();
			System.out.printf("%s %s %s %s\n", book.getTitle(), book.getPublisher(), book.getWriter(), book.getPrice());
		}
	}// end main()

}// end class
