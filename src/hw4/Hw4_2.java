package hw4;

public class Hw4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		(提示:String方法,陣列)
		String s1 = "Hello World";
		String[] s2 = new String[s1.length()];
		for(int i=s1.length()-1;i>=0;i--) {
			s2[i] =""+s1.charAt(i);
			System.out.print(s2[i]);
		}

		
	}

}