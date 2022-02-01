import java.util.Arrays;

public class TestRecursion {

	public static void main(String[] args) {
		int Xarr[] = new int[] {1,22,3,41,5,66,74,8,16,9,99,23,45,174,249,201,174, 341,64,72,104};
		System.out.println("original array: "+ Arrays.toString(Xarr));
		bubbleSortRecur(Xarr,Xarr.length);
		
		System.out.println("sorted array: "+Arrays.toString(Xarr));
		int k= 0;
		int zKey=69;
		k = binarySearchRecur(Xarr,0,Xarr.length-1,zKey);
		System.out.println("Search value: "+zKey+" found in position: "+k);
	}
	
	public static void bubbleSortRecur(int Xarr[], int n) {
		
		if(n>0) {
			//forLoop with bubble sort 
			for(int i=0; i<n-1; i++) {
				if(Xarr[i]>Xarr[i+1]) {
				int temp=Xarr[i];
				Xarr[i]=Xarr[i+1];
				Xarr[i+1]=temp;
				}
				//do you need an else statement?
			}
			bubbleSortRecur(Xarr, n-1);
		}
		//Recall from chapter9, when the first pass in the 
		//bubblesort is done, the highest value in the array
		//is at the end. SO, you call itself with the same 'array'
		//and one les for the length...
		//base case is when the length, 'n' is equal 1.
		
	}
	public static int binarySearchRecur(int[] array, int start, int end, int target) { 
		
		if(start<end) {
		int middle=(start+end)/2;
		if(target>array[middle]) {
			return binarySearchRecur(array, middle+1, end, target);
		}
		else if(target<array[middle]) {
			return binarySearchRecur(array, start, middle-1, target);
		}
		else if(target==array[middle]) {
			return middle;
		}
		}
		return -1;
		
		//if the 'end' is less than the 'start' value
		//you have reached the end of the array and
		//not found the 'target' value.
		
		
		//IF the target is the 'array[middle]' value
		// then return the 'middle' as the value found to match
		// the target (or zKey)
		
		//if the target is less than the array element in middle
		// the call yourself with 'start' and middle-1
		// else call yourslef with 'middle+1' and 'end'
		
		//remember you can call yourself with a 'return' statement since this 
		//method always returns an integer.
		
    }
}
