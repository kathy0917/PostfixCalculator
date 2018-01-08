package PostfixCalculation;

public class Queue {

	
	String []queue = new String[100];
	
	int front=0;
	int rear=-1;
	
	
	
	public boolean isFullQue(Queue que,int maxSize){
		return (rear == maxSize-1);
	}
	public boolean isEmptyQue(Queue que){
		return (front == rear+1);
	}
	public void addQueue(Queue que,String data){
		
		que.rear++;
		que.queue[que.rear] = data;
		
	}
	
	public String deleteQueue(Queue que){
		if(que.isEmptyQue(que)==true){
			System.out.println("큐가 비어있습니다.");
		}
		String rIdx = que.peek(que);
		
		que.front++;
		return rIdx;
		
	}
	

	
	private void exit(int i) {
		// TODO Auto-generated method stub
		
	}
	
	public String peek(Queue que){
	if(que.isEmptyQue(que)==true){
		System.out.println("queue is empty");
		exit(-1);
	}
	return que.queue[que.front];
	}
}
