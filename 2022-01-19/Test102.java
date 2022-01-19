/*================================
  ■■■ 클래스와 인스턴스 ■■■
==================================*/

// static 변수(클래스 변수)와 static 메소드(클래스 메소드)

// ※ 실습 편의상 접근제어 지시자 생략


public class Test102
{
	// 클래스 변수 또는 클래스 메소드는
	// 클래스 정보가 로딩되는 순간 메모리 할당이 이루어지며
	// 클래스 이름 또는 객체(인스턴스) 를 통해 접근할 수 있다. 둘다 ~
	// 즉 『new』연산자를 통해 메모리를 할당 받지 않아도 
	// 사용이 가능하다는 것 이다.

	static int a = 10; //-- static 변수(클래스 변수, 정적 변수)

	//	인스턴스 변수 또는 인스턴스 메소드는
	//	동일한 클래스의 메소드에서는 바로 접근하는 것이 가능하지만
	//	클래스 메소드에서는 접근할 수 없다. 
	//  먼저 태어난 친구가 미래에 태어날 친구를 호출이 가능할까??



	int b = 20;	// --non-static 변수(인스턴스 변수, 동적 변수)

	void write() // 인스턴스 메소드 
	{
		System.out.println("클래스 변수  a : " + a);
		System.out.println("인스턴스 변수 b :" + b);
	}

	static void print() // static 메소드 클래스 메소드 
	{
		System.out.println("클래스 변수 a : " + a);
		//System.out.println("인스턴스 변수 b " + b); // print메소드가 메모리 올라갔을 떄	
		// 컴파일 에러 ~!								b가 메모리에 올라가있음? No						
	}												



	public static void main(String[] args)
	{
		System.out.println("main() → 클래스 변수 a : " + Test102.a);
		// 클래스 변수에 접근하기 위해서는
		// 『클래스명.변수명』의 형태로 클래스의 이름을 통해 접근하는것이 가능하다.
		// main() → 클래스 변수 a : 10

		System.out.println("main() → 클래스 변수 a : " + a);
		// 같은 클래스안에 있기 때문에 가능 클래스 이름을 생략 가능하다.
		// main() → 클래스 변수 a : 10

		Test102.print(); // 클래스 변수 a : 10
		print(); // 클래스 변수 a : 10
		// 클래스 이름 생략함 원래는 『클래스명.메소드명()』으로 호출이 맞지만
		// 같은 클래스 내에 있기 때문에 이렇게 호출이 가능하다.

		//System.out.println("main() → 인스턴스 변수 b : " + b);
		//error: non-static variable b cannot be referenced from a static context

		//System.out.println("main() → 인스턴스 변수 b : " + Test102.b);
		//인스턴스변수인데 클래스변수 호출하듯이 못함
		
		//Test102.write();
		//write();         인스턴스 메소드를 클래스 메소드처럼 x

		// Test102 인스턴스 생성
		Test102 ob = new Test102();

		//System.out.println("main() → 인스턴스 변수 b : " + b); 에러 발생 (컴파일 에러) 

		// 생성된 인스턴스를 통한 인스턴스 변수 접근

		System.out.println("main() → 인스턴스 변수 b : " + ob.b);  // 가능 main() → 인스턴스 변수 b : 20

		//write(); // 불가능
		ob.write();
		//클래스 변수 a : 10
		//인스턴스 변수 b : 20

		// 생성된 인스턴스를 통한 클래스 변수 접근
		System.out.println("main() → 클래스 변수 a : " + ob.a); // 가능
		// main() → 클래스 변수 a : 10
		
		// 생성된 인스턴스를 통한 클래스 메소드 접근
		ob.print();				// 가능
		// 클래스 변수 a : 10

		// ※ 클래스 변수나 클래스 메소드는
		//	  『생성된인스턴스명.변수명』
		//    『생성된인스턴스명.메소드명()』
		//	  의 형태로 접근(호출) 이 가능하지만
		//	  『클래스명.변수명』
		//    『클래스명.메소드명()』
		//    의 형태로 접근(호출) 하는것이 일반적이다.



		System.out.println("main() → 클래스 변수 a : " +a);
		System.out.println("main() → 클래스 변수 a : " + Test102.a);
		System.out.println("main() → 클래스 변수 a : " + ob.a);
		//main() → 클래스 변수 a : 10
		//main() → 클래스 변수 a : 10
		//main() → 클래스 변수 a : 10

		System.out.println();

		// Test102 클래스 기반 인스턴스 생성
		Test102 ob2 = new Test102();

		ob2.a = 10000; // 클래스 변수 초기화
		ob2.b = 20000; // 인스턴스 변수 초기화

		System.out.println("ob2 확인--------------------");
		ob2.write();
		//ob2 확인--------------------
		//클래스 변수  a : 10000
		//인스턴스 변수 b :20000

		System.out.println("ob 확인---------------------");
		ob.write();
		//ob 확인---------------------
		//클래스 변수  a : 10000  ?! ob2 에서 바꾼건데 ob 까지 바뀌어 버렸다.
		//인스턴스 변수 b :20

	}
}