package print;

import java.io.IOException;
import java.util.Scanner;

public class KeyCode {
	public static void main(String[] args) throws IOException {
		//하나의 문자를 받아올 때
		int keyCode = 0;
		
		System.out.println("입력>");
		
		keyCode = System.in.read();
		System.out.println("ketCode : " + keyCode); //a를 콘솔창에 입력 후 엔터를 누르면 값(97)이 나오고
		
		keyCode = System.in.read();
		System.out.println("ketCode : " + keyCode); //기능키의 Enter 값(13)을 뱉는다
		
		keyCode = System.in.read();
		System.out.println("ketCode : " + keyCode); //기능키의 Enter 값(10)을 뱉는다
		
		//Scanner
		Scanner scanner = new Scanner(System.in);
		
		//scanner.naxtLine() => enter키 이전까지 데이터를 받아오세요
		//=> enter를 기준으로 데이터를 읽어옴
		
		//scanner.nextInt() => nextLine과 같이 쓰지말자, 에러의 원인이 된다.
		System.out.println("입력>");
		String inputData = scanner.nextLine();
		System.out.println("Scanner 활용 : " + inputData);
		
		//기본타입, == ( 1==1, 1.2==1.3)
		//문자열 내용 비교
		if(inputData.equals("yedam")) { //키보드로 입력하는 내용이 yedam이면
			System.out.println("yedam과 일치합니다"); //해당 내용을 출력해라.
		}
	}
}
