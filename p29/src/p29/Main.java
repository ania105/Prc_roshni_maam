package p29;

public class Main {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new CountTask(1,5));
		thread1.start();
		
		
	}
static class CountTask implements Runnable{
	private int start, end;
	public CountTask(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		for(int i = start; i<= end; i++) {
			System.out.println(Thread.currentThread().getName()+ " - Count: "+ i);
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
}
