package lopesluisjorge.javastudies.jsonparser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UsingJackson {

	private static Logger logger = LoggerFactory.getLogger(UsingJackson.class);

	public static void main(String[] args) {

		String jsonStr = 
		"{\n" + 
				"\"name\": \"Jon\",\n" + 
				"\"email\": \"jon@email.com\",\n" + 
				"\"birthdate\": \"20/01/1985\"\n" + 
		"}";

		ObjectMapper mapper = new ObjectMapper();
		try {
			ObjectPhase1 phase1 = mapper.readValue(jsonStr, ObjectPhase1.class);
			ObjectPhase2 phase2 = phase1.toPhase2();

			logger.info("{} -> {}", phase1, phase2);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}