/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/
//if ~ else 문 실습

// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 다음과 같은 형태로 출력하는 프로그램을 작성한다.

// 90~100점 : A		80~89점 : B
// 70 ~ 79점 : C    60~69점 : D
// 60점 미만 : F 

// 단 , BufferedReader의 readLine() 메소드를 통해 입력받을 수 있도록 하며,
// printf() 메소드를 통해 출력할 수 있도록 구현한다.

// 실행 예)
//이름 입력 : 
//국어 점수 : 
//영어 점수 : 
//수학 점수 :

// >> 당신의 이름은 ㅇㅇㅇ 입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80,
// >> 수학 점수는 70,
// >> 총점은 240이고, 평균은 80입니다.
// >> 등급은 B 입니다.


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int kor, eng, mat, tot;
		char grade;
		String name;

		System.out.print("이름 입력 : ");
		name = br.readLine();

		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("수학 점수 : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		
		Double avg = tot / 3.0;
		
		 grade = 'X';
		/*
		if (avg >= 90)
		{
			System.out.printf("총점은 %d이고  평균은 %.2f 입니다.\n", tot, avg);
			System.out.printf("등급은 A 입니다.\n");
		}
		else if (89>=avg && avg>=80 )
		{
			System.out.printf("총점은 %d이고  평균은 %.2f 입니다.\n", tot, avg);
			System.out.printf("등급은 B 입니다.\n");
		}
		else if (79>= avg && avg>=70)
		{
			System.out.printf("총점은 %d이고  평균은 %.2f 입니다.\n", tot, avg);
			System.out.printf("등급은 C 입니다.\n");
		}
		else if (69>= avg && avg>=60)
		{
			System.out.printf("총점은 %d이고  평균은 %.2f 입니다.\n", tot, avg);
			System.out.printf("등급은 D 입니다.\n");
		}
		else
		{
			System.out.printf("총점은 %d이고  평균은 %.2f 입니다.\n", tot, avg);
			System.out.printf("등급은 F 입니다.\n");
		내가 짠거 실행 결과를 잘못생각 햇다.	*/

		if (avg >= 90)
			grade = 'A';
		
		else if (avg >= 80)
			grade = 'B';

		else if (avg >= 70)
			grade = 'C';

		else if (avg >= 60)
			grade = 'D';

		else if (avg < 60)
			grade = 'F';

		System.out.printf(">> 당신의 이름은 %s 입니다.\n",name);	
		System.out.printf(">> 국어점수는 %d\n",kor);	
		System.out.printf(">> 수학점수는 %d\n",mat);	
		System.out.printf(">> 영어점수는 %d\n",eng);	
		System.out.printf(">> 총점은 는 %d이고,평균은 %.2f입니다.\n",tot,avg);	
		System.out.printf(">> 등급은 %c입니다.\n",grade);	
	
	}
}
/*실행 결과
이름 입력 : 김민성
국어 점수 : 30
영어 점수 : 40
수학 점수 : 50
총점은 120이고  평균은 40.00 입니다.
등급은 F 입니다.
계속하려면 아무 키나 누르십시오 . . .

원래 계획.
이름 입력 : 김민성
국어 점수 : 76
영어 점수 : 9
수학 점수 : 99
>> 당신의 이름은 김민성 입니다.
>> 국어점수는 76
>> 수학점수는 99
>> 영어점수는 9
>> 총점은 는 184이고,평균은 61.33입니다.
>> 등급은 D입니다.
계속하려면 아무 키나 누르십시오 . . .
*/