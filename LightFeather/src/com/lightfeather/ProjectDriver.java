package com.lightfeather;

/***
 * This is simple driver program to test the methodss
 * @author Venkateswaru.Puli
 *
 */

public class ProjectDriver {

	public static void main(String[] args) {
		//You should pass arguments somethign like this ProjectDriver "24, 12, 8, 12, 19" "24, 12, 8, 12, 19,24,36"
		int[] requestList = { 24, 12, 8, 12, 19 } ;
		int[] requestList2 = { 24, 12, 8, 12, 19,24 } ;
		if(args.length > 0) {
			String firstParameter=args[0];
			requestList = convertToIntArray(firstParameter);
		}
		if(args.length > 1) {
			String secondParameter=args[1];
			requestList2 = convertToIntArray(secondParameter);
		}
		
		System.out.println("Sorting Results with ascending");
		
		Assignment assignment = new AssignmentImpl();
		
		int result[] = assignment.simpleSort(requestList , true);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		System.out.println("Sorting Results with descending");
		
		assignment = new AssignmentImpl();

		 result = assignment.simpleSort(requestList , false);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		System.out.println("printSortedFrequency");
		assignment.printSortedFrequency(requestList);
		
		System.out.println("Number Of Unique values in first request"  );
		System.out.println(assignment.numberOfUniqueValues(requestList));
		
		System.out.println("Number Of Unique values in second request"  );
		System.out.println(assignment.numberOfUniqueValues(requestList2));
		
		
	}

	private static int[] convertToIntArray(String firstParameter) {
		int[] requestList;
		String[] strings = firstParameter.substring(0, firstParameter.length()).split(",");
		requestList = new int[strings.length];
		for (int i=0; i < strings.length; i++) {
			requestList[i] = Integer.parseInt(strings[i].trim());
		}
		return requestList;
	}

}
