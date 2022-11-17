
public class test_p26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car26 car1=new Car26();
		car1.show();
	}

}
class Car26{
	private int num;
	private double gas;
	public Car26() {
		num=0;
		gas=0.0;
		System.out.println("create car");
	}
	public void show() {
		System.out.println("car number is"+num);
		System.out.println("car gasoline is"+gas);
	}
}
