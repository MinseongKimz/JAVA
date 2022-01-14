/*==========================================
  ■■■클래스와 인스턴스 ■■■
============================================*/

// ※ CircleTest.java 와 세트임

// 원의 넓이와 둘레 구하기
// 원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.
// (클래스명 : CircleTest) → CircleTest.java

// 원의 넓이 = 반지름 * 반지름 *3.141592
// 원의 둘레 = 반지름 * 2 *3.141592

// 실행 예)
// 반지름 입력 : xx

// >> 반지름이 xx 인 원의
// >> 넓이 : xxxxx.xx
// >> 둘레 : xxxxx.xx
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;

public class Test073
{
	public static void main(String[] args)  throws IOException  // 
	{	
		// CircleTest 인스턴스 생성
		CircleTest cr = new CircleTest();//           ↑

		//입력 메소드 호출			//                ↑
		cr.input();                // input 메소드에서 한 throws IOException 처리가 
		// 넓이 연산 메소드 호출   // 여기선 메인 메소드에 떨어져 버려서 또 메인에서 버릴 필요가 있다.
		double area = cr.calArea();
		// 둘레 연산 메소드 호출
		double length = cr.calLength();
		// 출력 메소드 호출
		cr.print(area, length); //데이터 타입과 순서 중요!
	}
}