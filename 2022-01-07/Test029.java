/*===========================================
■■■ 연 산 자 (Operater) ■■■
=============================================*/
// 조건 연산자 == 삼항 연산자
/*
	피연산자 연산자 피연산자 연산자 피연산자
	--------        --------        --------
		1항				2항				3항

	피연산자 ? 피연산자 : 피연산자
	
	1항의 연산 결과 → true  → 2항 수행
					→ false → 3항 수행	
*/		

//사용자로부터 임의의 정수를 입력받아
//입력받은 정수가 짝수인지 홀수인지 판별하는 프로그램을 구현한다.
// 단 . 조건연산자를 활용하여 작성할 수 있도록 한다.

//실행 예)
// 임의의 정수를 입력하라 : 255

// ====[판별 결과]====
//255 → 홀수
//====================
//계속하려면 아무키나 입력하세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int n;
	String strResult; // 홀수인지 짝수인지 판별 결과 값
	
	System.out.print("임의의 정수를 입력 : ");
	n = Integer.parseInt(br.readLine());

	// 홀수인지 짝수인지 판별연산 조건연산자 쓰자. 
	// ----?-----:----- 이런꼴

	// 수식1 : 참 또는 거짓인지를 반환할 수 있는 수식 형태로 작성
	// 수식2 : 수식1의 처리 결과가 참 일경우 수행하는 영역
	// 수식3 : 수식1의 처리 결과가 거짓 일경우 수행하는 영역
	// n을 2로 나누어서 나머지가 얼마인가?? 0이면 짝수 1이면 홀수 일듯

	strResult = (n%2==0)? "짝수" : "홀수";
	// strResult = (4%2==0)? "짝수" : "홀수";
	// strResult = (0==0)? "짝수" : "홀수";
	// strResult = true ? "짝수" : "홀수";
	// strResult = "짝수"


	// 최종 결과 출력
	System.out.println();
	System.out.println("====[판별 결과]====");
	System.out.printf("%d → %s%n",n, strResult);
	System.out.println("===================");

	}
}
/* 실행 결과
임의의 정수를 입력 : 23

====[판별 결과]====
23 → 홀수
===================
계속하려면 아무 키나 누르십시오 . . .


*/