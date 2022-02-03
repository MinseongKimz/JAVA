// 같이 푼 풀이


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test146_1 
{
	public static void main(String[] args) 
	{
		// Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// Calendar 클래스 기반 인스턴스 생성
		Calendar now = Calendar.getInstance();

		//주요 변수 선언
		int nalsu;
		int y, m, d, w;
		String[] week = {"일","월","화","수","목","금","토"};

		//현재의 연 월 일 요일 확인(가져오기 get()메소드)
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);

		//현재의 연, 월, 일, 요일 확인 결과 출력
		System.out.println("오늘 날짜 : " + y +"-"+ m +"-" + d +" " + week[w-1]+"요일" );

		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);	

		// check~!!!
		now.add(Calendar.DATE, nalsu);

		//결과 출력
		System.out.println();
		System.out.println("========[확인 결과]==========");
		System.out.printf("%d일 후 : %tF %tA \n", nalsu, now, now);
							// %tF : 날짜를 표현해줌(객체 넣기)
							// %tA : 요일을 표현해줌            ---check!!
		System.out.println("=============================");
	}
}
/*
오늘 날짜 : 2022-2-3 목요일
몇 일 후의 날짜를 확인하고자 하십니까? : 200

========[확인 결과]==========
200일 후 : 2022-08-22 월요일
=============================
계속하려면 아무 키나 누르십시오 . . .
*/