/*===========================================
■■■ 자바 기본 프로그래밍 ■■■
=============================================*/

// 퀴즈
// 사전에 부여된 반지름 정보를 통해
// 원의 넓이와 둘레를 구하는 프로그램을 구현한다
// 반지름 : 10

//실행 예)
// 넓이 : xxxx
// 둘레 : xxxx
// 계속하려면 아무 키나 누르세요...

public class Test012
{
	public static void main(String[] args)
	{	

		/* ---------내가 풀이한 내용-----------

		// 주요 변수 선언
		int r = 10;				//r은 반지름
		double pi, a , b;		// a = 넓이 , b = 둘레
		pi= 3.141592;			// pi = 원주율
		
		//연산 및 처리  
		a = r * r * pi;
		b = 2 * r * pi;
		
		//출력
		System.out.println("넓이 :  " + a);
		System.out.println("둘레 :  " + b);

		*///----------------------------------

		//------함께 풀이한 내용--------------
		int r = 10;			//반지름
		//double pi = 3.141592; //원주율
		// 만약에 파이값을 코드를 잘못 써서 바뀌면 어떻하지..?
		//※ 『final』 키워드 : 변수의 상수화! 
		final double PI = 3.141592; // 이러면 ++pi 이런거 절대안됨.
		// 암묵적 룰 : final 쓴 변수명은 다 대문자로 쓰자!
		// final int RAINBOW_COLOR;
		
		double area, length;	//원의 넖이, 둘레
		
		//연산 및 처리
		//넓이 연산  >> 원의 넓이 = 반지름 * 반지름 * 파이
		area = r * r * PI;	

		//둘레 연산 >> 원의 둘레 = 2 * 반지름 * 파이
		length = 2 * r * PI;


		//결과 출력
		
		//System.out.println("넓이 :  " + area);
		//System.out.println("둘레 :  " + length);

		System.out.printf("넓이 : %.2f\n", area);
		System.out.printf("둘레 : %.2f\n", length);
	} 
}

/*출력결과
넓이 :  314.1592
둘레 :  62.83184
계속하려면 아무 키나 누르십시오 . . .

느낀점. final을 알게 되었음.
        변수명을 정하는 규칙을 배움.
*/