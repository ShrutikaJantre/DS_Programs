import java.util.*;

class LinearSearch2{
	static Scanner sc = new Scanner(System.in);
	
	int linearSearch(int arr[], int size, int key){
			
		for(int j = 0; j < size; j++){
			if(arr[j] == key){
				return 1;
			}
		}
		return 0;	
	}
		
	public static void main(String... args){
		
		
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements of array");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Array: ");
		for(int i = 0; i < size; i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		System.out.println("Enter key to be searched : ");
		int key = sc.nextInt();
		
		LinearSearch2 l1 = new LinearSearch2();
		int returnValue = l1.linearSearch(arr, size, key);
		
		if(returnValue == 1){
			System.out.println("Number found");
		}
		else{
			System.out.println("Number not found");
		}
	}
}