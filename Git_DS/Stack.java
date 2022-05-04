import java.util.*;
class Stack{
	static final int max = 1000;
	int top;
	int a[] = new int[max];
	
	Stack(){
		top = -1;
	}
	
	boolean isEmpty(){
		return (top < 0);
	}

	boolean push(int num){
		if(top >= max){
			System.out.println("Stack Overflow!!!!");
			return false;
		}
		else{
			a[++top] = num;
			System.out.println("Pushed ---> "+num);
			return true;
		}
	}
	
	int pop(){
        if (top < 0) {
            System.out.println("Stack Underflow!!!");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }
	
	int peek(){
		if(top < 0){
			System.out.println("Stack Underflow!!!!");
			return 0;
		}
		else{
			int x = a[top];
			return x;
		}
	}
	
	void display(){
		for(int i = top; i>-1; i--){
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}


	public static void main(String[] args){
		Stack s1 = new Stack();
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
				System.out.println("Stack: ");
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
				System.out.println("Peek: ");
				System.out.println("Peek ---> "+(s1.peek()));
				break;
			
			}
	
		}while(choice!=0);
	
	
	}
}