package PostfixCalculation;
import SimpleCalculator.MyCalculator;
import java.lang.Integer;
import java.lang.String;


public class PostfixCalculator extends MyCalculator {

	Stack st = new Stack();
	Queue qu = new Queue();
	MyCalculator cal = new MyCalculator();
	Window win = new Window();
	
	
	 String []postfix= new String[100];
	 int num1 = 0;
	 int num2 = 0;
	 int op_result=0;
	 char result = 0;
	 String ad = null;
	 String sub = null;
	 String mul= null;
	 String div = null;
	 String mod = null;
	 String []postfix2 = new String[100];
	 
	 void Infix2PostfixConversion(String[] infix){
	//중위를 후위로 변환		
		/*st.Stackpush(st, "3");
		st.Stackpush(st, "4");
		System.out.println(st.peek(st));
		System.out.println(st.pop(st));
		System.out.println(st.peek(st));
		System.out.println(st.pop(st));
		System.out.println(st.peek(st));
*/		
		 
		 /*qu.addQueue(qu, "2");
		 qu.addQueue(qu, "3");
		 System.out.println(qu.deleteQueue(qu));
		 System.out.println(qu.deleteQueue(qu));
		 System.out.println(qu.deleteQueue(qu));*/
		  
		for(int i=0;i<infix.length;i++){	
			//연산자이면 스택, 피연산자이면 큐  
			
			if(infix[i].equals("*")||infix[i].equals("/")||infix[i].equals("%"))
			{	
				
				if(st.isFull(st, st.stack.length)==true){
					System.out.println("Stack is full");}
				
				st.Stackpush(st,infix[i]);
				
				
			}
			else if(infix[i].equals("+")||infix[i].equals("-"))
			{
				if(st.isFull(st, st.stack.length)==true){
					System.out.println("Stack is full");
					}
				else if(st.isEmpty(st)==false){
				
				while(st.isEmpty(st)==false){
					
					if(st.peek(st).contains("(")){
						
						st.Stackpush(st, infix[i]);
						
						break;
					}
					qu.addQueue(qu,st.pop(st));
					
					
				}	st.Stackpush(st, infix[i]);
				}else st.Stackpush(st, infix[i]);
				 
				
		
				
				}
			
				
			else if(infix[i].contains("(")){
				
				st.Stackpush(st,infix[i]);
				qu.addQueue(qu, infix[i].replace("(", ""));
				
			}
			else if(infix[i].contains(")")){
				String n = null;
				
				while(st.isEmpty(st)==false){
				
					
					if(st.peek(st).contains("(")){
						
						st.pop(st);
							break;
						}
					
						n = st.pop(st);
						
						}
				
			qu.addQueue(qu, infix[i].replace(")", ""));	
			qu.addQueue(qu, n);
			
			}
			
			
			else //피연산자 큐에 대입 
			{
				if(qu.isFullQue(qu, qu.queue.length)==true)
				{	
					System.out.println("Queue is full");
				}else {
					
					qu.addQueue(qu, infix[i]);
					
				}
			}
		
			 
			 
		}
		//스택에 남아있는 요소들을 팝하여 큐에 모두 저장 
		while(st.isEmpty(st)==false){
			
			qu.addQueue(qu, st.pop(st));
	
		}
		
		
			for(int j=0;j<infix.length;j++){
		
			postfix[j] = qu.deleteQueue(qu).replace("(","");
			postfix2[j] = postfix[j].replace(")", "");
			
			System.out.print(postfix2[j] +" ");
			
			
			
			
			if(!postfix2[j].equals("+")&&!postfix2[j].equals("-")&&!postfix2[j].equals("*")&&
					!postfix2[j].equals("/")&&!postfix2[j].equals("%")){
				st.Stackpush(st, postfix2[j]);
				
				}else
					{ 
					if(st.isEmpty(st)==false){
						
						num2 = Integer.parseInt(st.pop(st));
						
						num1 = Integer.parseInt(st.pop(st));
						
						//int를 string으로 변환 (stack이 string만 받기 때문)
						ad = Integer.toString(cal.add(num1, num2));
						sub = Integer.toString(cal.subtract(num1, num2));
						mul =Integer.toString(cal.multiply(num1, num2));
						div =Integer.toString(cal.divide(num1, num2));
						mod =Integer.toString(cal.modulo(num1, num2));
						
						switch(postfix[j]){
					      case "+": st.Stackpush(st,ad);
					            break;
					      case "-": st.Stackpush(st,sub);
					            break;
					      case "*": st.Stackpush(st, mul);
					            break;
					      case "/": st.Stackpush(st,div);
					            break;
					      case "%": st.Stackpush(st, mod);
					            break;
				
					}
				
					}
					}
			}
			
			win.printOnScreen(st.pop(st));
			}
		}

