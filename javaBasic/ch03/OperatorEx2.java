package javaBasic.ch03;

public class OperatorEx2 {

	public static void main(String[] args) {
		int i=5, j=0;
		
		j=i++;
		System.out.println("j=i++; ���� �� , i="+i+", j="+j);
		
		i=5;
		j=0;
		
		j=++i;
		System.out.println("j=++i; ���� �� , i="+i+", j="+j);
	}

}
