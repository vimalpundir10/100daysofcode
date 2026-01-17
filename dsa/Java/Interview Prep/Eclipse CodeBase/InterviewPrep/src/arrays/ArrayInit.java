/**
 * 
 */
package arrays;
import java.util.Arrays;

/**
 * @author vimal
 *
 */
public class ArrayInit {

	public class Problem1 {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[3];
		int[][] matrix = {{85, 26}, {8, 33}, {21, 45}, {99, 68}}; //2D Array
		System.out.println("size of arr is: " +arr[arr.length - 3]);
		arr[0] = 10; arr[1] = 20; arr[2] = 30; //1D Array
		System.out.println("size of arr after initiatlization is: " +Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++ ) {
			if (arr[i] == 20) {
				System.out.println("Yeah!, We are inside the If condition:)) " +arr[i]);
			}
			else {
				System.out.println("better luck next time buddy! " +arr[i]);
			}
		}
		for (int j = 0; j < matrix.length; j++) {
			for (int k = 0; k < matrix.length - 2; k++) {
				//System.out.println("Printing j's value: "+Arrays.toString(matrix[j])+ "\n Printing K's value: "+Arrays.toString(matrix[k]));
				System.out.println("Printing matrix values with index: ["+j+"] ["+k+"]= " +matrix[j][k]);
			}
		}
		
	}

}
