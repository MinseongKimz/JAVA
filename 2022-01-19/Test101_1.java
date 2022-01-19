// 실행 예)
// 년 월 일 입력(공백 구분) : 2022 1 19
// 2022년 1월 19일 → 수요일
// 계속하려면 아무 키나 누르세요.....

// 년 월 일 입력(공백 구분) : 2000 5 4
// >>2000년 5월 4일 → 목요일
// 계속하려면 아무 키나 누르세요....

/*
Test101의 선생님 풀이
*/

import java.util.Scanner;

class WeekDay
{
	private int y, m, d;


	//입력 받음
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(공백 구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}	

	// 날짜를 계산해서 몇요일인지 보낼꺼임
	public String week()
	{
		// 각 월의 마지막 날짜(각 월의 최대값)을 배열 형태로 구성
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//요일 이름에 대한 배열 구성
		String[] weekNames = {"일","월","화","수","목","금","토"};

		int nalsu;

		// 윤년에 따른 2월의 날 수 계산 
		// 입력 년도가 윤년이라면 2월의 마지막 날짜를 29일
		// 입력 년도가 윤년이아니라면 2월 마지막 날짜 28일

		if ((y%4==0 && y%100 !=0)||y%400==0) // 만약 윤년이라면
			months[1] =29; //배열 2번째 (2월) 값을 29
		else //윤년이 아니라면 
			months[1] =28;//배열 2번째 (2월) 값을 28
		
		// 1) 1년 1월 1일 부터 입력받은 년도의 이전년도 12월31 일 까지의 날수 계산

		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400; //(기본적으로 365 곱하고 4년마다 윤년 100년마다 아니고 400년마다 윤년)

		// 2) 입력받은 월의 이전 월 까지 날 수 계산 후 1)에 더해줌

		for (int i =0 ;i<(m-1) ;i++ )
			nalsu += months[i];
		
		// 3) 입력받은 날수 만큼 2)에 더해줌
		nalsu += d;
		//-----------------------------------------------------날수 계산 끝

		// 무슨 요일인지 확인 하기 위한 연산
		int w = nalsu % 7; // w = 0 이면 일요일 

		return weekNames[w];
	}

	// 출력 메소드
	public void print(String day)
	{
		System.out.printf(">>%d년 %d월 %d일 → %s요일\n",y, m, d, day);
	}
}

public class Test101_1
{
	public static void main(String[] args)
	{
		// weekDay 클래스 기반 인스턴스 호출
		WeekDay wd = new WeekDay();

		// 입력 메소드 호출
		wd.input();

		// 요일 산출 메소드 호출 및 결과 확인
		String result = wd.week();

		//최종 결과 출력 메소드 호출
		wd.print(result);
	}
}
/*
년 월 일 입력(공백 구분) : 1997 7 25
>>1997년 7월 25일 → 금요일
계속하려면 아무 키나 누르십시오 . . .
*/