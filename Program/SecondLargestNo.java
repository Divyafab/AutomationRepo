package Program;

import java.util.Arrays;

public class SecondLargestNo {

	public static void main(String[] args) {
		int num[]= {20,44,55,77,88,221,6556,879};
		Arrays.sort(num);
		int length=num.length;
		System.out.println("SeconLargestNo is :" +num[length-2]);
	}

}
