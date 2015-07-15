package test;

public class Odd {
	public static void main(String[] args){
		int input = 10;
		int remain = input % 2;
		
		if(remain == 1){
			System.out.printf("%d is Odd", input);
		}
		else{
			System.out.printf("%d is even", input);
		}
	}
}
