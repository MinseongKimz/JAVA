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

public class Test021
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		System.out.print("이름,국어,영어,수학 입력 (『,』로 구분) : ");

		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); // sc 를 새로 갱신.
		//			입력 : 김민성,20,22,22 
		//sc = new Scanner(김민성,20,22,22).useDelimiter("\\s*,\\s*");   \s* [,] \s* 
		//									공백문자로 쓰겟다    모든 문자열 [,] 모든 문자열 
		//		모든 문자열 사이에 [,] 를 공백문자로 사용하겠다! 



		
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;

		System.out.println("\n >> 이름 : " + name);
		System.out.println(">> 총점 : " + tot);


	}
}

/* 실행결과 
이름,국어,영어,수학 입력 (『,』로 구분) : 김민성,20,2,22

 >> 이름 : 김민성
>> 총점 : 44
계속하려면 아무 키나 누르십시오 . . .
*/