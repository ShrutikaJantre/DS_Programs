import java.util.*;

class QueueLinkedList{
	Node front;
	Node rear;
	
	static class Node{
		int data;
		Node next;
		
		Node(int num){
			data = num;
			next = null;
		}
	}
	
	boolean isEmpty(){
		if(front == null && rear == null){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	void enQueue(int num){
		Node temp = new Node(num);
		
		if(isEmpty()){
			front = temp;
			rear = temp;
			return;
		}
		
		rear.next = temp;
		rear = temp;
		
	}
	
	void deQueue(){
		Node temp = front;
		
		if(isEmpty()){
			System.out.println("Queue is Empty!!");
			return;
		}
		temp = front;
		front = front.next;
		
		if(front == null){
			rear = null;
		}
	}
	
	void peek(){
		System.out.println("Front: "+front.data);
	}
	
	void display(){
		Node temp = front;
		if(temp==null){
		   System.out.println("Queue is Empty!!");
	    }
		System.out.println("Queue: ");
		while(temp!=null){
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	

	public static void main(String[] args){
		QueueLinkedList q1 = new QueueLinkedList();
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("Enter the choice");
			System.out.println("1. Check if Queue is empty");
			//System.out.println("2. Check if Queue is full");
			System.out.println("3. EnQueue");
			System.out.println("4. DeQueue");
			System.out.println("5. Peek");
			System.out.println("6. Display");
			
			choice = sc.nextInt();
			
			switch(choice){
				
				case 1:
				System.out.println("Is stack Empty: "+(q1.isEmpty()));
				break;
				
				/* case 2:
				System.out.println("Is stack Full: "+(q1.isFull()));
				break; */
				
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