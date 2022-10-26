package java020_thread.part06;

import java.util.Scanner;

class Bank implements Runnable {
	private AccountNumber an;

	public Bank() {

	}

	public Bank(AccountNumber an) {
		this.an = an;
	}

	@Override
	public void run() {
		an.input();
		an.withDraw();
	} // end run()

} // end class
