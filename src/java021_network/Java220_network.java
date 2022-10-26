package java021_network;

import java.net.MalformedURLException;
import java.net.URL;

public class Java220_network {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://movie.daum.net/moviedb/main?movieId=3212");
			System.out.println("getHost(): " + url.getHost()); // getHost(): movie.daum.net
			System.out.println("getProtocol(): " + url.getProtocol()); // getProtocol(): https
			System.out.println("getPort(): " + url.getPort()); // getPort(): -1
			// getPort() : 번호가 없으면 -1을 리턴. 일반적으로 net:80 or net:8080 이렇게 붙는다.
			System.out.println("getPath(): " + url.getPath()); // getPath(): /moviedb/main
			System.out.println("getQuery(): " + url.getQuery()); // getQuery(): movieId=3212
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	} // end main()

} // end class
