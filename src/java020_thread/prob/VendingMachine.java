package java020_thread.prob;

import java.util.Stack;

public class VendingMachine {
	Stack store = new Stack();

	// for consumer
	public synchronized String getDirnk() {
		while (store.isEmpty()) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return store.pop().toString();
	}

	public synchronized void putDrink(String drink) {
		this.notify();
		store.push(drink);
	}
}
