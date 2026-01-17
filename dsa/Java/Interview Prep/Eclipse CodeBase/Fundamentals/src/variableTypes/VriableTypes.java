package variableTypes;

public class VriableTypes {
	// int[] x = new int[3];

	public static void main(String[] args) {
		int y = 10;
		int i = 0;
		int[] x = new int[3];

		for (int j = 0; j < 3; j++) {
			i = i + j;

		}
		System.out.println("i" + i + ": ");
		/*
		 * try { int j = Integer.parseInt("ten"); } catch(NumberFormatException e ) { j
		 * = 10; }
		 */
		// System.out.println(j);
		System.out.println("Hello");
		/*
		 * if(args.length > 0) { x = 10; }
		 *//*
			 * else { x= 20; }
			 */
		// System.out.println(x);

		VriableTypes vt = new VriableTypes();
		System.out.println(x);
		System.out.println(x[0]);
		System.out.println("Hello, I am here again, Wanna try some coding session ?");
	}

}
