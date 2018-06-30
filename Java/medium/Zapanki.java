package problem8;

class Hopper {
	int won10 = 20;
	int won50 = 20;
	int won100 = 0;
	int won500 = 30;

	public int getWon10() {
		return won10;
	}
	public void setWon10(int won10) {
		this.won10 = won10;
	}
	public int getWon50() {
		return won50;
	}
	public void setWon50(int won50) {
		this.won50 = won50;
	}
	public int getWon100() {
		return won100;
	}
	public void setWon100(int won100) {
		this.won100 = won100;
	}
	public int getWon500() {
		return won500;
	}
	public void setWon500(int won500) {
		this.won500 = won500;
	}
}

public class Zapanki {
	
	Hopper hopper = new Hopper();

	void pay (int value, int pay) {
		
		int change = pay - value;
		
		int won500 = change/500;
		int won100 =  (change-won500*500)/100;
		int won50 = (change-won500*500-won100*100)/50;
		int won10 = (change-won500*500-won100*100-won50*50)/10;
		
		calc(change, Math.min(won500>0?won500:0,hopper.getWon500()),
				     Math.min(won100>0?won100:0,hopper.getWon100()),
				     Math.min(won50>0?won50:0,hopper.getWon50()),
				     Math.min(won10>0?won10:0,hopper.getWon10()));
	
		// sorting. 
		
		// hopper 차감 . 
		
		// return;
	}
	
	void calc (int change, int won500, int won100, int won50, int won10) {
//		System.out.printf("%d %d %d %d %d\n", change, won500, won100, won50, won10);
		// hopper count over case return;
		
		int sum = won500*500 + won100*100 + won50*50 + won10*10;
		if (sum > change) { return; }
		else if (sum == change) {
			System.out.printf("%d %d %d %d %d\n", change, won500, won100, won50, won10);
			return;
		} else {
			calc (change, won500+1, won100, won50, won10);
			calc (change, won500, won100+1, won50, won10);
			calc (change, won500, won100, won50+1, won10);
			calc (change, won500, won100, won50, won10+1);
		}
	}
	
	public static void main(String[] args) {
		// 10원 20개 , 50원 20개 , 100원 10개 , 500원 30개 
	
		Zapanki za = new Zapanki();
		
		// 1700원 구입 2천원 지불 거스름돈 300원 
//		za.pay (1700, 2000);
//		
		// 830원 구입 1천원 지불 거스름돈 170원 
//		za.pay (830, 1000);
//		
//		// 1250원 구입 5천원 지불 거스름돈 3750원 
		za.pay (1250, 5000);

	}

}
