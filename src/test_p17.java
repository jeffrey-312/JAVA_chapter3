
public class test_p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Car17 car1;
				car1 = new Car17();
				car1.setNumGas(1234,20.5);
				
				int number =car1.getnum();
				double gasoline = car1.getgas();
				System.out.println("調查樣品車時得知");
				System.out.println("車號是"+number+"油量是"+gasoline);
			}

		}
		class Car17{
			int num;
			int getnum(){
				System.out.println("調查車號");
				return num;
			}
			
			double gas;
			double getgas(){
				System.out.println("調查油量");
				return gas;
			}
			
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