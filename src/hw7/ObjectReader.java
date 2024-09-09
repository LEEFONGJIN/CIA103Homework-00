package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果
//		(請利用多型簡化本題的程式設計)
		File input = new File("C:/Data/Object.ser");
		FileInputStream fis = new FileInputStream(input);
		ObjectInputStream ois = new ObjectInputStream(fis);
		while(true) {
			try {
				((Animal)ois.readObject()).speak();
			}catch(IOException e) {
				System.out.println("資料讀取完畢");
				break;
			}
		}

		ois.close();
		fis.close();
	}
}
