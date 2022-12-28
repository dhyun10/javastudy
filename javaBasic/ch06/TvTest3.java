package javaBasic.ch06;

class Tv3 {
	String color;
	boolean power;
	int channel;
	
	void power() { power= !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
	
}

public class TvTest3 {
	public static void main(String[] args) {
		Tv3 t1=new Tv3();
		Tv3 t2=new Tv3();
		
		System.out.println("t1�� ä���� "+t1.channel+"�Դϴ�.");
		System.out.println("t2�� ä���� "+t2.channel+"�Դϴ�.");

		t2=t1;
		t1.channel=7;
		System.out.println("t1�� ä�ΰ��� 7�� �����Ͽ����ϴ�.");

		System.out.println("t1�� ä���� "+t1.channel+"�Դϴ�.");
		System.out.println("t2�� ä���� "+t2.channel+"�Դϴ�.");		
	}

}
