package thread;
class ThreadI implements Runnable{
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("ThreadI:"+i);
				}	
			}	
		}
public class ThreadFirEx { ///usinginterface
			public static void main(String[] args) {
				ThreadI ti=new ThreadI();
				Thread t=new Thread(ti);
				t.start();
			}
	}
//t.setName("Multiplication");
//		t.setPriority(Thread.MAX_PRIORITY);
//		System.out.println("thread name: "+t.getName());
//		System.out.println("thread Priority : "+t.getPriority());
//
