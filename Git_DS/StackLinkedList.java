import java.util.*;
class StackLinkedList{
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	boolean isEmpty(){
		if(head == null){
			return true;
		}
		else{
			return false;
		}
	}

	void push(int num){
		Node newNode = new Node(num);
		
		if(head == null)
			head = newNode;
		else{
			Node temp = head;
			head = newNode;
			newNode.next = temp;
		}
	}
	
	int pop(){
        int popped = 0;
		if(head == null){
			System.out.println("Stack is Empty");
		}
		else{
			popped = head.data;
			head = head.next;
		}
		
		return popped;
    }
	
	void peek(){
		if(head != null){
			System.out.println("Peek ---> "+head.data);
		}
		else{
			System.out.println("Stack is Empty!!");
		}
	}
	
	void display(){
		Node temp = head;
		if(temp==null){
		   System.out.println("Stack is Empty!!");
	    }
		System.out.println("Stack: ");
		while(temp!=null){
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		System.out.println();
	}


	public static void main(String[] args){
		StackLinkedList s1 = new StackLinkedList();
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("Enter the choice");
			System.out.println("1. Check if Stack is empty");
			System.out.println("2. Display");
			System.out.println("3. Push elements into stack");
			System.out.println("4. Pop elements from stack");
			System.out.println("5. Peek element from stack");
			
			choice = sc.nextInt();
			
			switch(choice){
				
				case 1:
				System.out.println("Is stack Empty: "+(s1.isEmpty()));
				break;
				
				case 2:
				s1.display();
				break;
				
				case 3:
				System.out.println("Enter element to push into stack: ");
				s1.push(sc.nextInt());
				break;
				
				case 4:
				System.out.println("After Pop");
				s1.pop();
				s1.display();
				break;
				
				case 5:
				s1.peek();
				break;
			
			}
	
		}while(choice!=0);
	
	
	}
}