package flames.controllers;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import flames.config.FlamesDBConfiguration;

@RestController
public class SampleController {

	@Autowired
	private FlamesDBConfiguration dbConfig;

	@ResponseBody
	@RequestMapping("/test")
	public String test() {
		return "Its time to do FLAMES!!!!";
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "/addpair")
	public String addPairs() throws ClassNotFoundException, SQLException {
		dbConfig.addPairsToDB("Kamal", "Gowthami");
		return "Pairs Added";
	}

}
