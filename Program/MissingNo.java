package Program;

import java.util.Arrays;

public class MissingNo {

	public static void main(String[] args) {
		int num[]= {1,2,3,5,6,7,8,9};
		Arrays.sort(num);
		for(int i=0;i<num.length;i++) {
			if(i+1!=num[i]) {
				System.out.println(i+1);
				break;
			}
			
		}
	}

}
