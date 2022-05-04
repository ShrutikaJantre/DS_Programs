import java.util.*;
class DoublyLinkedQueue
{
node front;
node rear;
 static class node
 {
	 int data;
	 node next;
	 node prev;
	 node(int n)
	 {
		 data=n;
		 next=null;
		 prev=null;
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
	 obj.prev=rear;
 }
 void deque()
 {
	 if(front==null &&rear==null)
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
 void count()
 {  int c=0;
	 node n=front;
	 while(n!=null)
	 {
		 c++;
		 n=n.next;
	 }
	 System.out.println("count is "+c);
 }
 
  
	
 public static void main(String args[])
 {
	 int n;
	 Scanner sc=new Scanner(System.in);
	 DoublyLinkedQueue obj1=new DoublyLinkedQueue();
	 do
	 {
		  System.out.println("1-insert an element");
		  System.out.println("2-delete");
		  System.out.println("3-display");
		  System.out.println("4-count");
		  System.out.println("enter the chocie");
		   n=sc.nextInt();
		  switch(n)
		  {
			  case 1:
			  for(int i=1;i>=1;i++)
			  {
			  System.out.println("insert an element && PRESS -1 TO EXIT THIS INSERT OPTION");
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
			 break;
			 case 4:
			 obj1.count();
			 break;
			 default:
			   System.out.println("wrong input");
 }
 
}while(n<=4);

 }
} 