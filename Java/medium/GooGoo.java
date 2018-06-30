package test;

class GG implements Runnable {

	private int dan;
	
	GG(int dan) {
		this.dan = dan;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		if (dan == 8) {
			System.out.println("8단 양보할게");
			Thread.yield();
		}
		
	    for (int i = 1; i<= 9; i++) {
	    		System.out.println(dan + "단 :" +dan+"*"+i+"="+dan*i);
	    }
	}
}
public class GooGoo {

	public static void main (String [] args) {
		Thread t2 = new Thread(new GG(2));
		Thread t3 = new Thread(new GG(3));
		Thread t4 = new Thread(new GG(4));
		Thread t5 = new Thread(new GG(5));
		Thread t6 = new Thread(new GG(6));
		Thread t7 = new Thread(new GG(7));
		Thread t8 = new Thread(new GG(8));
		Thread t9 = new Thread(new GG(9));
		
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		
		System.out.println("main Thread 종료");
	}
}
