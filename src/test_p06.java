
public class test_p06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car06 car1;
		car1 = new Car06();
		
		car1.num=1234;
		car1.gas=20.5;
		
		System.out.println("car number is "+car1.num);
		System.out.println("car gas:"+car1.gas);
	}
}
class Car06{
	int num;
	double gas;
}
