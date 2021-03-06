/*
*작성한날 : 2022.01.05
*작 성 자 : 김민성
*파일이름 : Test007.java
*작성목적 : 수업. 변수와 자료형,키워드와 식별자
*/
// 변수와 자료형
// 키워드 및 식별자
// printf()


public class Test007
{
	public static void main(String[] args)
	{
		// 주요 변수 선언 및 초기화
		int a =10, b= 5;
		int c, d;

		// 연산 및 처리
		c= a + b;
		d= a - b;

		// 결과 출력
		System.out.println(c);
		System.out.println(d);
		//--> 15
		//    5 

		// 결과 출력을 [10 + 5 = 15]로 만들어보자
		System.out.println(a + " + " +  b + " = " + c); 
		//---> 10 + 5 = 15
		//     숫 문 숫 문 숫	
		// 자바에서는 서로 다른 자료형의 데이터 들끼리도 
		// + 연산이 가능하며,
		// 다른 어떤 자료형과 문자열 데이터의 + 연산 결과는 문자열.
		// 즉, 문자열 결합 연산자로써 + 임.
		// 29번째 줄 코드가 보기 좋아보이지 않는다..

		// print()/ println() / printf() / format() 

		// printf() / format() --- JDK 1.5 부터 지원되는 메소드 (서식 출력용 메소드)
		//System.out.printf("ㅁ + ㅁ = ㅁ", 10, 20, 30);
		System.out.printf("%d + %d = %d\n", 10, 20, 30); // %d = 정수형 자료형 
		System.out.printf("%d + %d = %d%n", 10, 20, 30); // \n 뿐만아니라 %n도 개행의 효과
		//--->10 + 20 = 30
		//	  10 + 20 = 30

		//System.out.printf("%d 와 %d\n" , 10, 3.14);    런타임 에러 발생! %d에 3.14..?
		//												 근데 왜 컴파일에서 아니고 런타임?
		//												java 에서 안에 뭘넣을지는 고민안하고 일단 문법적으로 맞아보여서..
		System.out.printf("%d 와 %f\n" , 10, 3.14);
		//---> 10 와 3.140000   소숫점 6자리 다나와 버리네.. %.숫자f 하면 숫자만큼 자릿수만 나옴
		System.out.printf("%.2f\n" ,3.141592);
		System.out.printf("%.3f\n" ,3.141592);
		System.out.printf("%.4f\n" ,3.141592);
		//---> 3.14
		//     3.142 반올림 발생
		//     3.1416반올림 발생
	}
}

/*최종 결과
15
5
10 + 5 = 15
10 + 20 = 30
10 + 20 = 30
10 와 3.140000
3.14
3.142
3.1416
계속하려면 아무 키나 누르십시오 . . .
*/