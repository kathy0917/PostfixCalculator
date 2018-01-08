package PostfixCalculation;
import java.lang.String;
public class Stack {

	String []stack = new String[100];
	int topIndex=-1;
	
	
	Stack(){}
	
	
	public boolean isFull(Stack stk,int max_size){
		return (stk.topIndex==max_size-1);
	}
	public void Stackpush(Stack stk,String data){
		
		
		stk.topIndex ++;
		
		stk.stack[stk.topIndex] = data;
	
	}
	public boolean isEmpty(Stack stk){
		return (topIndex==-1);
	}
	public String pop(Stack stk){
		int rIdx = 0;//삭제할 데이터 인덱스 저장할 변수
		if(isEmpty(stk)==true){
			System.out.println("pop error");
			System.exit(0);
		}
		
		rIdx = stk.topIndex;
		
		stk.topIndex --;
		
		
		return stk.stack[rIdx];
		
	}

	public String peek(Stack stk){
		if(isEmpty(stk)==true){
			
			System.out.println("peek error");
			System.exit(0);
		}
		
		
		return stk.stack[stk.topIndex];
	}
	private void exit(int i) {
		// TODO Auto-generated method stub
		
	}
}
