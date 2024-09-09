package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//		意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
		Dog A1 = new Dog("威力");
		Dog A2 = new Dog("Billy");
		Cat A3 = new Cat("Lilly");
		Cat A4 = new Cat("凱蒂");
		File f1 = new File("c:\\data");
		File f2 = new File("c:\\data\\Object.ser");
		Object[] animal = new Object[4];
		animal[0]=A1;
		animal[1]=A2;
		animal[2]=A3;
		animal[3]=A4;
		if(!f1.exists()) {
			f1.mkdir();
		}
		
		FileOutputStream fos = new FileOutputStream(f2);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < animal.length; i++) {
			oos.writeObject(animal[i]);
		}
		oos.close();
		fos.close();
	}

}
