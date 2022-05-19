package ecomapp.cotrol2;


/*
 * author Shanumukha Manikireddy
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ecomapp.bsicCalculation.TestCalc;

@RestController
public class TestMessage21 {
     //api calling
	
	//GET Method
	
	@GetMapping(value="/AddSub")
	String Message() {
		TestCalc calc= new TestCalc();
		
		return calc.Result1()
				+ "\n"+calc.Result2();
	}
}
