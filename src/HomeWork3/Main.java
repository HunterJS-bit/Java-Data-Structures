package HomeWork3;

import java.util.Arrays;

public class Main {
/*

 * 
  /**
   *  smoosh() takes an array of ints.  On completion the array contains
   *  the same numbers, but wherever the array had two or more consecutive
   *  duplicate numbers, they are replaced by one copy of the number.  Hence,
   *  after smoosh() is done, no two consecutive numbers in the array are the
   *  same.
   *
   *  Any unused elements at the end of the array are set to -1.
   *
   *  For example, if the input array is [ 0 0 0 0 1 1 0 0 0 3 3 3 1 1 0 ],
   *  it reads [ 0 1 0 3 1 0 -1 -1 -1 -1 -1 -1 -1 -1 -1 ] after smoosh()
   *  completes.
   *
   *  @par
 * 
 * 
 * 
 */
	
	
	public static void main(String[] args) {
	
		int [] arr ={  0 ,0 ,0 ,0 ,1, 1, 0 ,0 ,0 ,3 ,3 ,3, 1, 1, 0};
		removeDulplicates(arr);
	}
	
	
	
	public static void removeDulplicates(int [] arr){
	int num = arr[0];
	for(int i = 1;i<arr.length;i++){
		
		
		if(num==arr[i]){
			arr[i-1]=-1;
			num=arr[i];
		}else{
			arr[i] = arr[i];
			num = arr[i];
		}
	}
	System.out.println(Arrays.toString(arr));
	


	}
	
	
	

	
	
	
	
	
	
}