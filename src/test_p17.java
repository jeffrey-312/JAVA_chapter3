
public class test_p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Car17 car1;
				car1 = new Car17();
				car1.setNumGas(1234,20.5);
				
				int number =car1.getnum();
				double gasoline = car1.getgas();
				System.out.println("�լd�˫~���ɱo��");
				System.out.println("�����O"+number+"�o�q�O"+gasoline);
			}

		}
		class Car17{
			int num;
			int getnum(){
				System.out.println("�լd����");
				return num;
			}
			
			double gas;
			double getgas(){
				System.out.println("�լd�o�q");
				return gas;
			}
			
			void setNumGas(int n,double g) {
				num=n;
				gas=g;
				System.out.println("Set car number:"+num+",Set gas:"+gas);
			}
			void show() {
				System.out.println("�����O"+num);
				System.out.println("�o�q�O"+gas);
			}
		}