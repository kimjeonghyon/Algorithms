package test;


class Pointer {

	int x=0;
	int y=0;
	
	Pointer (int x, int y) {
		this.x = x;
		this.y = y;
	}


}

class Pointer3D extends Pointer {
	int z;
	Pointer3D (int z) {
		super (1,2);
		this.z = z;
	}
}
public class Contructor {

	public static void main(String[] args) {
		Pointer pt = new Pointer3D(1);

		System.out.println(((Pointer3D)pt).z);
	}

}
