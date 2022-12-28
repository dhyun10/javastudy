package javaBasic.ch04;

import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		int score=0;
		char grade=' ', opt='0';
		
		System.out.print("������ �Է��ϼ���. >");
		
		Scanner scanner=new Scanner(System.in);
		score=scanner.nextInt();
		
		System.out.printf("����� ������ %d�Դϴ�.", score);
		
		if(score >= 90) {
			grade='A';
			if(score >= 98) {
				opt='+';
			} else if (score < 94) {
				opt='-';
			}
		} else if(score >= 80) {
			grade='B';
			if(score >= 88) {
				opt='+';
			} else if (score < 84) {
				opt='-';
			}
		} else {
			grade='C';
		} 
		
		System.out.printf("����� ������ %c%c�Դϴ�.", grade, opt);
		
		scanner.close();
	}

}
