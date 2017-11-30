package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_run[] th = new Thread_run[10];
		Thread_run[] th1 = new Thread_run[10];
		Thread_runnable[] th2 = new Thread_runnable[10];
		for(int t = 0;t < 1;t++) {	
        th[t] = new Thread_run();	
        th[t].start();
		th1[t] = new Thread_run();
		th1[t].start();
		th2[t] = new Thread_runnable();
		th2[t].run();
		try {
			th[t].join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		for(int i = 0;i < 10;i++) {
			System.out.println("main‚©‚ço—Í : "+i);
			
		}
		}
	
}
