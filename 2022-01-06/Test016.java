/*===========================================
■■■ 자바 기본 프로그래밍 ■■■
=============================================*/
// 변수와 자료형
// 자바의 기본 입출력 : BufferedReader 클래스

//사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

//실행 예)
//이름을 입력하세요 : 
// 국어 점수 입력   :
// 영어 점수 입력   : 
// 수학 점수 입력   : 

//=====[결과]===== 
//이름 : 
//총점 : 
//계속하려면 아무 키나 누르세요....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test016
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String strName;
		int kos, ens, mats, tot; // 국어점수 영어점수 수학점수 총점
		
		System.out.print("이름을 입력하세요 : ");
		strName = br.readLine();

		System.out.print("국어 점수 입력   : ");
		kos = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 입력   : ");
		ens = Integer.parseInt(br.readLine());
		
		System.out.print("수학 점수 입력   : ");
		mats = Integer.parseInt(br.readLine());
		
		tot = kos + ens + mats;

		System.out.println();
		System.out.println("=====[결과]=====");
		System.out.printf(" 이름 : %s \n", strName);// String 출력은 %s!
		System.out.printf(" 총점 : %d \n", tot);	

	}
}

/*
이름을 입력하세요 : 김민성
국어 점수 입력   : 202
영어 점수 입력   : 13
수학 점수 입력   : 13

=====[결과]=====
 이름 : 김민성
 총점 : 228
계속하려면 아무 키나 누르십시오 . . .
*/