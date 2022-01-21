/*=================================================
  ■■■ 메소드 중복정의(Method Overloading) ■■■
===================================================*/

// Method Overloading이 가능한 형태와 불가능한 형태

public class Test106
{
	public static void main(String[] args)
	{
		
	}

	public static void print() {}
	//public static void print() {} 아예 똫같은 메소드 중복선언 x
	public static void print(int i) {}
	//public static void print(int j) {} 매개변수 이름이 다르지만 타입같고 수도 같음 X
	public static void print(char c) {}	// 되기는 한데 자동형변환 규칙을 체크하자
	public static void print(int i, int j) {} // 가능 수가 다름 위랑
	public static void print(double d) {} // 타입 달라서 가능 
	//public static void print(double e) {} {return 10.0;} 보이드 타입에서 리턴X 

	//public static double print(double e) {return 10.0;} 반환한다 뭐 이런 형태로 우린 다르게 보이지만
	// 메인에서 r = print(3.14); 해도 대입연산자 오른쪽먼저 보기 때문에 사실 
	// print(3.14) 와 다를게 없는 구문이라 
	// 위에 20번구문과 충돌이 일어난다..
}