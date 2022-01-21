/*========================
  ■■■ 만년달력 ■■■
==========================*/

//다음과 같은 기능의 프로그램을 구현한다.

// 실행 예)
//『연도』를 입력하세요 : 2022
//『월』을 입력하세요 : 6
/*
		[ 2020년 6월 ]

  일  월  화  수  목  금  토
============================
			   1   2   3   4
  5    6   7   8   9  10  11
  12  13  14  15  16  17  18
  19  20  21  22  23  24  25
  26  27  28  29  30
=============================

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test107
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int y; // 입력받을 년도
		int m; // 입력받을 월
		
		do
		{
			System.out.print("『연도』를 입력하세요 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1); // 1년 아래는 안받아줌

		do
		{
			System.out.print("『월』을 입력하세요   : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12); //달은 1~12월까지만..

		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 1월 = months[0]
		int nalsu;														//     = 31 까지 

		
		if ((y%4==0 && y%100 !=0)||y%400==0) // 만약 윤년이라면
			months[1] =29; //배열 2번째 (2월) 값을 29

		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400; 
		//		평년		윤년	   100년예외   예외때매 빠진 400때 윤년
		for (int i =0 ;i<(m-1) ;i++ )
			nalsu += months[i]; // 전달마지막 날까지 날수에 더해줌
		
		nalsu += 1; // 월의 시작날을 알면 되기 때문에 1 더해줌 그럼 xxx년xx월  1일 일꺼니깐

		int w = nalsu % 7; // 월의 시작 요일을 알 수 있다.
		//만약 1일이 수요일이면 3 이 나올꺼고 
		// 이를 w 에 저장..
	
		System.out.println();
		System.out.printf("     [ %d년 %d월 ]\n",y,m);
		System.out.println(" 일 월 화 수 목 금 토 ");
		System.out.println("======================");

		for (int i=0;i<w ;i++ ) // w전까지 공백 넣기
		{
			System.out.print("   ");// 맞춰서
		}

		for (int i=1;i<=months[m-1];i++ )// 1 ~ 달배열 마지막 값까지 
		{
			System.out.printf("%3d",i); // 숫자 출력
			w++;                        // w++ 해준 이유는
			if (w%7==0)					// 요일도 바꿔서 일요일이 되면 개행을 하기 위해!
			{
				System.out.println(); //개행 
			}
		}

		//달의 마지막 날짜가 출력 형식을 모두 채웠을 경우 (막날이 토요일)
		//이미 일요일 개행이 이루어졌기 때문에 
		// 이 경우에는 추가 개행을 하지 않도록 처리
		if (w%7!=0)
		{
			System.out.println();
		}
		System.out.println("======================");
	}
}
/*
『연도』를 입력하세요 : 2022
『월』을 입력하세요   : 1

     [ 2022년 1월 ]
 일 월 화 수 목 금 토
======================
                    1
  2  3  4  5  6  7  8
  9 10 11 12 13 14 15
 16 17 18 19 20 21 22
 23 24 25 26 27 28 29
 30 31
======================
계속하려면 아무 키나 누르십시오 . . .

*/