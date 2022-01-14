/*==========================================
  ■■■클래스와 인스턴스 ■■■
============================================*/

// 직사각형 클래스 설계 실습
/*
직사각형의 넓이와 둘레 계산 → 클래스 표현 

클래스의 정체성 → 직사각형
클래스의 속성   → (가로, 세로 이걸 고르겠다) 넓이, 부피, 둘레 ,무게 ,재질, 색.....
클래스의 기능	→ 넓이 계산, 둘레 계산, 가로세로 입력, 결과출력 .....등등

객체를 구성		→ 데이터(속성, 상태) + 기능(동작, 행위)

클래스 설계		→		변수	 +	  메소드

class 직사각형
	//데이터(속성, 상태) → 변수 (순서 의미 없음)
		int 가로, 세로;

	//기능( 동작 ,행위)  → 메소드 (순서 의미 없음)
	가로세로 입력()
	{
	}

	둘레계산()
	{
	}
	
	넓이계산()
	{
	}

	결과 출력()
	{
	}
*/
import java.util.Scanner; // import 구문은 클래스 설계가 되기 전에 제일 먼저 작성되어야 한다.

class Rect // 직사각형 클래스 설계
{
	// Scanner sc = new Scanner(System.in); 여기다 선언하면 Rect 클래스를 생성할 때 부터 스캐너 클래스가 메모리에 올라감

	int w, h;	///가로, 세로

	void input()// 가로세로 입력 메소드
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("가로 입력 : ");
		w = sc.nextInt();

		System.out.print("세로 입력 : ");
		h = sc.nextInt();
		
	}

	int calLength()  // 둘레 계산 메소드
	{
		int result;

		result  = (w+h)*2;

		return result;
	}

	int calArea()    // 넓이 계산 메소드 
	{	
		int result;
		
		result = w * h;
		
		return result;
	}

	void print(int a, int l)		// 결과 출력 메소드
	{
		// 넓이랑 둘레를 호출하게 되면 인트형으로 받아야 하기 때문에
		// 매개변수로 int a, int l 해주었다.
		//가로 : 
		//세로 : 
		//넓이 :
		//둘레 : 
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + l);

	}
}


// ※ 하나의 자바 파일(.java)에 여러개의 클래스(class)를 설계할 수 있을까????
// 가능하다 하지만, 『public class』는 하나만 쓸 수 있다.
// 그리고 저장할때는 public 이 달린 클래스 이름으로 저장해라.
// 일반적으로는 하나의 파일에 하나의 클래스를 설계한다.

// 또한, 여러개의 클래스가 설계된 파일을 컴파일하게 되면
// 내부에 설계된 클래스의 수만큼 클래스 파일(.class)이 파생된다.


public class Test072
{
	public static void main(String[] args)
	{
		// Rect 클래스 기반의 인스턴스 생성
		Rect ob = new Rect();

		//입력 메소드 호출
		ob.input();
		// 넓이 연산 메소드 호출
		int area = ob.calArea();
		// 둘레 연산 메소드 호출
		int length = ob.calLength();
		// 출력 메소드 호출
		ob.print(area, length); //데이터 타입과 순서 중요!
	}
}
/* 실행 결과
가로 입력 : 20
세로 입력 : 30
가로 : 20
세로 : 30
넓이 : 600
둘레 : 100
계속하려면 아무 키나 누르십시오 . . .
*/