package test12;

import java.util.Arrays;

public class StreamExam {

	public static void main(String[] args) {
	int [] arr = {95, 90, 100, 85, 90};
	Arrays. stream(arr).forEach(n -> System.out.println(n));
	int sum = Arrays.stream(arr).sum();
	
	}
}
