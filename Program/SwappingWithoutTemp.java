package Program;

public class SwappingWithoutTemp {

	public static void main(String[] args) {
          int a = 10;
          int b = 20;
          
          b=b-a;
          a=a+b;
          System.out.println("swapping the value of a = "+a);
          System.out.println("swapping the value of b = "+b);


	}

}
/*
 * swapping the value of a = 20
swapping the value of b = 10
 */