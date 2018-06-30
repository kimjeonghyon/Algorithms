package test;


class Product {
	Product(int a) {
		System.out.println("Pruduct(int) ");
	}
}

class TV extends Product {
	TV () {
		super(1);
		System.out.println("TV()");
	}
	TV (int a) {
		super(1);
		System.out.println( "TV(int)");
	}
	
}
public class SuperTest {

	public static void main(String[] args) {
		// super 디폴트 새성자 호출
		Product p = new TV(1);

	
	}

}
