package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
//		請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//		代表的檔案會複製到第二個參數代表的檔案
		
		copyFile("C:/Users/Acer EX-14/Desktop/java/HW7/input.txt","C:/Users/Acer EX-14/Desktop/java/HW7/output.txt");
	}
	public static void copyFile(String sourcePath, String destinationPath) throws IOException {
		
		File input= new File(sourcePath);
		File output= new File(destinationPath);
		if (!input.exists()) {
            throw new IOException("來源檔案不存在: " + sourcePath);
        }
		else {
			FileReader fr = new FileReader(input);
			BufferedReader bfr = new BufferedReader(fr);
			FileWriter fw = new FileWriter(output);
			BufferedWriter bfw = new BufferedWriter(fw);
			int c;
			while((c=bfr.read())!=-1){
				bfw.write(c);
				System.out.flush();
			}

			bfw.close();
			fw.close();
			bfr.close();
			fr.close();					
	}

}
}