package in.sameerit;

public class InstanceRefMethod {
	
	public void m1() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		InstanceRefMethod im = new InstanceRefMethod();

		Runnable r = im::m1;
		Thread t = new Thread(r);

		t.start();
	}

}
