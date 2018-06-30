package aaa;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TestExecutor {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);

		Future<String> future1 = es.submit(new Task(3000L));
		Future<String> future2 = es.submit(new Task(5000L));
		Future<String> future3 = es.submit(new Task(10000L));
		
		System.out.println("submited!!");
		String result = "NULL";
		try {
			result = future1.get(5L, TimeUnit.SECONDS);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(result);
	
		
		es.shutdown();
		try {
			Future<String> future4 = es.submit(new Task(3000L));
		} catch (RejectedExecutionException e) {
			System.out.println("rejected! - " + Thread.currentThread().getName());
		}
		System.out.println("Main thread END!!");
	}

}

class Task implements Callable<String> {

	long milsec;
	
	
	public Task(long milsec) {
		super();
		this.milsec = milsec;
	}


	@Override
	public String call() throws Exception {
		System.out.println("sleep start - " + Thread.currentThread().getName());
		Thread.sleep(milsec);
		System.out.println("sleep end - " + Thread.currentThread().getName());
		return "test";
	}
	
}
