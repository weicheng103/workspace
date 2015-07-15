package test;

public class Sample {
	public static void main(String[] args ) {
		int[] test = new int[5];
		
		for(int i = 0; i <5; i++) {
			test[i] = i * 10;
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(test[i]);
		}
	}
}
