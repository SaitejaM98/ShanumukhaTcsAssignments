package com.Demo;

public class AddAndSub {

	public static void main(String[] args) {
      Numbers num = new Numbers();
      int add =num.num1+num.num2;
      int sub =num.num1-num.num2;  
      System.out.println("Addition of two nums "+add);
      System.out.println("Substraction of two nums "+sub);
	}

}
class Numbers{
	int num1 =25;
	int num2 =15;
}
