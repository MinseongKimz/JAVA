/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

// switch 문 실습
/*
○다중 선택문이라 하며, switch 문 다음위 수식 값에 따라
  실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다/
  
○형식 및 구조
	switch(수식)
	{
		case 상수1 : 문장1; [break;]
		case 상수2 : 문장2; [break;]
					...
		[default : 문장 n+1;[break;]]
	}
 switch 문의 수식과 case의 상수는 
 byte, short, int, long형이여야 한다.

 case문 뒤에 [break;]가 없는 형태인 경우
 다음 case문의 문장을 계속해서 수행하게 된다; >> 기본 모델
 [break;]가 존재할 경우
 해당 지점에서 수행을 멈춘 후 switch 문을 빠져나간다 >> 일반모델
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test043
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int kor, eng, mat, tot;
		//double avg;
		int avg;
		char grade;
		String name;

		System.out.print("이름 입력 : ");
		name =br.readLine();

		System.out.print("국어점수 입력 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어점수 입력 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학점수 입력 : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		avg = tot / 3;

		switch(avg/10) // 범위를 스위치문에서 못쓰니깐
		{			   // 평균을 인트형 나누기 10 해버리면 앞자리만 딸 수 있다.
					   // 그래서 평균 99 면 나누기 하면 9 
			case 10: case 9: grade = 'A'; break;	
			case 8: grade = 'B'; break; 	
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default:grade = 'F'; break;
		}
		System.out.printf(">> 당신의 이름은 %s 입니다.\n",name);	
		System.out.printf(">> 총점은 는 %d이고,평균은 %d입니다.\n",tot,avg);	
		System.out.printf(">> 등급은 %c입니다.\n",grade);	
	}
}
/* 실행결과
이름 입력 : 김민성
국어점수 입력 : 60
영어점수 입력 : 70
수학점수 입력 : 100
>> 당신의 이름은 김민성 입니다.
>> 총점은 는 230이고,평균은 76입니다.
>> 등급은 C입니다.
계속하려면 아무 키나 누르십시오 . . .
*/
