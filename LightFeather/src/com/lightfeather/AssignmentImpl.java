package com.lightfeather;

public class AssignmentImpl implements Assignment {

	/***
	 * Purpose of this method is to do simple sorting based on sorting order
	 */
	@Override
	public int[] simpleSort(int[] list, boolean ascending) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < list.length; i++) {
		        for (int j = i + 1; j < list.length; j++) {
		            int tmp = 0;
		            if(ascending) {
		            if (list[i] > list[j]) {
		                tmp = list[i];
		                list[i] = list[j];
		                list[j] = tmp;
		            }
		            }else {
		            	if (list[i] < list[j]) {
			                tmp = list[i];
			                list[i] = list[j];
			                list[j] = tmp;
			            }
		            }
		        }
		    }
		 return list;
	}
/**
 * Purpose of this method is to sort the array and print the elemenet with frequency
 */
	@Override
	public void printSortedFrequency(int[] list) {
		list = simpleSort(list, true);
		
        int n = list.length; 
     
        for(int i=0;i<list.length;i++) {
        	if(i > 0 && list[i] == list[i-1])
        		continue;
        System.out.println( list[i] + " appears " + findTheOccurences(list,list[i]) + " times"); 
        }

	}

	/***
	 * Purpose of this method is to find the unique values in Array.
	 */
	@Override
	public int numberOfUniqueValues(int[] list) {
		int uniquevalues=0;
		list = simpleSort(list, true);
		for(int i=0;i<list.length;i++) {
        	if(i > 0 && list[i] == list[i-1])
        		continue;
        	else
               	uniquevalues++;
		}
		
		return uniquevalues;
		
	}
	/**
	 * This purpose of this method is to find the number of occurrence of specific element 
	 * @param arr
	 * @param x
	 * @return
	 */
	private int findTheOccurences(int arr[],  int x) 
    { 
        int res = 0; 
        for (int i=0; i<arr.length; i++) 
            if (x == arr[i]) 
              res++; 
        return res; 
    } 

}
