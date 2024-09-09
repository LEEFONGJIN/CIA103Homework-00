package hw7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class SampleReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i;
		String str;
		int charCount = 0;
		int lineCount = 0;
		File file = new File("C:\\Users\\Acer EX-14\\Desktop\\java\\HW7\\Sample.txt");
		FileInputStream fis =  new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
			
			while ((str = br.readLine()) != null) {
				lineCount++;
				charCount += str.length();
			}
			System.out.println("Sample.txt檔案共有" + file.length() + "個位元組，" + charCount + "個字元，" + lineCount + "列資料。");

		

		
		br.close();
		isr.close();
		fis.close();
	}
}