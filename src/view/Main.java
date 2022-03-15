package view;
import java.util.concurrent.Semaphore;

import Controller.Processo;

public class Main {

	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(1);
		
		for (int threadId = 1; threadId < 22; threadId++) {
			Thread threadP = new Processo(threadId, semaforo);
			threadP.start();
		}
		
	}

}