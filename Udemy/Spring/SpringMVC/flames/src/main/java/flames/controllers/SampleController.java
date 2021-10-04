package flames.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
	
	
	@ResponseBody
	@RequestMapping("/test")
	public String test() {
		return "Its time to do FLAMES!!!!";
	}

}
