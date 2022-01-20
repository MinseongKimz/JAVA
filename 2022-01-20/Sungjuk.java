// 2. Sungjuk 클래스
//    - 인원수를 입력받아, 입력받은 인원 수 만큼
//		이름 , 국어점수, 영어점수, 수학점수를 입력받고
//	    총점과 평균을 산출하는 클래스로 설계할 것
//		속성 : 인원수, Record 형태의 배열
//		기능 : 인원수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력
import java.util.Scanner;

public class Sungjuk
{
	int inwon;     // 인원수
	Record[] rec;// Record 배열 (학생 한명당 Record 배열 방 한개 활용)
				// Record 기반으로 생성된 객체만 담아낼 수 있는 배열

	// 주요 메소드 정의( 기능 구성 )
	public void set() // 인원수 입력
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("입력 처리할 학생수 입력(명, 1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);
		//check
		// Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는 
		// 배열방을 inwon만큼 생성한 것이지 
		// Record 클래스의 인스턴스를 생성한 것은 아니다.

		rec = new Record[inwon];
	}

	public void input() // 상세 데이터 입력(총점 및 평균 산출 기능 포함)
	{
		Scanner sc = new Scanner(System.in);
		
		String[] title = {"국어 점수 : " , "영어 점수 : " , "수학 점수 : "};

		//인원 수 만큼 반복 → 인원수에 기반하여 만들어진 배열의 길이 만큼 반복
		for (int i=0;i<inwon ;i++ ) //== for (int i=0; i<rec.length; i++)
		{
			// check~
			// Record 클래스 기반의 인스턴스 생성
			rec[i] = new Record();
			System.out.printf("%d번째 학생의 이름 입력 : ", (i+1)); 
			
			rec[i].name = sc.next();

			/*
			System.out.print("국어 점수 : ");
			rec[i].kor = sc.nextInt();
			System.out.print("영어 점수 : ");
			rec[i].eng = sc.nextInt();
			System.out.print("수학 점수 : ");
			rec[i].mat = sc.nextInt();
			*/
			/*
			System.out.print("국어 점수 : ");
			rec[i].score[0] = sc.nextInt();
			System.out.print("영어 점수 : ");
			rec[i].score[1] = sc.nextInt();
			System.out.print("수학 점수 : ");
			rec[i].score[2] = sc.nextInt();
			*/
			for (int j = 0;j<title.length ;j++ )   // 우리가 Record 클래스 만들떄
			{									   // 국영수를 int[] score = new int[3]으로 만듦
				// 안내 메세지 출력
				System.out.print(title[j]);
				
				// 사용자가 입력한 데이터를 스코어 베열에 담아내기 .
				rec[i].score[j] = sc.nextInt();		// score[0] = 국어 점수
													// score[1] = 영어 점수
													// score[2] = 수학 점수
				// 국어, 영어, 수학 점수 데이터를 반복적으로 입력받는 동안
				// 총점에 대한 누적 산출
				rec[i].tot += rec[i].score[j];
			}

			//평균 산출 하기
			rec[i].avg = rec[i].tot / 3.0;
		}
	}

	public void print() // 결과 출력
	{
		ranking();
		//개행
		System.out.println();
		

		//학생한명당 반복 출력 구문 구성
		for (int i=0;i<rec.length ;i++ )
		{	
			
			// 이름 출력
			System.out.printf("%5s",rec[i].name);
			
			// 성적( 국어, 영어, 수학) 반복 출력	// 우리가 Record 클래스 만들떄
			for (int j =0;j<3;j++ )				// 국영수를 int[] score = new int[3]으로 만듦
				System.out.printf("%4d", rec[i].score[j]);
				
			//총점, 평균 출력
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);

			//check~
			// 석차 출력 구문 추가~
			System.out.printf("%5d", rec[i].rank);

			//개행
			System.out.println();
		}

	}
	// 석차 산출 메소드 추가
	// 석차 산출 과정에서 연산에 필요한 데이터 이미 존재(tot) → 매개변수 없음
	//  Record 배열의 rank 속성 초기화 기능 수행 → 반환 자료형 void
	//  클래스 내부에서 활용할 메소드로 정의 → private 사용
	private void ranking()
	{
		// 모든 학생들의 등수 (석차 , rank) 를 1로 초기화
		for (int i=0;i<inwon ;i++ )
			rec[i].rank = 1;
		
		//등수 산출													4명이라면
		for (int i =0;i<inwon-1 ;i++ )// --큰 싸이클 → 비교기준 → 0 1 2
		{
			for (int j=i+1;j<inwon ;j++ )//-- 작은싸이클 → 비교대상
			{
					
				if (rec[i].avg>rec[j].avg)	// 비교기준의 평균이 비교 대상의 평균보다 크다면
				{
					rec[j].rank++; // 비교 대상의 rank 를 1만큼 증가
				}
				else if (rec[j].avg> rec[i].avg) // 비교 대상의 평균이 비교기준의 평균보다 크다면
				{
					rec[i].rank++; // 비교 기준의 rank 를 1만큼 증가
				}
			}
		}
	}



}