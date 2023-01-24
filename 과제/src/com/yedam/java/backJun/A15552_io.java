package com.yedam.java.backJun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A15552_io {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//문자열로 받을 입력값을 형변환하여 int로 인식
		int n = Integer.parseInt(br.readLine());
		
		//n으로 입력받은 loop를 돈다
		for(int i = 0 ; i < n ; i++) {
			//해당되는 줄 전체를 String으로 입력는다
			String s = br.readLine();
			//스페이스로 구분하여 int로 형변환한다
			int a = Integer.parseInt(s.split(" ")[0]);
			int b = Integer.parseInt(s.split(" ")[1]);
			//출력할 내용을 담는 역할
			//=버퍼를 이용하는 것
			//int s[0] + int s[1]
			bw.write(a+b+"\n");
		}
		//내용을 담은 내용을 콘솔에 출력해주는 역할
		//=버퍼를 비워내는 동시에 콘솔에 출력해줌
		//System.out.print와 동일한 역할을 한다
		bw.flush();
		
		/*BufferedReader
		  = 입력받는 모든 데이터가 String으로 반환된다
		  = 줄마다 입력받아서 따로 split하여 데이터를 추리해주어야 한다
		  = 숫자 형식으로 받기 위해서는 형변환이 필요하다
		   --->> readLine()으로 받으면 "1 2 3"이라는 문자열로 받는다
		   --->> 그렇기 때문에 split(" ")로 띄어쓰기를 구분하고
		   --->> Integer.parseInt()를 통해 int로 형변환을 한다
		*/
	}

}
