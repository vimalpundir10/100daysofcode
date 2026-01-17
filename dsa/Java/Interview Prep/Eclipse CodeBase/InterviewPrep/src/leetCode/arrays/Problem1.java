//Modify array to another given array by replacing array elements with the sum of the array
/*Given an array input[] consisting only of 1s initially and an array target[] of size N,
 *  the task is to check if the array input[] can be converted to target[] by replacing input[i]
 *  with the sum of array elements in each step. If found to be true,
 *   then print “YES”. Otherwise, print “NO”.
 */
package arrays;
import java.io.*;
import java.util.*;

public class Problem1 {
	
	public static boolean isPossible (int[] target) {
		
		int max = 0;
		int index = 0;
		
		for (int i = 0; i < target.length; i++) {
			if (max < target[i]) {
				max = target[i];
				index = i;
			}
		}
		
		if (max == 1)
			return true;
		
		for (int i = 0; i < target.length; i++) {
			if ( i != index) {
				max -= target[i];
				
				if (max <= 0) 
					return false;
			}
		}
		
		target[index] = max;
		
		return isPossible(target);
		//a
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] target = {9, 3, 5};
		boolean res = isPossible(target);
		if (res) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
