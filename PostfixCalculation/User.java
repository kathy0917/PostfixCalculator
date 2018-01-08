package PostfixCalculation;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class User {

	public static void main(String[] args) {

		String input=null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Infix형식의 계산식을 입력하세요: ");
		
		input = sc.nextLine();
		String []exp = new String[input.length()];
		
		exp = input.split(" ");
		
		
	
		PostfixCalculator cal = new PostfixCalculator();
		
		
		System.out.print("Postfix 형식은 ");
		cal.Infix2PostfixConversion(exp);
		
		
		
	}
}
