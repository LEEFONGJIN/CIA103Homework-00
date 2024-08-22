package Hw1;

public class Hw1 {

	public static void main(String[] args) {
//		請設計一隻Java程式,計算12,6這兩個數值的和與積
		int x=12, y=6;
		int sum = x+y, product = x*y;
		System.out.println(sum);
		System.out.println(product);
//		• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int eggs = 200;
		int dozen = eggs / 12;
		int left = eggs % 12;
		System.out.println(dozen+"打"+left+"顆");
//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int totalsec = 256559;
		int days, hours, min,remainsec;
		days = (totalsec/86400);
		hours = ((totalsec%86400)/3600);
		min = (((totalsec%86400)%3600)/60);
		remainsec = (((totalsec%86400)%3600)%60);
		System.out.println(days+"天"+hours+"小時"+min+"分"+remainsec+"秒");
//		• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		double PI = 3.1415, Radius = 5;
		double area = PI*Radius*Radius;
		double Circumference = PI*2*Radius;
		System.out.println("圓面積 ="+area);
		System.out.println("圓周長 ="+Circumference);
//		• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)
		//【複利公式】FV ＝ PV×（1 ＋ R）n 次方
//		FV 為期末本利和，PV 為期初本金，R 為每期利率，n 為期數也就是--期末本利和＝期初本金×（1＋利率）期數次方。
		double PV = 1500000, R = (0.02);
		double FV = PV * Math.pow(1+R,10);
		System.out.println("期末本利和為"+FV);
//		• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
		int A = 5;
		char B ='5';
		String C = "5";
		System.out.println(A+A);// A宣告為數值,所以輸出結果為數值相加 5+5=10
//		5 + ‘5’
		System.out.println(A+B);
		// B宣告屬於字元,而字元相加會轉換為unicode但unicode為16進制而JAVA相加預設為10進制.
		// JAVA相加預設為10進制,字元 5 的 ASCII值為0035(16進制)轉為(10進制)變為53 故 5+53=58
//		5 + “5”
		System.out.println(A+C);// C宣告屬於字串, 故輸出結果為串接相加 5+字串"5" 輸出為 55
//		並請用註解各別說明答案的產生原因

	}

}
