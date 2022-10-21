package Practical2;



	public class ThreadSchedular implements Runnable {

		Thread th;
		
		@Override
		public void run() {
			for (int i = 0; i < 51; i++) {
				System.out.println(Thread.currentThread().getName() + "  "+ i); 
				try {
					Thread.sleep(20);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
		
		public static void main(String[] args) {
			Thread t1 = new Thread(new ThreadSchedular());
			t1.start();
		}
	}

