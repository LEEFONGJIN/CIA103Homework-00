package hw4;

import java.util.Arrays;

public class Hw4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 班上有8位同學,他們進行了6次考試結果如下:
		// 1號{10,37,100,77,98,90} //一考{10,35,40,100,90,85,75,70}
		// 2號{35,75,70,95,70,80} //二考{37,75,77,89,64,75,70,95}
		// 3號{40,77,79,70,89,100} //三考{100,70,79,90,75,70,79,90}
		// 4號{100,89,90,89,90,75} //四考{77,95,70,89,60,75,85,89}
		// 5號{90,64,75,60,75,50} //五考{98,70,89,90,75,90,89,90}
		// 6號{85,75,70,75,90,20} //六考{90,80,100,75,50,20,99,75}
		// 7號{75,70,79,85,89,99}
		// 8號{70,95,90,89,90,75}
		// 請算出每位同學考最高分的次數
		// (提示:二維陣列)
//		int[][] testScore={{10,37,100,77,98,90},{35,75,70,95,70,80},{40,77,79,70,89,100},{100,89,90,89,90,75},
//				{90,64,75,60,75,50},{85,75,70,75,90,20},{75,70,79,85,89,99},{70,95,90,89,90,75}};
//		int highScoresTimes[] = new int[8];
//		int i ,k;
//		for( i=0; i<testScore.length ; i++){
//			for( k =0; k<testScore[0].length ;k++ ) {
		int[][] testEachStudentScore = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };// [a][b]a為哪次考試 b的索引值為哪位同學的分數
		int[][] testEachStudentScoreSort = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int[] highScoreTimes = new int[8];
		for(int testTimes = 0; testTimes < 6 ; testTimes++ ) {
			Arrays.sort(testEachStudentScoreSort[testTimes]);
			for(int i=0 ; i<testEachStudentScore[testTimes].length ;i++ ) {
				if((testEachStudentScore[testTimes][i]-testEachStudentScoreSort[testTimes][7])==0) {
					highScoreTimes[i]++;
				}
			}
	}
		
//		for(int x=0;x < testEachStudentScore.length;x++) {
//			for(int y = 0 ; y < testEachStudentScore[x].length;y++) {
//				if( testEachStudentScore[x][y] == 0 ) {
//					highScoreTimes[y]++;
//				}
//			}						
//		}
		System.out.println("1號考最高分的次數為"+highScoreTimes[0]+"次");
		System.out.println("2號考最高分的次數為"+highScoreTimes[1]+"次");
		System.out.println("3號考最高分的次數為"+highScoreTimes[2]+"次");
		System.out.println("4號考最高分的次數為"+highScoreTimes[3]+"次");
		System.out.println("5號考最高分的次數為"+highScoreTimes[4]+"次");
		System.out.println("6號考最高分的次數為"+highScoreTimes[5]+"次");
		System.out.println("7號考最高分的次數為"+highScoreTimes[6]+"次");
		System.out.println("8號考最高分的次數為"+highScoreTimes[7]+"次");
}
}
//for (int i = 0; i < testEachStudentScore[testTimes].length; i++) {
//if(testEachStudentScore[testTimes][i]<=testEachStudentScore[testTimes][i++]){
//	testEachStudentScore[testTimes][i]=0;
//}
//if(testEachStudentScore[testTimes][i]>testEachStudentScore[testTimes][i++]) {
//	testEachStudentScore[testTimes][i++] = 0;
//	for(int j =i;j<;j++) {
//		
//	}
//}
//
//}