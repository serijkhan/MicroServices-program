package in.mantooit;

import in.sameerit.Customer;

public class Demo {
	
	int amount=10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");
		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
	}

	public static void main(String args[]) {
		final Demo c = new Demo();

		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();

		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
	}
}

	


