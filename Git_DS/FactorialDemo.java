import java.util.*;

class FactorialDemo{
	
	int factorial(int num){
		if(num == 0){
			return 1;
		}
		else{
			int fact = num*factorial(num-1);
			return fact;
		}
	}
	
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get factorial");
		int num = sc.nextInt();
		
		FactorialDemo f1 = new FactorialDemo();
		
		int fact = f1.factorial(num);
		
		System.out.println("Factorial of number "+num+ " is "+fact);
		
	}

}
