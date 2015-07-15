package test;
import java.io.*;

public class ArraySort {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] test = new int[5];
		
		System.out.println("請輸入五個分數");
		
		for(int i = 0; i < 5; i++ ){
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}
		
		
		//排序 : 由小到大
		for(int i = 0; i < test.length-1 ; i++) {
			for(int j = i + 1; j < test.length; j++) {
				if(test[i] > test[j]){
					int tmp = test[i];
					test[i] = test[j];
					test[j] = tmp;
				}
			}
		}
		
		System.out.println("分數由小到大為:");
		for(int score : test){
			System.out.println(score);
		}
			
				
		
	}
}
