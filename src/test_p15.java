
public class test_p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car15 car1;
		car1 = new Car15();
		
		int number =234;
		double gasoline = 20.5;
		
		car1.setNumGas(number,gasoline);
		car1.show();
	}

}
class Car15{
	int num;
	double gas;
	
	void setNumGas(int n,double g) {
		num=n;
		gas=g;
		System.out.println("Set car number:"+num+",Set gas:"+gas);
	}
	void show() {
		System.out.println("車號是"+num);
		System.out.println("油量是"+gas);
	}
}