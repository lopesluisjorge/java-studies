package lopesluisjorge.javastudies.http;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 * 
 * {@link https://stackoverflow.com/questions/1359689/how-to-send-http-request-in-java}
 * 
 */
public class UsingApacheHTTPClient {

	public static void main(String[] args) {
		try {
			final String url = "https://tools.ietf.org/rfc/rfc768.txt";
			final HttpClient client = HttpClientBuilder.create().build();
			final HttpResponse response = client.execute(new HttpGet(url));
			final String body = EntityUtils.toString(response.getEntity());

			System.out.println(body);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
