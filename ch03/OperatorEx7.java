package ch03;

public class OperatorEx7 {

	public static void main(String[] args) {
		byte a=10;
		byte b=30;
		byte c=(byte)(a*b); // a*b일 경우 컴파일에러
		System.out.println(c);
	}

}
