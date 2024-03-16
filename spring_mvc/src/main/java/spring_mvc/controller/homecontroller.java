package spring_mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import spring_mvc.model.User;

@RestController
public class homecontroller {
	@RequestMapping("/form")
	public String home(Model model) {
		System.out.println("we are in index");
		return "index";
	}

	@RequestMapping(path = "/submit", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> handleForm(@RequestBody User user, Model model) {

		System.out.println(user.getUserName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		return ResponseEntity.status(HttpStatus.OK).body("submitted");
	}

	@GetMapping("/getInput")
	public String getInput(@RequestParam String data) {
		System.out.println(data);
		return "index";

	}

	@PostMapping("/test")
	public String testt(@RequestBody Test test) {
		System.out.println("yes it ran");
		return "index";
	}
	public class Test{
		public String aadit;
	}
}
