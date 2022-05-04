import java.util.*;
class SingleLinked
{
	static int c=0;
node head;
 static class node
 {
 node next;
 int data;
 node(int data)
 {
 this.data=data;
 next=null;
 }
 }
 void InsertHead(int n)
 {
	 node p=new node(n);
	 p.next=head;
	 head=p;
	 c++;
 }
 void InsertAfterNode(node n,int p)
 {
	 node temp=head;
	 node q=new node(p);
	 if(head==null)
		 return;
	 if(temp!=null && temp==n)
	 {
		 temp.next=q;
		 c++;
	 }
	 while(temp!=null && temp!=n)
	 {
		 temp=temp.next;
	 }
	 q.next=temp.next;
	 temp.next=q;
	 c++;
 }
 void InsertAfterNumber(int p,int q)
 {
	 node obj=new node(q);
	 node temp=head;
	 while(temp==null)
	 {
		 return;
	 }
	 while(temp!=null &&temp.data!=(p))
	 {
		 temp=temp.next;
	 }
	 obj.next=temp.next;
	 temp.next=obj;
	 c++;
}
 void InsertLast(int n)
 {
	 node q=new node(n);
	 node temp=head;
	 if(head==null)
	 {
		 head=q;
		 return;
	 }
	 while(temp.next!=null )
	 {
		 temp=temp.next;
	 }
	 temp.next=q;
	 c++;
	 return;
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
 void delete(int n)
 {
	 node temp=head;
	 node prev=null;
	 if(head==null)
	 {
		  System.out.println("kuch ni hai khali hai kya delete kru");
	 }
	 while(temp!=null && temp.data==n)
	 {
		  head=temp.next;
		  c--;
		  return;
	 }
	 while(temp!=null && temp.data!=n)
	 {
		  prev=temp;
		 temp=temp.next;
	 }
	 if(temp.next==null)
	 {
		 prev.next=null;
		 c--;
	 }
	 if(temp==null)
	 return;
	 prev.next=temp.next;
	 c--;
 }
 void Search(int n1)
 {
	 node n=head;
	 int pos=0;
	 if(head==null)
		 System.out.println("EMPTY HAI kuch ni search hoga");
	 while(n!=null && n.data!=n1)
	 {
		 pos++;
		 n=n.next;
	 }
	 if(n.data==n1)
		 System.out.println(" Number found at position"+(pos+1));
 }	 
		void Sort()
		{
			
		}
 void addSpecific(int pos,int data)
 {
	 if(pos==1){
		 InsertHead(data);
	 }
	 else if(pos==(c+1)){
		 InsertLast(data);
	 }
	 else
	 {
		 node n=new node(data);
		 node p=head;
		 int i=1;
		 while(i< pos-1)
		 {
			 i++;
			 p=p.next;
		 }
		 n.next=p.next;
		 p.next=n;
		 c++;
	 }
 }
	 
		 
 public static void main(String args[])
 {
	 int n;
	 Scanner sc=new Scanner(System.in);
	 SingleLinked obj=new SingleLinked();
	 do
	 {
		 System.out.println("1 -insert at head");
	   System.out.println("2 -insert after NODE");
	    System.out.println("3 -insert after number ");
	      System.out.println("4-insert At Last");
	   System.out.println("5-display");
	    System.out.println("6-delete");
		 System.out.println("7-searching");
		 System.out.println("8-Sorting");
		 System.out.println("3 -insert after Specific position ");
	 System.out.println("enter the choice");
	     n=sc.nextInt();
	 
	   switch(n)
	   {
		   case 1:
		   System.out.println("enter the number");
		   int n0=sc.nextInt();
		   obj.InsertHead(n0);
		   break;
		    case 2:
		   System.out.println("enter the number");
		   int n1=sc.nextInt();
		   obj.InsertAfterNode(obj.head.next,n1);
		   break;
		   case 3:
		   System.out.println("enter the number after u want to insert");
	        int n2=sc.nextInt();
			 System.out.println("enter the number u want to insert");
			 int x=sc.nextInt(); 
		   obj.InsertAfterNumber(n2,x);
		   break;
		   case 4:
		   System.out.println("enter the number");
		   int n3=sc.nextInt();
		   obj.InsertLast(n3);
		   break;
		    case 5:
		   obj.display();
		   break;
		   case 6:
		   	 System.out.println("enter the number u want to delete");
		   int n4=sc.nextInt();
		   obj.delete(n4);
		   break;
		   case 7:
		   	 System.out.println("enter the number u want to Search");
		   int n5=sc.nextInt();
		   obj.Search(n5);
		   break;
		    case 8:
		   obj.Sort();
		   break;
		   case 9:
		   int pos,data;
		   while(true)
		   {
			   System.out.println("enter the position");
			  pos=sc.nextInt();
			   if(pos>0 && pos<=(c+1))
				   break;
			   System.out.println("invalid position");
		   }
		    data=sc.nextInt();
		   obj.addSpecific(pos,data);
		   break;
			   
		   default:
		   System.out.println("Wrong input");
		   break;
	   }
	 }
	 while(n<=9);
 }
}
