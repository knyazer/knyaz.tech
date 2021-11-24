package tech.knyaz.server.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {
	private String tempVariable = "No value";

	@GetMapping("/status")
	public String status() {
		return "Active";
	}

	@GetMapping("/temp/set")
	public String setTempVar(@RequestParam String value) {
		tempVariable = value;
		return "Successfully written value: " + value;
	}

	@GetMapping("/temp/get")
	public String getTempVar()
	{
		return tempVariable;
	}

}