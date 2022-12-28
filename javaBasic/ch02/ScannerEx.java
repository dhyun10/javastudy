package javaBasic.ch02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("���ڸ� ������ �ϳ� �Է����ּ���");
		String input=scanner.nextLine();
		int num=Integer.parseInt(input);
		
		System.out.println("�Է³��� : "+input);
		System.out.printf("num=%d%n", num);
		
		scanner.close();
	}

}
