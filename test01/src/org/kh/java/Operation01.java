package org.kh.java;

public class Operation01 {

	public static void main(String[] args) {
//명령(연산) => Operation
		//입력 항에 따라 : 단항(Unary), 이항(Binary), 삼항(ThreeFlow)
		boolean b1 = true;
		boolean b2 = !b1;
		int i1=20, i2=40;
		int i3= i1 = i2;
		System.out.println("i3 : "+i3);
		int max = i1> i2;
		System.out.println("b1 "+b1);
		System.out.println("b2 "+b2);

	}

}
