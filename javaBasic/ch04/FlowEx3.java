package javaBasic.ch04;

import java.util.Scanner;

public class FlowEx3 {

	public static void main(String[] args) {
		System.out.print("���ڸ� �ϳ� �Է��ϼ���.");
		
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		
		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		}
		
		scanner.close();
	}

}
