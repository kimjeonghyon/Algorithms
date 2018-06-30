package aaa;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {

		Producer t1 = new Producer("t1");
		Consumer t2 = new Consumer("t2", t1);
		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();
		System.out.println("main tread END");
		
	}

}


class Producer extends Thread {

	final String name;
	Queue<String> queue;
	
	public Producer(String name) {
		super();
		this.name = name;
		this.queue = new LinkedList<>();
	}

	public void run() {
		System.out.println("Producer STARTed- " + name);
		while(true) {
			try {
				Thread.sleep(500);
				putMessage();
			}catch(InterruptedException e) {System.out.println("interrupted -" + name);break;}
		}
		
		System.out.println("Producer STOPed- " + name);
	}	
	
    synchronized void putMessage () throws InterruptedException {
		if (queue.size() >= 5) {
			System.out.println("put wait!! - " + name);
			//notify();
			wait();
		}
		queue.offer(new Date().toString());
		System.out.println("Queue["+queue.size()+"] put - " + name);
	    notify();
	}
	
    synchronized String getMessage () throws InterruptedException {
		
		if(queue.size() == 0) {
			System.out.println("get wait!! - " + name);
			wait();
		}
		System.out.println("Queue["+queue.size()+"] get - " + name);
	    String m = queue.poll();
	    
	    notify();
		return m;
	}
	
}


class Consumer extends Thread {

	final String name;
	Producer producer;
	
	public Consumer(String name, Producer p) {
		super();
		this.name = name;
		this.producer = p;
	}

	public void run() {
		System.out.println("Consumer STARTed- " + name);
		while (true) {
			try {
				Thread.sleep(300);
				producer.getMessage();
			} catch (InterruptedException e) {
				System.out.println("interrupted - "+ name);
				break;
			}
		}
		
		System.out.println("Consumer STOPed- " + name);
	}	
}

