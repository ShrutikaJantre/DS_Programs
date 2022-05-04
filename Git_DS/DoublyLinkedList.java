import java.util.Scanner;
class DoublyLinkedList{
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
			data=d;
			next=null;
			prev=null;
		}
	}
	boolean isEmpty(){
		if(head==null){
			return true;
		}
		return false;
	}
	
	void insertBefore(int data){
		Node newnode = new Node(data);
		if(isEmpty()){
			head=newnode;
			return;
		}
		else{
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}
	}
	
	void insertLast(int data){
		Node newnode = new Node(data);
		Node temp=head;
		if(isEmpty()){
			head=newnode;
			return;
		}
		else{
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.prev=temp;
			newnode.next=null;
			
		}
	}
	
	void insertAfterPosition(Node n,int data){
		if(n==null){
			System.out.println("Insertion not possible");
			return;
		}
		Node newnode = new Node(data);
		newnode.next=n.next;
		newnode.prev=n;
		n.next.prev=newnode;
		n.next=newnode;
	}
	
	void deleteHead(){
		Node temp=null;
		if(isEmpty()){
			System.out.println("List is empty");
			return;
		}
		else{
			temp=head;
			head=temp.next;
		}
	}
	
	void deleteLast(){
		Node temp=head;
		Node p=null;
		if(isEmpty()){
			System.out.println("List is empty");
			return;
		}
		else{
			while(temp.next!=null){
				p=temp;
				temp=temp.next;
			}
			p.next=temp.next;
			temp.prev=null;
		}
	}
	
	void deletePosition(Node n){
		Node temp=head;
		Node p=null;
		if(n==null){
			System.out.println("Cannot find Node");
			return;
		}
		else{
			while(temp!=n){
				p=temp;
				temp=temp.next;
			}
			p.next=temp.next;
			temp.next.prev=p;
		}
	}
	
	void deleteKey(int data){
		Node temp=head;
		Node p=null;
		if(isEmpty()){
			System.out.println("List is empty");
			return;
		}
		else if(temp.data==data){
			head=temp.next;
			return;
		}
		else{
			while(temp!=null){
				if(temp.data==data){
					p.next=temp.next;
					temp.next.prev=p;
					return;
				}
				p=temp;
				temp=temp.next;
			}
			System.out.println("Element not found");
		}
	}
	void Search(int data){
		Node temp = head;
		if(isEmpty()){
			System.out.println("List is Empty");
			return;
		}
		while(temp!=null){
			if(temp.data==data){
				System.out.println(data+" Found");
				return;
			}
			temp=temp.next;
		}
		System.out.println("Not Found");
	}
	
	void display(Node temp){
		if(isEmpty()){
			System.out.println("List is Empty");
			return;
		}
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println("");
	}
	
	void reverseDisplay(Node temp){
		if(temp!=null){
			reverseDisplay(temp.next);
			System.out.print(temp.data+" ");
		}
	}
	
	void reverseDisplay1(Node temp){
		while(temp.next!=null){
			temp=temp.next;
		}
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
	}
	
	void Sort(){
		Node temp=head;
		Node p=null;
		while(temp.next!=null){
			p=temp.next;
			while(p!=null){
				if(temp.data>p.data){
					int s = temp.data;
					temp.data=p.data;
					p.data=s;
				}
				p=p.next;
			}
			temp=temp.next;
		}
		
	}
	
	void Merge(Node n1,Node n2){
		if(n1==null || n2==null){
			System.out.println("One of the list is empty");
		}
		while(n1.next!=null){
			n1=n1.next;
		}
		n1.next=n2;
		n2.prev=n1;
		
	}
	
	public static void main(String[] args){
		DoublyLinkedList s1 = new DoublyLinkedList();
		DoublyLinkedList s2 = new DoublyLinkedList();
		Scanner sc = new Scanner(System.in);
		int x;
		do{
			System.out.println("1. Insert an Element");
			System.out.println("2. Insert Element at Last position");
			System.out.println("3. Insert Element After");
			System.out.println("4. Delete First Element");
			System.out.println("5. Delete Last Element");
			System.out.println("6. Delete Element of Node");
			System.out.println("7. Delete Element having key");
			System.out.println("8. Display");
			System.out.println("9. Search Element");
			System.out.println("10. Display Reverse");
			System.out.println("11. Sort");
			System.out.println("12. Enter the element for second list");
			System.out.println("13. Display the element of second list");
			System.out.println("14. Merge");
			System.out.println("0. Exit");
			
			
			x=sc.nextInt();
			switch(x){
				case 1: s1.insertBefore(sc.nextInt());
				System.out.println("----------------");
				break;
				case 2: s1.insertLast(sc.nextInt());
				System.out.println("----------------");
				break;
				case 3: s1.insertAfterPosition(s1.head.next,sc.nextInt());
				System.out.println("----------------");
				break;
				case 4: s1.deleteHead();
				System.out.println("----------------");
				break;
				case 5: s1.deleteLast();
				System.out.println("----------------");
				break;
				case 6: s1.deletePosition(s1.head.next);
				System.out.println("----------------");
				break;
				case 7: s1.deleteKey(sc.nextInt());
				System.out.println("----------------");
				break;
				case 8: s1.display(s1.head);
				System.out.println("----------------");
				break;
				case 9: s1.Search(sc.nextInt());
				System.out.println("----------------");
				break;
				case 10: s1.reverseDisplay1(s1.head);
				System.out.println("\n----------------");
				break;
				case 11: s1.Sort();
				System.out.println("----------------");
				break;
				case 12: System.out.println("Enter the element for second list"); 
				s2.insertLast(sc.nextInt());
				System.out.println("----------------");
				break;
				case 13: System.out.println("Display the element of second list"); 
				s2.display(s2.head);
				System.out.println("----------------");
				break;
				case 14: s1.Merge(s1.head,s2.head);
				System.out.println("----------------");
				break;
				default:
				break;
			}
			
		}while(x!=0);
		
	}
}