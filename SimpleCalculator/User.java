package SimpleCalculator;

import java.util.Scanner;


class Window{
   void printOnScreen(int result){
      System.out.println("결과는" + result + " 입니다.");
   }
}
public class User {

   
   public static void main(String[] args){
      // TODO Auto-generated method stub
      
      String op =null;
      int num1=0;
      int num2=0;
      int op_result=0;
   
      
      MyCalculator cal = new MyCalculator();
      Window win = new Window();
      
      
      Scanner sc = new Scanner(System.in);
      System.out.print("계산식을 입력하세요:");
      
      num1 = sc.nextInt();
      op = sc.next();
      num2 = sc.nextInt();
      
 
      
      

      sc.close();
      
      switch(op){
      case "+": op_result = cal.add(num1, num2);
            win.printOnScreen(op_result);
            break;
      case "-": op_result = cal.subtract(num1, num2);
            win.printOnScreen(op_result);
            break;
      case "*": op_result = cal.multiply(num1, num2);
            win.printOnScreen(op_result);
            break;
      case "/": op_result = cal.divide(num1, num2);
            win.printOnScreen(op_result);
            break;
      case "%": op_result = cal.modulo(num1, num2);
            win.printOnScreen(op_result);
            break;
      
      
   }

   }}