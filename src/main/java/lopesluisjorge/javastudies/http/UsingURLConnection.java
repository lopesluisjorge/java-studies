package lopesluisjorge.javastudies.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/**
 * 
 * {@link https://stackoverflow.com/questions/1359689/how-to-send-http-request-in-java}
 */
public class UsingURLConnection {

	public static void main(String[] args) {

		try {
			final URL url = new URL("https://tools.ietf.org/rfc/rfc768.txt");

			final URLConnection connection = url.openConnection();
			final BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			String line;

			while (Objects.nonNull((line = input.readLine()))) {
				System.out.println(line);
			}

			input.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
