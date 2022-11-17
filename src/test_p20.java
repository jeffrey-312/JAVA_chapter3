
public class test_p20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car20 car1;
		car1 = new Car20();
		
		car1.num=1234;
		car1.gas=-10;
		
		car1.show();
	}

}
class Car20{
	int num;
	double gas;
	void show(){
		System.out.println("¨®¸¹¬O"+this.num);
		System.out.println("gsa is "+this.gas);
	}
	
}