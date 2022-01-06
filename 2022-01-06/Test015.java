/*===========================================
■■■ 자바 기본 프로그래밍 ■■■
=============================================*/

// 퀴즈
// 삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
// 이 삼각형의 넓이를 구하는 프로그램을 구현한다.

//실행 예)
//■ 삼각형의 넓이 구하기 ■
// - 삼각형의 밑변 입력 : 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 입출력 관련 java.io 클래스들   
//모든 클래스들이 java.io 안에 있어서 
//import java.io.*; 도 가능하다. 하지만 메모리 낭비..

public class Test015


{
	public static void main(String[] args) throws IOException // 이상한 값 입력받으면 에러나니깐 방지. 버리자(Throw)
	{
		//키보드 장착(생성)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//													↑	      바이트값
		//							 	↑		  바이트값을 문자해석 
		//		          ↑	  문자열 완성
		//	            br에 대입


		//변수 선언 및 초기화
		int length, height; // 밑변과 높이
		double area;		// 넓이

		System.out.println("■ 삼각형의 넓이 구하기 ■");

		//밑변 길이 받기
		System.out.print("- 삼각형의 밑변 입력 : ");
		length = Integer.parseInt(br.readLine());
		// 높이 받기
		System.out.print("- 삼각형의 높이 입력 : ");
		height = Integer.parseInt(br.readLine());

		
		// 연산처리
		area = (length * height) / 2.0;
		
		//최종 결과 출력
		System.out.printfln();// 개행 

		System.out.printf("밑변이 %d, 높이가 %d인 삼각형의 넓이 :  %.2f \n", length, height, area);
	}
}

/* 출력 결과
■ 삼각형의 넓이 구하기 ■
- 삼각형의 밑변 입력 : 3
- 삼각형의 높이 입력 : 3
밑변이 3, 높이가 3인 삼각형의 넓이 :  4.50
계속하려면 아무 키나 누르십시오 . . .

*/