package test;
import java.io.*;

public class InputDateToArray {
	public static void main(String[] args) throws IOException {
		System.out.println("�п�J�ҸդH��");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int[] test = new int[5];
		
		System.out.println("�п�J�Ҹդ���");
		
		for(int i=0; i<num; i++){
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}
		
		for(int i =0; i<num; i++) {
			System.out.println("��" + (i+1) + "�ӤH�����ƬO" + test[i] + "���C");
		}
	}
}
