/*============================
  ■■■ 클래스 고급 ■■■
==============================*/

// 중첩 클래스

//outer
class Test2
{
	static int a = 10;	// 전역변수, Test2의 멤버변수, static변수
	int b = 20;			// 전역변수, Test2의 멤버변수, non-static변수(instance 변수)

	void write()	//▶ 첫 번째 write() 메소드
	{
		System.out.println("write()...①");
		final int c = 20;//지역 변수, 상수화된변수(값이 변하지 않는 변수)					
		int d = 40;		 //지역 변수, 값이 수시로 변할 수 있는 변수
		
		//inner
		class LocalTest // 메소드 안에 선언된 클래스 (지역클래스)
		{
			void write() //▶ 두 번째 write() 메소드
			{
				System.out.println("write()...②");
				System.out.println("a : "+ a);
				System.out.println("b : "+ b);
				System.out.println("c : "+ c);
				//System.out.println("d : "+ d); // 에러발생 컴파일 에러
				// d 는 계속 바뀌는 변수인데 탄생시점을 안다 해도
				// d 를 어떻게 담아낼꺼인지 ?? c는 final이라 바뀌지 않으니깐 ㄱㅊ
			}
		}
		// ※	변수 c와 d 는 둘다 지역변수 이지만..
		//		c는 final변수이기 때문에
		//		두 번째 write() 메소드에서 언제 접근하더라도
		//		고정된 값임을 보장받을수 있다.
		//		반면에 d는 그 값이 수시로 변동될 수 있는 상황이므로
		//		LocalTest 클래스의 인스턴스 생성 시점을
		//		언제가 될지 알 수 없기 때문에
		//		그렇다면 d에 어떤 값이 담겨있는지 보장 받을 수 없기 때문에
		//		변수 d에 접근하는 것을 피할 수 있도록 문법적으로 처리
		//d = 10;
		//d -= 30;

		LocalTest lt = new LocalTest();
		lt.write();  // -- 두번째 write() 메소드 호출

		//d+=10;
	}
}

// main() 메소드를 포함하고 있는 외부에 다른 클래스
public class Test125
{
	public static void main(String[] args)
	{
		Test2 ob = new Test2();
		ob.write(); //-- 첫 번째 write 메소드가 호출
	}
}
/*
write()...①
write()...②
a : 10
b : 20
c : 20
계속하려면 아무 키나 누르십시오 . . .
*/