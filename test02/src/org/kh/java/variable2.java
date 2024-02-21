package org.kh.java;

public class variable2 {

	public static void main(String[] args) {
		boolean a = true;	//논리형(true, false) : 1byte
		//byte b = 255;		//-128~127 -> 255는 해당 공간보다 큰 숫자이므로 OverFlow
		//byte b = -129;		//해당공간에 저장할 수 있는 숫자보다 더 작아서 UnderFlow
		byte b = 126; 			//1byte=8bit=256(-128~127)
		short c = 32767;		//2byte=16bit=65536(-32768~32767)
	    char d = 'k';			//2byte
	    int e = 234567;			//4byte
	    float f = 3.14f;		//4byte
	    long g = 5454534;		//8byte
	    double h = 3.14d;		//8byte
	    System.out.println("byte : "+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
	    System.out.println("short : "+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
	    System.out.println("Char : "+Character.MIN_VALUE+"~"+Character.MAX_VALUE);
	    System.out.println("int : "+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
	    System.out.println("float : "+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
	    System.out.println("long : "+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
	    System.out.println("double : "+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
	}

}
