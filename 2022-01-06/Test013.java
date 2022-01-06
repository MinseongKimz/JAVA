/*===========================================
■■■ 자바 기본 프로그래밍 ■■■
=============================================*/
// 퀴즈
// 직사각형의 넓이와 둘레를 구하는 프로그램을 작성한다.
// 가로: 10, 세로: 20

//실행 예) 
//넓이 : xxxx
//둘레 : xxxx
//계속하려면 아무 키나 누르세요....

public class Test013
{
	public static void main(String[] args)
	{
		//변수 선언
		int width, vertical, area, length; // 가로 세로 넓이 둘레
		width = 10;
		vertical = 20;

		//연산 처리
		area = width * vertical;
		length = (width + vertical) * 2;
        
		//결과 출력
		System.out.println("넓이 :  " + area);
		System.out.println("둘레 :  " + length);

		
	}
}

/*
출력 결과
넓이 :  200
둘레 :  60
계속하려면 아무 키나 누르십시오 . . .
*/