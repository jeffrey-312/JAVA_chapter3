
public class test_p28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car28 car1=new Car28();
		car1.show();
		
		Car28 car2=new Car28(1234,25.0);
		car2.show();
	}

}
class Car28{
	private int num;
	private double gas;
	
	public Car28(){
		num=0;
		gas=0.0;
		System.out.println("創造車子");
	}
	public Car28(int n,double g) {
		this();
		num=n;
		gas=g;
		System.out.println("car number:"+num+",car gasoline"+gas);
	}
	public void show() {
		System.out.println("car number"+num);
		System.out.println("car gasoline"+gas);
	}
}
