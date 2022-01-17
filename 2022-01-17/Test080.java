/*==========================================
  ■■■클래스와 인스턴스 ■■■
============================================*/

// 생성자(Constructor)와 초기화 블럭(Initialized Block)


public class Test080
{	/*     클래스 내에서 메소드가 아니라 걍 연산때리면 에러
	int n;
	int m;
	n = 100;
	m = 200;
	*/      

	/*int n = 100;
	int m = 200;*/ // 이건 또 됨 

	
	int n;
	int m;


	{ //초기화 블럭(Initialized Block{}) 
		n = 20;
		m = 40;
		System.out.println("초기화 블럭 실행...");
	}

	Test080() //생성자(Constructor) 생성자가 중요해서 마지막에 실행됨. 
	{			// 뒤에 실행되는 구문은 앞의 구문을 다 덮기 때문에 뒤에 실행되는 구문이
		n = 100;// 더 중요하다 
		m = 200;// 즉 생성자가 최종적으로 초기화 값을 결정한다.
		System.out.println("생성자 실행...");
	}
	Test080(int n, int m)
	{
		this.n = n;
		this.m = m;
		System.out.println("매개변수 있는 생성자 실행...");
	}

	void write()
	{
		System.out.println("n : "+n+", m : "+m);
	}

	public static void main(String[] args)
	{
		Test080 ob1 = new Test080(); 
		ob1.write();

		Test080 ob2 = new Test080(1234,5678); 
		ob2.write();
	}
}
/*
초기화 블럭 실행...
생성자 실행...
n : 100, m : 200
초기화 블럭 실행...
매개변수 있는 생성자 실행...
n : 1234, m : 5678
계속하려면 아무 키나 누르십시오 . . .
*/