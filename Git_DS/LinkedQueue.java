import java.util.*;
class LinkedQueue
{
node front;
node rear;
 static class node
 {
	 int data;
	 node next;
	 node(int n)
	 {
		 data=n;
		 next=null;
	 }
 }
 void enque(int n)
 {
	 node obj=new node(n);
	 if(n==-1)
		 return;
	 if(rear==null)
	 {
		 front=obj;
		 rear=obj;
	 }
	 rear.next=obj;
	 rear=obj;
 }
 void deque()
 {
	 if(front==null && rear==null)
	 {
		 System.out.println("empty hai");
		 
	 }
	 else
		 front=front.next;
 }
 void display()
 {
	 node n=front;
	 while(n!=null)
	 {
		 System.out.print(n.data+ " ");
		 n=n.next;
	 }
	  System.out.println();
 }
 public static void main(String args[])
 {
	 int n;
	 Scanner sc=new Scanner(System.in);
	 LinkedQueue obj1=new LinkedQueue();
	 do
	 {
		  System.out.println("1-insert an element");
		  System.out.println("2-delete");
		  System.out.println("3-display");
		  System.out.println("enter the chocie");
		   n=sc.nextInt();
		  switch(n)
		  {
			  case 1:
			  for(int i=1;i>=1;i++)
			  {
			  System.out.println("insert an element");
			  int x=sc.nextInt();
			  if(x==-1)
				  break;
			  else
			  obj1.enque(x);
			  }
			  break;
			  case 2:
			  obj1.deque();
			  break;
			  case 3:
	         obj1.display();
 }
}while(n<=3);

 }
} 