package hw9;

public class EatingThreads implements Runnable {
	int counter = 10;
	int eatBowl = 0;
	String name;
	public static boolean ready = false; // 「開跑」變數
	// 將執行緒物件中的ready變數設為true時，
	// 才會離開永久迴圈而執行下去 確保執行緒同時開始

	public EatingThreads() {
		super();
	}

	public EatingThreads(String name) {
		this.name = name;
	}

	public void run() { // 執行緒執行的地方

		while (!ready) {
		}
		
		while (counter > 0) {
//			System.out.println(counter);
			counter--;
			eatBowl++;
			System.out.println(name + "開始吃第" + eatBowl + "碗");
			try {
				Thread.sleep((int) (Math.random() * 2500 + 500)); // 暫停0.5-3秒
				System.out.println(name + "吃完第" + eatBowl + "碗了");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "吃完了");
	}

	public static void main(String[] args) {
//		開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//		競賽過程。
//		• 每個動作都以Thread.sleep()暫停一下,以達到顯示效果。
//		Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
//		• 參考範例：CounterRunnable.java
//		• 需留意主執行緒執行順序

		EatingThreads et1 = new EatingThreads("饅頭人");
		EatingThreads et2 = new EatingThreads("                詹姆士");
		Thread t1 = new Thread(et1);
		Thread t2 = new Thread(et2);

		t1.start();
		t2.start();
		
		EatingThreads.ready = true;
		
		try {
		t1.join();
		t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("====================");
		System.out.println("大胃王快食比賽結束了");

	}

}
