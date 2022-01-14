/*==========================================
  ■■■클래스와 인스턴스 ■■■
============================================*/

// ※ Test073.java 와 세트임
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
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CircleTest
{
	//변수 선언
	int r;
	final double PI = 3.141592;

	// 클래스 생성 위한 메인 메소드
	public static void main(String[] args) 
	{
	}

	// 반지름 입력 받기 위한 입력 메소드
	void input() throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}
	
	// 둘레 계산 메소드
	double calLength()  
	{
		double result;

		result  = r * 2 * PI;

		return result;
	}

	// 넓이 계산 메소드
	double calArea()
	{
		double result;

		result = r * r * PI;

		return result;
	}

	// 출력 메소드
	void print(double a, double l)	
	{
		System.out.printf("반지름이 %d 인 원의 \n",r);
		System.out.printf(">>넓이 : %.2f\n" , a);
		System.out.printf(">>둘레 : %.2f\n" , l);
	}

}