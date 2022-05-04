import java.util.*;

class Duplicate1{
	public static void main(String... args){
	
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array1");
		int size1 = sc.nextInt();
		int arr1[] = new int[size1];
		
		System.out.println("Enter the elements of array1");
		for(int i = 0; i < size1; i++){
			arr1[i] = sc.nextInt();
		}
		System.out.print("Array1: ");
		for(int i = 0; i < size1; i++){
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
		
		System.out.println("Enter the size of the array2");
		int size2 = sc.nextInt();
		int arr2[] = new int[size2];
		
		System.out.println("Enter the elements of array2");
		for(int i = 0; i < size2; i++){
			arr2[i] = sc.nextInt();
		}
		System.out.print("Array2: ");
		for(int i = 0; i < size2; i++){
			System.out.print(arr2[i]+ " ");
		}
		System.out.println();
		
		System.out.println("Enter the size of the array3");
		int size3 = sc.nextInt();
		int arr3[] = new int[size3];
		
		System.out.println("Enter the elements of array3");
		for(int i = 0; i < size3; i++){
			arr3[i] = sc.nextInt();
		}
		System.out.print("Array3: ");
		for(int i = 0; i < size3; i++){
			System.out.print(arr3[i]+ " ");
		}
		System.out.println();
	
	
	
	
		for(int j =0; j < size1; j++){
			for(int k = 0; k < size2; k++){
				for(int l = 0; l < size3; l++){
					if(arr1[j] == arr2[k] && arr1[j] == arr3[l] ){
						System.out.println("Duplicate number: "+arr3[l]);
					}
				}
			}
		}
		
	}
}