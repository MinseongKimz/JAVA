/*============================
  ■■■ 클래스 고급 ■■■
==============================*/

// 중첩 클래스

//outer
class InnerOuterTest
{
	static int a = 10;
	int b = 20;
	
	//inner
	class InnerNested
	{
		int c = 30;

		void write() //inner의 write();
		{
			System.out.println("inner 의 write()...");
			System.out.println("a : "+ a);
			System.out.println("b : "+ b);
			System.out.println("c : "+ c);
		}
	}

	void write()	// outer의 write()
	{
		System.out.println("outer 의 write()...");

		InnerNested ob1 = new InnerNested();
		ob1.write();	// --- inner의  write()메소드 호출
	}
}

public class Test126
{
	public static void main(String[] args)
	{
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();// --- outer의  write()메소드 호출
		/*outer 의 write()...
		inner 의 write()...
		a : 10
		b : 20
		c : 30*/
		
		//InnerNested ob3 = new InnerNested(); 에러 발생
		//InnerOuterTest.InnerNested ob3 = new InnerOuterTest.InnerNested(); // 마찬가지 에러(스태틱..)

		//※	중첩 내부 클래스(static 중첩 클래스)와는 달리
		//		외부 클래스의 인스턴스(객체)를 사용하지 않고
		//		단독으로 내부 클래스의 인스턴스를 생성하는 것은 불가능 하다.
		//		→ 외부 클래스의 객체를 사용하면
		//		   내부 클래스의 객체를 생성하는 것이 가능하다.

		//※ Test124.java와 비교해 볼것!!
		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested(); // ob2를 이용해서..
		ob5.write();
		/*inner 의 write()...
		a : 10
		b : 20
		c : 30*/						  	
		//								  ↑위의 식을 풀어 서 쓰면 이런것
		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();

		/*
		outer클래스명.inner클래스명 참조변수명 = new outer생성자().new inner생성자();
		*/

		/*
		cf) static → 중첩 내부 클래스 (Test124)
			outer클래스명.inner클래스명 참조변수명 = new outer클래스명.inner생성자
		*/
 




	}
}