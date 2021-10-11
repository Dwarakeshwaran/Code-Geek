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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import flames.config.FlamesDBConfiguration;
import flames.model.Pairs;

@RestController
public class SampleController {

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

		dbConfig.addPairsToDB(pairs.getUserName(), pairs.getCrushName());

	}

	@RequestMapping(method = RequestMethod.GET, value = "/allpairs", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getAllPairs() throws JsonProcessingException, ClassNotFoundException, SQLException {

		ObjectMapper mapper = new ObjectMapper();

		List<Pairs> list = new ArrayList<Pairs>();

		list = dbConfig.getPairsFromDB();

		return ResponseEntity.ok().body(mapper.writeValueAsString(list));

	}

}
