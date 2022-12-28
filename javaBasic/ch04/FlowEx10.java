package javaBasic.ch04;

import java.util.Scanner;

public class FlowEx10 {

	public static void main(String[] args) {	
		int score=0;
		char grade='0';
		System.out.print("����� ������ �Է��ϼ��� > ");
		
		Scanner scanner=new Scanner(System.in);
		String tmp=scanner.nextLine();
		score=Integer.parseInt(tmp);
		
		switch(score/10) {
			case 10: case 9:
				grade='A';
				break;
			case 8:
				grade='B';
				break;
			case 7:
				grade='C';
				break;
			default:
				grade='F';
		}
		
		System.out.println("����� ������ "+grade+"�Դϴ�.");
		
		scanner.close();
	}

}
