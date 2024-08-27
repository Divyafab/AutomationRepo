package Program;

public class SwappingWithTemp {

	public static void main(String[] args) {
          int a=10;
          int b=20;
          int temp;
          
          temp=a;   //temp=10
          a=b ;     //a=20
          b=temp;   //b=10
          System.out.println("swapping the value of a= " +a);
          System.out.println("swapping the value of b= " +b);
	}

}
/*
 * swapping the value of a= 20
swapping the value of b= 10
 */
