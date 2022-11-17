
public class test_p31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car31.showSum();
		
		Car31 car1=new Car31();
		car1.setCar(1234, 23.5);
		
		Car31.showSum();
		
		Car31 car2=new Car31();
		car2.setCar(234, 44.5);
	}

}
class Car31{
	public static int sum=0;
	
	private int num;
	private double gas;
	
	public Car31() {
		num=0;
		gas=0.0;
		sum++;
		System.out.println("生產車子");
	}
	
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("car number"+num+",car gasoline"+gas);
		
	}
	public static void showSum() {
		System.out.println("車子總共有"+sum+"台");
	}
	public void show() {
		System.out.println("car number"+num);
		System.out.println("car gasoline"+gas);
	}
}
