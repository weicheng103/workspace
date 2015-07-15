package test;

public class Sample7_11 {
	public static void main(String[] args){
		int test[][] = {
				{80, 60, 22, 50}, {90, 55}, {68, 72, 56}
		};
		
		for(int i = 0; i<test.length; i++){
			System.out.println("第" + (i+1) + "個陣列的長度是" + test[i].length + "。");
		}
	}
}
