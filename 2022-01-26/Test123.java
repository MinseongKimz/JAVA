/*============================
  ■■■ 클래스 고급 ■■■
==============================*/

// 인터페이스(Interface)

//○ 실습 문제
// 성적 처리 프로그램을 구현한다.
// 단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백 구분) : 2280946 김민성
// 국어 영어 수학 점수 입력 (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 2290847 김민성2
// 국어 영어 수학 점수 입력 (공백 구분) : 85 70 65

// 2280946 김민성	90 100 85	총점xxx   평균xxxx
//					수  수 우 
// 2290847 김민성2	85  70 65	총점xxx	  평균xxxx
//					우  미 양
// 계속하려면 아무 키나 누르세요...

// 속성만 존재하는 클래스 → 자료형 활용

import java.util.Scanner;

class Record
{
	String hak, name; // 학번 이름
	int kor, eng, mat;
	int tot, avg;	  // 총점 평균
}

interface Sungjuk
{
	public void set();		//인원 세팅
	public void input();	//데이터 입력
	public void print();	//결과 출력
}

// 문제 해결 과정해서 설계 해야 할 클래스 Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk 
{
	private int inwon;
	private Record[] rec;// Record 배열 (학생 한명당 Record 배열 방 한개 활용)
						 // Record 기반으로 생성된 객체만 담아낼 수 있는 배열

	@Override
	public void set() //인원 세팅 메소드 재정의 
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>10);

		rec = new Record[inwon];
	}

	@Override
	public void input() // 데이터 입력 메소드 재정의
	{
		Scanner sc = new Scanner(System.in);

		for (int i=0;i<inwon ;i++ )
		{
			// Record 클래스 기반의 인스턴스 생성
			rec[i] = new Record();

			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분): ", (i+1)); 
			rec[i].hak = sc.next(); // 학번
			rec[i].name = sc.next(); // 이름

			System.out.print("국어 영어 수학 점수 입력 (공백 구분) : "); 
			rec[i].kor = sc.nextInt(); // 국어 점수
			rec[i].eng = sc.nextInt(); // 영어 점수
			rec[i].mat = sc.nextInt(); // 수학 점수

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3;
		}
	}

	@Override
	public void print() //결과 출력 메소드 재정의
	{
		System.out.println(); // 개행 

		for (int i=0;i<rec.length ;i++ ) //입력받은 인원 만큼
		{
			System.out.printf("%7s %5s	",rec[i].hak,rec[i].name); //학번과 이름 출력
			System.out.printf("%3d %3d %3d   %3d %3d\n", rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg); // 점수들 출력

			System.out.print("                         "); // 국 영 수 맞춰서 수 우 미 밑에 있게 맞췄습니다..
			System.out.printf("%s %2s %2s\n",panjung(rec[i].kor),panjung(rec[i].eng),panjung(rec[i].mat));
			// panjung 메소드에 각 점수들을 보내서 리턴값을 출력하면 되는거라 이렇게 작성
		}
	}

	// 내부적으로 등급에 대한 판정을 수행할 메소드
	private String panjung(int score) // 숫자 받아서 
	{
			String grade; // 등급 담아서 리턴으로 보내줄 문자열

			switch (score%10) // 숫자 나누기 10 해서 앞자리만 ..
			{	
				case 10: case 9: grade = "수"; break; //100~90 = 수

					case 8: grade ="우"; break;

					case 7: grade = "미"; break;

					case 6: grade = "양"; break;

					default: grade ="가"; break; //60점 아래 가 
			}
			return grade;	
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test123
{
	public static void main(String[] args)
	{
		  Sungjuk ob = new SungjukImpl();
		 //SungjukImpl ob = new SungjukImpl();

		// 문제 해결 과정에서 작성해야 할 ob구성

		ob.set();
		ob.input();
		ob.print();
	}
}