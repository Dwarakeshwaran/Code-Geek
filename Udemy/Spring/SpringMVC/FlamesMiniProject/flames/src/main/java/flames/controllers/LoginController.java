package flames.controllers;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import flames.config.LoginDBConfiguration;
import flames.model.User;

@RestController
public class LoginController {

	@Autowired
	LoginDBConfiguration loginService;

	@RequestMapping(method = RequestMethod.POST, value = "/register")
	public void saveCredentials(@RequestBody String credentials)
			throws JsonMappingException, JsonProcessingException, ClassNotFoundException, SQLException {
		// System.out.println(credentials);

		ObjectMapper mapper = new ObjectMapper();

		User user = mapper.readValue(credentials, User.class);

		loginService.registerUser(user.getUserName(), user.getPassword(), user.getEmail());

		// System.out.println(user.getUserName() +" - "+ user.getPassword());

	}

	@RequestMapping(method = RequestMethod.GET, value = "/users")
	public ResponseEntity<String> getCredentials()
			throws ClassNotFoundException, SQLException, JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();

		String jsonArray = mapper.writeValueAsString(loginService.getUsers().toArray());
		// System.out.println(jsonArray);

		return ResponseEntity.ok().body(jsonArray);

	}

}
