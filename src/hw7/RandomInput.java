package hw7;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class RandomInput {

	public static void main(String[] args) {
//		 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡
//		(請使用append功能讓每次執行結果都能被保存起來
		try {
		Set set = new HashSet();
		while (set.size()!=10) {
			int i = (int)(Math.random()*1000+1);
			set.add(i);
		}
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Acer EX-14\\Desktop\\java\\HW7\\Data.txt", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);
		ps.println(set);
		
		ps.close();
		bos.close();
		fos.close();
		}catch(IOException e) {
			System.err.println(e);
		}
		
	}

}
