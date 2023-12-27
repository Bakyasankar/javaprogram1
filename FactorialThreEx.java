package thread;

class ThreadInter implements Runnable{
	@Override
	public void run() {
		System.out.println("even number: ");
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
class Factorial implements Runnable{
	@Override
	public void run() {
	    System.out.println("factorial number:");
		int f=1;
		for(int i=1;i<=10;i++) {
			f=f*i;
			System.out.println("factorial "+ i + " is "+ f);
		}
	}
}
class Table implements Runnable{
	@Override
	public void run() {
		System.out.println("table 5");
		int num=5;
		for(int i=1;i<=10;i++) {
			System.out.println(num +" * "+i+ " = "+(num*i) );
		}
	}
	
}
public class FactorialThreEx {

	public static void main(String[] args) {
		ThreadInter t=new ThreadInter();
		Thread x=new Thread(t);
		x.start();
        
		Factorial fa=new Factorial();
		Thread f=new Thread(fa);
		f.start();
		
		Table ta=new Table();
		Thread tx=new Thread(ta);
		tx.start();
	}

}


//class PowerNum {
//	synchronized void displayPower(int num) {
//		int temp = 1;
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(num + "^" + i + "=" + num * temp);
//			//System.out.println(num + "*" + i + "=" + num * i);
//			temp = temp * num;
//		
//				try {
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			
//		}
//	}
//}
//
//class Power1 extends Thread {
//	PowerNum p;
//
//	Power1(PowerNum p) {
//		this.p = p;
//	}
