package hw9;


public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
//		錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//		3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
//		以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//		大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
//		已經入帳戶。假設媽媽一次匯款2000 元,熊大一次提款
//		1000元,寫一個Java程式模擬匯款10次與提款10次的情
//		形。
//		• 參考範例：TestWaitNotify.java
		BankAccount bankaccount = new BankAccount();
		Mom mom = new Mom(bankaccount);
		BearDa bearda = new BearDa(bankaccount);
		mom.start();
		bearda.start();
	}

}

class BankAccount {

	private int account = 0;

	synchronized public void withdraw(int money) {

		while (account < 2000) {

			try {
				System.out.println("熊大看到餘額在2000以下 要求匯款");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		account -= money;
		System.out.println("熊大領了" + money + "," + "帳戶剩下" + account + "元");
		notify();
	}

	synchronized public void save(int money) {
		while (account >= 3000) {

			try {
				System.out.println("存款目前超過三千元,媽媽停止存款");

				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		account += money;
		System.out.println("媽媽存了" + money + "," + "帳戶現在有" + account + "元");
		notify();
	}
}

//媽媽類別
class Mom extends Thread {
	BankAccount bankaccount;

	public Mom(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			while (!BearDa.finished) {
				bankaccount.save(2000);
			}
		}

	}

}

//熊大類別
class BearDa extends Thread {
	BankAccount bankaccount;
	public static boolean finished = false;

	public BearDa(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			bankaccount.withdraw(1000);
		}
		finished = true;
	}
}
