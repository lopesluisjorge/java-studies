package lopesluisjorge.javastudies.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * 
 * {@link https://stackoverflow.com/questions/1359689/how-to-send-http-request-in-java}
 *
 */
public class UsingScanner {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(new URL("https://tools.ietf.org/rfc/rfc768.txt").openStream())) {
			System.out.println(scanner.useDelimiter("\\A").next());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
