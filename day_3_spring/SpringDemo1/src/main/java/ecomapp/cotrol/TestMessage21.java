package ecomapp.cotrol;


/*
 * author Shanumukha Manikireddy
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMessage21 {
     //api calling
	
	//GET Method
	
	@GetMapping(value="/message")
	String Message() {
		return "This is Shanumukha.whats your name?";
	}
}
