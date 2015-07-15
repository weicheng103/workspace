package test;
import java.io.*;

public class InputDateToArray {
	public static void main(String[] args) throws IOException {
		System.out.println("請輸入考試人數");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int[] test = new int[5];
		
		System.out.println("請輸入考試分數");
		
		for(int i=0; i<num; i++){
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}
		
		for(int i =0; i<num; i++) {
			System.out.println("第" + (i+1) + "個人的分數是" + test[i] + "分。");
		}
	}
}
