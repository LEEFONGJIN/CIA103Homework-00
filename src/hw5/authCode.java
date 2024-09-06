package hw5;

public class authCode {
//	身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//	genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//	與數字的亂數組合，

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("本次隨機產生的驗證碼為");
		authCode code1 = new authCode();
		code1.genAuthCode();
	}
	public void genAuthCode(){
		String[] authCode= new String[8];
		String[] upperCase = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		String[] lowerCase = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String[] numberCase = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
		int randomArray;
		for(int i =0; i < 8 ; i++){
			randomArray= (int)(Math.random()*3+1);
			
			if(randomArray==1) {
				int x=(int)(Math.random()*26);
				authCode[i]= upperCase[x];
			}
			
			else if(randomArray==2) { //為何if會有問題
				int y=(int)(Math.random()*26);
				authCode[i]= lowerCase[y];
			}
			
			else if(randomArray==3){
				int z=(int)(Math.random()*9);
				authCode[i]= numberCase[z];
			}
		}

		System.out.println(authCode[0]+authCode[1]+authCode[2]
				+authCode[3]+authCode[4]+authCode[5]+authCode[6]+authCode[7]);
		
	}

}
