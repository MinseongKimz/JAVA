/*===========================================
■■■ 자바 기본 프로그래밍 ■■■
=============================================*/

// 자바의 기본 입출력 : java.util.Scanner
// ※ java.util.Scanner
//    단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//    디폴트(default)로 사용되는 단락문자는 공백이다.
//    작성된 다음 토큰은 next() 메소드를 사용
//    다른 형태(자료형)의 값으로 변환할 수있다.

import java.util.Scanner;

public class Test019
{
	public static void main(String[] args)  //throws IOException 도 필요 없다..
	{
		// Scanner 클래스 기반의 인스턴스 생성
		Scanner sc = new Scanner(System.in);// BufferedReader보다 훨짧네..? 하지만 벗.
											// 기능이 많은 scanner 성능(속도)이..떨어짐.
		
		//주요 변수 선언
		String name;
		int kor, eng, mat;



		//연산 및 처리

		System.out.print("이름을 입력하세요 : ");
				
		name = sc.next(); //readLine()같은 문자열 형태 name에 대입/

		System.out.print("국어점수 입력 : ");
		kor = sc.nextInt();  // 정수형으로 받기위해, Integer.parseInt(sc.next())이런거 안해됨
		
		System.out.print("영어점수 입력 : ");
		eng = sc.nextInt();

		System.out.print("수학점수 입력 : ");
		mat = sc.nextInt();



		//결과 출력
		System.out.println();
		System.out.println(">>이름 : " + name);
		System.out.println(">>총점 : " + (kor+eng+mat));

	}
}

/*출력 결과
이름을 입력하세요 : 김민성
국어점수 입력 : 23
영어점수 입력 : 312
수학점수 입력 : 23

>>이름 : 김민성
>>총점 : 358
계속하려면 아무 키나 누르십시오 . . .

*/