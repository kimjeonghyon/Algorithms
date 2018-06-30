package problem5;

import java.util.Map;
import java.util.Set;

public class Jmeter {

	public static void main(String[] args) throws InterruptedException {
		//10:15
        Thread monitor = new Monitor();
        monitor.start();
		
		P1 p1 = new P1();
		P2 p2 = new P2(p1);
		P3 p3 = new P3(p2);
		
		p1.start();
		
		Thread.sleep(2000);
		
		p2.start();
		
		Thread.sleep(3000);
		
		p3.start();
		
	}

}


class P1 extends Thread {

	public P1() {
		super("P1");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}

class P2 extends Thread {
    P1 p1;
    
	public P2(P1 p1) {
		super("P2");
		this.p1 = p1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		synchronized (p1) {
				try {
					p1.wait();
				} catch (InterruptedException e) {
				}
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}



class P3 extends Thread {
    P2 p2;
    
	public P3(P2 p2) {
		super("P3");
		this.p2 = p2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		synchronized (p2) {
				try {
					p2.wait();
				} catch (InterruptedException e) {
				}
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

class Monitor extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Map<Thread, StackTraceElement[]> st = Thread.getAllStackTraces();
			Set<Thread> s = st.keySet();
			for (Thread t : s) {
				String name = t.getName();
				if(name.equals("P1")||name.equals("P2")||name.equals("P3")) {
					System.out.print(t.getName() + ":");
					State state = t.getState();
					switch (state) {
					case NEW:
						System.out.println("NEW");
						break;
					case RUNNABLE:
						System.out.println("RUNNABLE");
						break;
					case BLOCKED:
						System.out.println("BLOCKED");
						break;
					case WAITING:
						System.out.println("WAITING");
						break;
					case TIMED_WAITING:
						System.out.println("TIMED_WAITING");
						break;
					case TERMINATED:
						System.out.println("TERMINATED");
						break;
					default:
						System.out.println();
						break;
					}
					
				}
			}
			
		}
		
		
	}
	
	
	
}