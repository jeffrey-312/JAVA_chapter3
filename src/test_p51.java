
public class test_p51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car51[] car1;
		car1=new Car51[3];
		for(int i=0;i<car1.length;i++) {
			car1[i]=new Car51();
		}
		
		car1[0].setCar51(1234, 20.7);
		car1[1].setCar51(4567, 12.4);
		car1[2].setCar51(7655, 56.7);
		
		for(int i=0;i<car1.length;i++) {
			car1[i].show();
		}
	}

}
class Car51{
	private int num;
	private double gas;
	
	public Car51() {
		num=0;
		gas=0.0;
		System.out.println("產生車子");
	}
	public void setCar51(int n,double g) {
		num=n;
		gas=g;
		System.out.println("set car's number "+num+",set gasoline"+gas);
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("油量是"+gas);
	}
}