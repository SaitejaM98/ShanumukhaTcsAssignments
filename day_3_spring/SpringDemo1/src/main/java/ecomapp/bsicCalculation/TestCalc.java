package ecomapp.bsicCalculation;

public class TestCalc {

	public String Result1() {
		int num1 = 25;
		int num2 = 40;
		int add = num1 + num2;
		String result1 = Integer.toString(add);
		return "The Addition of numbers : " + result1;
	}
	public String Result2() {
		int num1 = 25;
		int num2 = 20;
		int sub = num1 - num2;
		String result2 = Integer.toString(sub);
		return "The Subtraction of numbers : " + result2;
	}
}
