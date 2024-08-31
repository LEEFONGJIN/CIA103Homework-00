package hw4;

public class Hw4_3 {
	
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)
	public static void main(String[] args) { 
		
	String[] x= 
	{"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
	int counta=0;
	int counte=0;
	int counti=0;
	int counto=0;
	int countu=0;
	for(int i =0;i<x.length;i++) {
		for(int k=0;k<x[i].length();k++) {
			if( x[i].charAt(k) == 'a' ){
				counta++;
			}
			if( x[i].charAt(k) == 'e' ){
				counte++;
			}
			if( x[i].charAt(k) == 'i' ){
				counti++;
			}
			if( x[i].charAt(k) == 'o' ){
				counto++;
			}
			if( x[i].charAt(k) == 'u' ){
				countu++;
			}
			
			}
		}
	System.out.println("母音a有"+counta+"個");
	System.out.println("母音e有"+counte+"個");
	System.out.println("母音i有"+counti+"個");
	System.out.println("母音o有"+counto+"個");
	System.out.println("母音u有"+countu+"個");
	System.out.println("母音總共有"+(counta+counte+counti+counto+countu)+"個");
	
//	switch(x[i].charAt(k)){
//	case1'a':
//	counta++;
//	break;
//	case2'e':
//	counte++;
//	break;
//	case3'i':
//	counti++;
//	break;
//	case4'o':
//	counto++;
//	break;
//	case5'u':
//	countu++;
//	break;
//	
	}
		
}
	
	


