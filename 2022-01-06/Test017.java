/*===========================================
■■■ 자바 기본 프로그래밍 ■■■
=============================================*/

// 자바의 기본 입출력 : System.in.read()

import java.io.IOException;

public class Test017
{
	public static void main(String[] args) throws IOException
	{
		//주요 변수 선언
		char ch;
		
		// 사용자에게 안내 메세지 출력
		System.out.print("문자 하나 입력하세요 :" );
		System.in.read();
		
		ch = (char)System.in.read();  // 입력받으면 아스키코드 숫자형태 그러므로 강제형변환 필요;
		
		System.out.print(ch);
		
	}
}