
public class test_p45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ŧicar1");
		Car45 car1=new Car45();
		car1.setCar45(1234, 22.3);
		
		System.out.println("�ŧicar2");
		Car45 car2;
		
		System.out.println("�Ncar1���w��car2");
		car2=car1;
		
		System.out.println("car1��");
		car1.show();
		
		System.out.println("car2��");
		car2.show();
		
		System.out.println("����car1");
		car1.setCar45(123554, 2.53);
		
		System.out.println("car1��");
		car1.show();
		
		System.out.println("car2��");
		car2.show();
	}
	

}
class Car45{
	private int num;
	private double gas;
	
	public Car45() {
		num=0;
		gas=0.0;
		System.out.println("���ͨ��l");
	}
	public void setCar45(int n,double g) {
		num=n;
		gas=g;
		System.out.println("set car's number "+num+",set gasoline"+gas);
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�o�q�O"+gas);
	}
}