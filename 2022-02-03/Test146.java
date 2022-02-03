/*=================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
===================================*/

// Calendar 클래스

// ○	실습 문제
//		오늘을 기준으로 입력받은 날짜만큼 후의 연, 월, 일, 요일을
//		확인하여 결과를 출력하는 프로그램을 구현한다.
//	※ 현재 날짜를 기준을 놀 수 더하는 연산 메소드

// 실행 예)
// 오늘 날짜 : 2022-2-3 목요일
// 몇 일 후의 날짜를 확인하고자 하십니까? : 200

//========[확인 결과]==========
// 200일 후 : xxxx-xx-xx x요일
//=============================
//계속하시려면 아무키나 누르세요...


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test146
{
	String Week(int w) // 숫자 받아서 
	{
		String week = "";
		switch (w)
		{
		case Calendar.SUNDAY: week = "일요일"; break;		// → case 1 : week = "일요일"; break;
		case Calendar.MONDAY: week = "월요일"; break;		// → case 2 : week = "월요일"; break;
		case Calendar.TUESDAY: week = "화요일"; break;		// → case 3 : week = "화요일"; break;
		case Calendar.WEDNESDAY: week = "수요일"; break;	//              :
		case Calendar.THURSDAY: week = "목요일"; break;		//				:
		case Calendar.FRIDAY: week = "금요일"; break;
		case Calendar.SATURDAY: week = "토요일"; break;		// → case 7 : week = "토요일"; break;		
		}
		return week; // 문자열 보내줄 꺼임
	}

	public static void main(String[] args) throws IOException
	{
		Test146 wk = new Test146(); // Week 메소드 쓰기위해 인스턴스 선언

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Calendar ob = new GregorianCalendar();

		int w = ob.get(Calendar.DAY_OF_WEEK);

		String week = wk.Week(w); // 
	
		System.out.printf("오늘 날짜 : %4d-%d-%d %s\n",ob.get(Calendar.YEAR), 
			ob.get(Calendar.MONTH)+1, ob.get(Calendar.DATE), week);

		int num;

		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			num = Integer.parseInt(br.readLine());
		}
		while (num<=0);	
		
		ob.add(Calendar.DATE, num); // 날짜 더해주는 메소드 add();

		w = ob.get(Calendar.DAY_OF_WEEK); // 재 초기화

		week = wk.Week(w); 
		System.out.println();
		System.out.println("========[확인 결과]==========");

		System.out.printf("%d일 후 : %4d-%d-%d %s\n", num ,ob.get(Calendar.YEAR), 
			ob.get(Calendar.MONTH)+1, ob.get(Calendar.DATE), week);

		System.out.println("=============================");
	}
}

/*
오늘 날짜 : 2022-2-3 목요일
몇 일 후의 날짜를 확인하고자 하십니까? : 200

========[확인 결과]==========
200일 후 : 2022-8-22 월요일
=============================
계속하려면 아무 키나 누르십시오 . . .

*/