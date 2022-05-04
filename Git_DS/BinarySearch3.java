import java.util.Scanner;

class BinarySearch3{
		
	int binarySearch(int arr[], int key, int upper, int lower){
		while(lower<=upper){
			int mid = (lower + upper)/2;
			if(key == arr[mid]){
				return 1;
			//break;
			}
			else if(key < arr[mid]){
				return binarySearch(arr, key, mid-1, lower);
			}
			else if(key > arr[mid]){
				return binarySearch(arr, key, upper, mid+1);
			}
		}
		return 0;
	}

	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int lower = 0;
		int upper = size-1;
		
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
		
		BinarySearch3 b1 = new BinarySearch3();
		
		int returnValue = b1.binarySearch(arr, key, upper, lower);
		
		if(returnValue == 1){
			System.out.println("Number found");
		}
		else{
			System.out.println("Number not found");
		}
		
	}

}