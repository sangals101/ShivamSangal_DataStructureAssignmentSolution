/**
 * 
 */
package Graded_Assignment3_DSA;

import java.util.Scanner;
import java.util.*;

/**
 * @author Shivam Sangal
 *
 */
public class skyscraper {

	/**
	 * @param args
	 */	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
    	System.out.println("enter the total no of floors in the building");;
        int n= s.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
        	 System.out.println("enter the floor size given on day: " + (i+1));
            arr[i]=s.nextInt();

        }
        System.out.println("The order of construction is as follows");        
        int[] arrDesc = Arrays.stream(arr).boxed()
        	    .sorted(Collections.reverseOrder())
        	    .mapToInt(Integer::intValue)
        	    .toArray();
        for(int i: arrDesc){ 
          System.out.println("Day:" +i);
      }
	}

}
