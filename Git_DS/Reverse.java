import java.util.*;

class Reverse{
	public static void main(String... args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		int rev[] = new int[size];
		
		System.out.println("Enter the elements of array");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Array: ");
		for(int i = 0; i < size; i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		System.out.print("Reversed Array: ");
		for(int i = size-1 ; i >= 0; i--){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		
	}


}