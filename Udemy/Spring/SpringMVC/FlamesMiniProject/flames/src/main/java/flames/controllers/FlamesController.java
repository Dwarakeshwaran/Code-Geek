package flames.controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import flames.config.FlamesDBConfiguration;
import flames.model.Pairs;

@RestController
public class FlamesController {

	@Autowired
	private FlamesDBConfiguration dbConfig;

	@Autowired
	private Pairs pairs;

	@ResponseBody
	@RequestMapping("/test")
	public String test() {
		return "Its time to do FLAMES!!!!";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/addpair", consumes = MediaType.ALL_VALUE)
	public void addPairs(@RequestBody String json)
			throws ClassNotFoundException, SQLException, JsonMappingException, JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();

		pairs = mapper.readValue(json, Pairs.class);

		String user = pairs.getUserName();
		String crush = pairs.getCrushName();

		String flames = calculateFlames(user, crush);

		// System.out.println(flames);

		dbConfig.addPairsToDB(user, crush, flames);

	}

	public String calculateFlames(String userName, String crushName) {

		final String[] flamesArray = { "FRIEND", "LOVE", "AFFECTION", "MARRIAGE", "ENEMY", "SIBLING" };

		List<String> flamesList = new ArrayList<String>();

		StringBuilder user = new StringBuilder(userName.toLowerCase());
		StringBuilder crush = new StringBuilder(crushName.toLowerCase());

		for (String relation : flamesArray)
			flamesList.add(relation);

		int count = 0;

		for (int i = 0; i < user.length(); i++) {
			for (int j = 0; j < crush.length(); j++) {

				if (user.charAt(i) == crush.charAt(j)) {

					crush.setCharAt(j, '.');
					user.setCharAt(i, '.');
					break;

				}

			}
			// System.out.println(user + "-" + crush);
		}

		StringBuilder name = new StringBuilder(user.append(crush));

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != '.' && name.charAt(i) != ' ')
				count++;
		}

		// System.out.println(count);

		int countCounter = 0;
		int counter = 0;

		while (flamesList.size() != 1) {

//			for (String relation : flamesList)
//				System.out.print(relation + " ");

			if ((count - 1) == countCounter) {
				flamesList.remove(counter);
				countCounter = 0;
			}
			countCounter++;
			counter++;
			counter = counter % flamesList.size();

			// System.out.println(counter);

		}

		return flamesList.get(0);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/allpairs", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getAllPairs() throws JsonProcessingException, ClassNotFoundException, SQLException {

		ObjectMapper mapper = new ObjectMapper();

		List<Pairs> list = new ArrayList<Pairs>();

		list = dbConfig.getPairsFromDB();

		return ResponseEntity.ok().body(mapper.writeValueAsString(list));

	}

	@RequestMapping(method = RequestMethod.GET, value = "/getpair", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getPair(@RequestParam String user, String crush)
			throws ClassNotFoundException, SQLException, JsonProcessingException {

		Pairs flamesPair = dbConfig.getSinglePairFromDB(user, crush);

		ObjectMapper mapper = new ObjectMapper();

		return ResponseEntity.ok().body(mapper.writeValueAsString(flamesPair));

	}

}
