
public class test_p24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car24 car1=new Car24();
		
		car1.setCar(1234,20.5);
		car1.show();
		
		System.out.println("只改變車號");
		car1.setCar(2345);
		car1.show();
		
		System.out.println("只改變油量");
		car1.setCar(33.4);
		car1.show();
	}

}
class Car24{
	private int num;
	private double gas;
	
	public void setCar(int n) {
		num=n;
		System.out.println("set car number "+num);
	}
	public void setCar(double g) {
		gas=g;
		System.out.println("set car gas "+gas);
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("set car number:"+num+",set car gas:"+gas);
	}
	public void show() {
		System.out.println("car number is"+num);
		System.out.println("car gasoline is"+gas);
	}
}
