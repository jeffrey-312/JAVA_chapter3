
public class test_p47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car47 car1=new Car47();
		car1.show();
		int number=1234;
		double gaspline=20.5;
		String str="GOOD";
		car1.setCar47(number, gaspline);
		car1.setName(str);
		
		car1.show();
		
		
	}

}
class Car47{
	private int num;
	private double gas;
	private String name;
	
	public Car47() {
		num=0;
		gas=0.0;
		name="�S���W��";
		System.out.println("���ͨ��l");
	}
	public void setCar47(int n,double g) {
		num=n;
		gas=g;
		System.out.println("set car's number "+num+",set gasoline"+gas);
	}
	public void setName(String nm) {
		name=nm;
		System.out.println("�N���W�]��"+name);
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�o�q�O"+gas);
		System.out.println("���W�O"+name);
	}
}