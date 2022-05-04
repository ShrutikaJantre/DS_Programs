import java.util.*;
class DoublyLinkedStack
{
	static int c=0;
node head;
 static class node
 {
 node next;
 node prev;
 int data;
 node(int data)
 {
 this.data=data;
 next=null;
 prev=null;
 }
 }
 void insert(int n)
 {
	 node temp=head;
	 node obj=new node(n);
	 if(head==null)
	 {
		 head=obj;
		 return;
	 }
	 while(temp.next!=null)
	 {
		 temp=temp.next;
	 }
	temp.next=obj;
	obj.prev=temp;
 }
 int pop()
 {
	 if(head==null)
	 {
		System.out.println("empty hai phle se"); 
		return 0;
	 }
	 node temp=head;
	 node prev=null;
	 while(temp.next!=null)
	 {
		 prev=temp;
		 temp=temp.next;
	 }
		 prev.next=null;
		 return temp.data;
 }
 void display()
 {
	 node n=head;
	 if(head==null)
		 System.out.println("kuch ni hai khali hai");
	 while(n!=null)
	 {
		 System.out.print(n.data+ " ,");
		 n=n.next;
	 }
	 System.out.println();
 }
 void displayReverse()
 {
	 node n=head;
	 node p=null;
	 while(n!=null)
	 {
		 p=n;
		 n=n.next;
	 }
	 while(p!=null)
	 {
		 System.out.print(p.data+ " ");
		 p=p.prev;
	 }
	 System.out.println();
 }
 public static void main(String args[])
   {
	   DoublyLinkedStack  obj=new  DoublyLinkedStack();
	   int n;
	   Scanner sc=new Scanner(System.in);
	   do
	   {
	   System.out.println("1 -insert");
	   System.out.println("2-display");
	    System.out.println("3-delete");
	 System.out.println("4-displayReverse");
	    System.out.println("enter the choice");
	    n=sc.nextInt();
	 
	   switch(n)
	   {
		   case 1:
		    System.out.println("enter the number ");
			int n3;
	        n3=sc.nextInt();
			  obj.insert(n3);
			  break;
		   case 2:
		   obj.display();
		   break;
		 	case 3:
		   int  q=obj.pop();
		   System.out.println("deleetd element is "+q);
		   
		   break;
		    case 4:
		   obj.displayReverse();
		   break;
		   default:
		   System.out.println("wrong input");
		   }
		   
   }while(n<=4);
  
   
}

}
  
 
 
	 