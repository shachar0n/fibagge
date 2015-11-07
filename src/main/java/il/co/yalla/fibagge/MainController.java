package il.co.yalla.fibagge;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
@Controller
public class MainController {

	public static void main(String[] args) {
		SpringApplication.run(MainController.class, args);
	}

	@RequestMapping("/test")
	public @ResponseBody String get() {
		return "test success";
	}

	@RequestMapping(value = "/newGameRequest", method = RequestMethod.POST)
	public ResponseEntity<List<String>> discoverApplications(@RequestBody ArrayList<String> input) {
		
		String gameName = input.get(0);
		String gameLang = input.get(1);
		System.out.println("Requested new game creation: "+gameName);
		System.out.println("with language: "+gameLang);
		
		GameInstance gi = GameInstanceFactory.request(gameName,gameLang);
		
		List<String> output = new ArrayList<String>();
		output.add(gi.getGameCode());
		return new ResponseEntity<List<String>>(output, HttpStatus.OK);
	}

}
