package test;

public class ArrAsignToArr {
	public static void main(String[] args) {
		int[] test1 = new int[3];
		
		test1[0] = 3;
		test1[1] = 6;
		test1[2] = 9;
		
		int[] test2 = new int[3];
		
		test2 = test1;
		int i = 0;
		while(i<3) {
			System.out.printf("%d%n",test2[i]);
			i++;
		}
	}
}
