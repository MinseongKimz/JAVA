/*================================
  ■■■ 클래스와 인스턴스 ■■■
==================================*/
 
// 클래스 설계
// 배열 활용
// 접근제어지시자와 정보 은닉

// 사용자로부터 년, 월, 일을 입력 받아
// 해당 날짜의 요일을 출력하는 프로그램을 구현한다.
// 단 달력 클래스는 사용하지 않는다.
// 또한 클래스의 개념을 활용해서 작성할 수 있도록 한다.(WeekDay 클래스 설계)
// 그리고 배열의 개념도 적용시켜서 작성한다..
// 접근제어지시자의 개념도 확인하여 작성할 수 있도록 한다.
// 최종적으로 WeekDay 클래스 설계를 통해
// Test101 클래스의 main() 메소드가 정상적으로 프로그램 실행될 수 있도록 한다.

// ※ 1년 1월 1일 → 월요일 

// 실행 예)
// 년 월 일 입력(공백 구분) : 2022 1 19
// 2022년 1월 19일 → 수요일
// 계속하려면 아무 키나 누르세요.....

// 년 월 일 입력(공백 구분) : 2000 5 4
// 2000년 5월 4일 → 목요일
// 계속하려면 아무 키나 누르세요.....

import java.util.Scanner;

class WeekDay
{
	private int year;
	private int month;
	private int date;
	private String what;

	//입력 받음
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(공백 구분) : ");
		year = sc.nextInt();
		month = sc.nextInt();
		date = sc.nextInt();
	}	

	// 날짜 계산 메소드
	public String totDay()
	{
		int YearOfDay = 0;
		int MonthOfDay = 0;
		int tot;

		// 년 누적일 
		for (int i=1;i<=year-1 ;i++)
		{
			if ((i%4==0 && i%100!=0)||i%400==0)
				YearOfDay += 366;
			else
				YearOfDay += 365;
		}
		int[] mon = {31,28,31,30,31,30,31,31,30,31,30,31};	

		// 월 누적일 
		for (int i=0;i<(month-1) ;i++ )
		{	
			if ((year%4==0 && year%100!=0)||year%400==0)
				mon[1] = 29;
			MonthOfDay += mon[i];
		}
		//최종 누적 일
		tot = YearOfDay + MonthOfDay + date;
		
		//누적일 나눈 나머지
		int days = tot%7;
		
		switch (days)
		{
		case 1:
			what = "월요일"; break;
		case 2:
			what = "화요일"; break;
		case 3:
			what = "수요일"; break;
		case 4: 
			what = "목요일"; break;
		case 5:
			what = "금요일"; break;
		case 6:
			what = "토요일"; break;
		case 0: 
			what = "일요일"; break;
		}
		return what;
	}

	// 출력 메소드
	public void write()
	{
		System.out.printf("%d년 %d월 %d일 → %s\n", year, month, date, what);
	}
}

public class Test101
{
	public static void main(String[] args)
	{
		WeekDay ob1 = new WeekDay();
		ob1.input();
		ob1.totDay();
		ob1.write();		
	}
}
/*
년 월 일 입력(공백 구분) : 1997 7 25
1997년 7월 25일 → 금요일
계속하려면 아무 키나 누르십시오 . . .
*/