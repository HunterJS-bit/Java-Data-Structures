package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class SortingAlgorithms {

	
	
	
	public static void main(String[] args) {
		int[] arr = { 3,2,5,4};
		
		mergeSort(arr);
	}
	
	
	
	public static void bubleSort(int [] arr){
		
		
		for(int i = 0;i<arr.length-1;i++){
			
			for(int j = 0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
				 int temp = arr[j];
				 arr[j] = arr[j+1];
				 arr[j+1] = temp;
				}
				
			}
			
	
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	public static void selectionSort(int [] arr){
		
	
		for(int i = 0;i<arr.length;i++){
			int min = arr[i];
			 int minIndex = i;
			
			 
			for(int j = i;j<arr.length;j++){
			
				if(arr[j]<min){
					min= arr[j];
					minIndex = j;
					
				}
			}
			
			
			if(min<arr[i]){
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		
			
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		

	}
	
	
	
	
	
	
	
	
	public static void insertationSort(int [] arr){
		int key = 0;
		
		for(int i = 1;i<arr.length;i++){
			
			key = arr[i];
			
			for(int j = 0;j<i;j++){
				if(key<arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	
	    public static void mergeSort(int [] arr){
	    	
	    	if(arr.length>1){
	    	int [] left = leftSide(arr);
	    	int [] right = rightSide(arr);
	   
	    	mergeSort(left);
	    	mergeSort(right);
	    	
	    	mergingver3(arr, left, right);
	    	}
	    	
	    	System.out.println(Arrays.toString(arr));
	    	
	    }
	
	
	    
	  public static int[] leftSide(int [] arr){
		  int size = arr.length/2;
		  int [] arr2 = new int[size];
		  for(int i = 0;i<arr2.length;i++){
			  arr2[i]= arr[i];
		  }
		  return arr2;
	  }
	  
	  
	  public static int[] rightSide(int [] arr){
		  int half = arr.length/2;
		  int size = arr.length - half;
		  
		  int [] arr2 = new int[size];
		  
		  for(int i = 0;i<arr2.length;i++){
			  arr2[i] = arr[half+i];
		  }
		  return arr2;
	  }
	
	  
	
	  
	  
	  
	  
	  

	  
	  
			
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  public static void mergingver3(int [] result,int [] left,int []right){
		  int i1 = 0;   // index into left array
	        int i2 = 0;   // index into right array
	        //int[] arr = { 3,2,5,4};
	        for (int i = 0; i < result.length; i++) {
	        	
	            if (i2 >= right.length || (i1 < left.length && 
	                    left[i1] <= right[i2])) {
	                result[i] = left[i1];    // take from left
	                i1++;
	            } else {
	                result[i] = right[i2];   // take from right
	                i2++;
	            }
	        }
	    }
	  }
	  









	  
	  
	  

