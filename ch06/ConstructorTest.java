package ch06;

class Data_1 {
	int value;
}

class Data_2 {
	int value;
	
	Data_2(int x) { // 매개변수가 있는 생성자.
		value=x;
	}
}

class ConstructorTest {
	public static void main(String[] args) {
		Data_1 d1=new Data_1();
		Data_2 d2=new Data_2(0);  // 컴파일 에러
	}
}
