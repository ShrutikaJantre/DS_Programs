import java.util.*;

class Queue{
	static final int size = 100;
	int a[] = new int[size];
	int front = -1;
	int rear = -1;
	
	boolean isEmpty(){
		if(front == -1 && rear == -1){
			return true;
		}
		else{
			return false;
		}
	}
	
	boolean isFull(){
		if(rear == a.length-1){
			return true;
		}
		else{
			return false;
		}
	}
	
	void enQueue(int num){
		if(isFull()){
			System.out.println("Queue is full!!");
		}
		else if(front == -1 && rear == -1){
			front = rear = 0;
			a[rear] = num;
		}
		else{
			rear++;
			a[rear] = num;
		}
	}
	
	void deQueue(){
		if(isEmpty()){
			System.out.println("Queue is Empty!!");
		}
		else if(front == rear){
			front = rear = -1;
		}
		else{
			front++;
		}
	}
	
	void peek(){
		System.out.println("Front: "+a[front]);
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Queue is Empty!!");
		}
		else{
			for(int i = front; i<= rear; i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}
	
	

	public static void main(String[] args){
		Queue q1 = new Queue();
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("Enter the choice");
			System.out.println("1. Check if Queue is empty");
			System.out.println("2. Check if Queue is full");
			System.out.println("3. EnQueue");
			System.out.println("4. DeQueue");
			System.out.println("5. Peek");
			System.out.println("6. Display");
			
			choice = sc.nextInt();
			
			switch(choice){
				
				case 1:
				System.out.println("Is stack Empty: "+(q1.isEmpty()));
				break;
				
				case 2:
				System.out.println("Is stack Full: "+(q1.isFull()));
				break;
				
				case 3:
				System.out.println("Enter the element in the queue");
				q1.enQueue(sc.nextInt());
				break;
				
				case 4:
				q1.deQueue();
				break;
				
				case 5:
				q1.peek();
				break;
				
				case 6:
				q1.display();
				break;
			
			}
	
		}while(choice!=0);
	
	
	}

}