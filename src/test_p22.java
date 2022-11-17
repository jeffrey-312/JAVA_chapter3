
public class test_p22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car22 car1;
		car1 = new Car22();
		
		car1.setNumGas(1234,20.5);
		car1.show();
		
		System.out.println("please input wrong gasoline");
		
		car1.setNumGas(1234,-19);
		car1.show();
	}

}
class Car22{
	private int num;
	private double gas;
	
	public void setNumGas(int n,double g) 
	{
		if(g>0&&g<100)
		{
			num=n;
			gas=g;
			System.out.println("set car number:"+num+"set gasoline:"+gas);
		}
		else 
		{
			System.out.println(g+"不是正確的油量");
			System.out.println("cannot change gasoline");
		}
	}
	public void show() {
		System.out.println("車號是"+this.num);
		System.out.println("油量是"+this.gas);
	}
}
