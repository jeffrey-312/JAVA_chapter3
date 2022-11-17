
public class test_p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car11 car1;
		car1 = new Car11();
		
		car1.num=1234;
		car1.gas=20.5;
		
		car1.show();
		car1.show();
	}

}
class Car11{
	int num;
	double gas;
	void show(){
		System.out.println("¨®¸¹¬O"+this.num);
		System.out.println("gsa is "+this.gas);
	}
	
}
