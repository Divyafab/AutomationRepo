package Program;

public class FactorialNumber {

	public static void main(String[] args) {
            int num=5;
            int fact=1;
            for(int i=num; i>=1; i--) {
            	fact=i*fact;
            	
            }
            System.out.println("The factorial no of "+fact);	
	}

}
/*
 * The factorial no of 120
 */
 