package ch10;

import java.util.Scanner;
import java.io.*;

public class StandardIn {
	public static void main(String[] args) throws IOException{
		System.setIn(new FileInputStream(args[0]));
		try(Scanner scanner = new Scanner(System.in)){
			while(scanner.hasNextLine()){
				System.out.println(scanner.nextLine());
			}
		}
	}
}
