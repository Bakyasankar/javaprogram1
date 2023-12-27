package thread;

public class ThreadPriority {

	public static void main(String[] args) {
	  Table ta=new Table();
	  Thread t=new Thread(ta);
	  t.start();
	  t.setName("multilication table");
//	  t.setPriority(9);
	  t.setPriority(Thread.MAX_PRIORITY);
	  System.out.println("thread name:"+t.getName());
	  System.out.println("thread priority:"+t.getPriority());
	}

}
