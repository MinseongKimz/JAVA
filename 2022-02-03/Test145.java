/*=================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
===================================*/

// Calendar 클래스

/*
○	java.util.Calendar 클래스는
	날짜와 시간을 객체 모델링화 한 클래스로
	연, 월, 일, 요일, 시, 분, 초 까지의
	시간과 날짜와 관련된 정보를 제공한다.
	그리고, Calendar 클래스는 추상 클래스이므로 직접 객체를 생성할 수 없으며
	실제적인 메소드 구현은 Calendar 클래스의 서브 클래스인
	GregorianCalendar 클래스에 정의되어 있다.

	시스템으로부터 현재 시스템 시간 정보를 얻어올 때
	getInstance() 라는 정적(static) 메소드를 이용하여 객체를 생성할 수 있다.
	생성된 Calendar 클랫느느 객체는 시스템의 현재 날짜와 시간 정보를 가지며,
	이 객체가 생성되면 갖고있는 시간 정보들은
	get() 메소드를 이용하여 쉽게 가져올(사용할) 수있다.

	getInstance() 메소드는 내부적으로 GregorianCalendar 객체를 생성하여
	돌려주기 때문에 GregorianCalendar 객체를 직접 생성하여 시간 정보를
	구할 수도 있다.
*/

// ○	실습 문제
//		사용자로부터 연, 월을 입력받아
//		달력을 그려주는(출력하는) 프로그램을 구현한다.
//		단, 만년달력이 아니라 Calendar 클래스를 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 연도 입력 : 0
// 연도 입력 : 2022
// 월 입력   : -2 
// 월 입력   : 16
// 월 입력   : 7
/*
	   [2022년 7월]

일	월	화	수	목	금	토	
===========================
					 1	 2
 3	 4	 5	 6	 7	 8	 9
10	11	12	13	14	15	16	
17	18	19	20	21	22	23
24	25	26	27	28	29	30
31
============================
*/

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test145
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y, m;


		do
		{
			System.out.print("연도 입력 : ");
			y  = Integer.parseInt(br.readLine());
		}
		while (y<=0); // 연도 0 이하 계속 묻기

		do
		{
			System.out.print("월 입력 : ");
			m  = Integer.parseInt(br.readLine());
		}
		while (0>=m || m>=13); // 월 묻기 

		Calendar ob = new GregorianCalendar(); // GregorianCalendar 클래스 기반 인스턴스 생성 
											   // 업캐스팅


		//날짜 세팅
		ob.set(y,m-1,1); // y년 m월 1일 부터 달력 찍기 (m은 index이기 때문에 -1)

		int start = ob.get(Calendar.DAY_OF_WEEK); // 시작일
												// 입력값 2022년 2월
		//int end = ob.getMaximum(Calendar.MONTH);  // 11 출력 (index 0부터 시작)
		//int end = ob.getMaximum(Calendar.DATE);  // 31 출력 (모든 달의 최댓값 31)
		int end = ob.getActualMaximum(Calendar.DATE);  //28 출력
		//int end = ob.getLeastMaximum(Calendar.DATE);// 28출력


		//System.out.println(end); //테스트
		//System.out.println(start); //테스트
		
		
		System.out.println();
		System.out.printf("     [ %d년 %d월 ]\n",y,m);
		System.out.println(" 일 월 화 수 목 금 토 ");
		System.out.println("======================");

		for (int i=0;i<start-1 ;i++ ) // 
		{
			System.out.print("   ");// 맞춰서
		}

		for (int i=1;i<=end;i++ )// 1 ~ 달배열 마지막 값까지 
		{
			System.out.printf("%3d",i); // 숫자 출력
						
			if (start%7==0)					
				System.out.println(); //개행 
			start++;
		}
		if (start%7!=1)  //end%7==0 이것도 됨			//2022 년 4월 넣어보면 됨
			System.out.println();						//만년달력때는 0 이엿는데 그러면 안됨.
		System.out.println("======================");	//여기선 일요일이 1임
	}
}
/*
연도 입력 : 2022
월 입력 : 2

     [ 2022년 2월 ]
 일 월 화 수 목 금 토
======================
        1  2  3  4  5
  6  7  8  9 10 11 12
 13 14 15 16 17 18 19
 20 21 22 23 24 25 26
 27 28
======================
계속하려면 아무 키나 누르십시오 . . .
*/