package week1.Day2;

public class Car {
	public void applyingBreak() {
		System.out.println("brake has been applied");
	}
	public void applyingHorn() {
		System.out.println("sound horn");
	}
	public static void main(String[]arg){
		Car obj= new Car();
		obj.applyingBreak();
		obj.applyingHorn();
	}
}
