import java.util.*;
public class CirQueue {
	
int SIZE;
int queue[];
int front, rear;


CirQueue(int SIZE) {
	this.SIZE=SIZE;
	queue=new int[SIZE];
front = -1;
rear = -1;
}t

boolean isFullQueue() {
if (front == 0 && rear == SIZE - 1) {
return true;
}
if (front == rear + 1) {
return true;
}
return false;
}

boolean isEmptyQueue() {
if (front == -1)
return true;
else
return false;
}
// Adding an element in the queue
void enqueue(int value) {
if (isFullQueue()) {
System.out.println("Sorry !! Queue is full.. No more elements could be inserted in it");
}
else {

if (front == -1)
front = 0;
// incrementing the rear position in circular manner using modulo operator
rear = (rear + 1) % SIZE;
//placing the value at the rear position
queue[rear] = value;
System.out.println("Element " + value + " is inserted successfully");
}
}
// Deleting the element from the queue
void deQueue() {
int value;
// checking of the queue is empty or not
if (isEmptyQueue()) {
System.out.println("Sorry !!The Queue is empty.. ");
} else {
value = queue[front];
// if there is only one element in the queue
if (front == rear) {
front = -1;
rear = -1;
}
else {
// Incrementing the front in a circular manner
front = (front + 1) % SIZE;
}
}
}
// Displaying the elements of the Circular queue
void displayQueue() {
int i;
if (isEmptyQueue()) {
System.out.println("Sorry!! The Queue is Empty");
} else {
System.out.println("Position of Front:  " + front);

for (i = front; i != rear; i = (i + 1) % SIZE)
System.out.print(queue[i] + " ");
System.out.println(queue[i]);
System.out.println("Position of Rear: " + rear);
}
}
// Main function to drive the code
public static void main(String[] args) {
	 System.out.println("enter the size");
	 Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int ch;
	 CirQueue obj=new CirQueue(n);
	do
	 {
		 System.out.println("1 -insert");
	   System.out.println("2 -delete");
	   System.out.println("3-display");
	   System.out.println("enter the choice");
	     ch=sc.nextInt();
	 
	   switch(ch)
	   {
		   case 1:
		   System.out.println("enter the number");
		   int n0=sc.nextInt();
		   obj.enqueue(n0);
	    break;
	     case 2:
		   obj.deQueue();
	    break;
		 case 3:
		   obj.displayQueue();
	    break;
   }
}
while(ch<=3);
   }
}

