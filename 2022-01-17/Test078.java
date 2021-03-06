/*==========================================
  ■■■클래스와 인스턴스 ■■■
============================================*/

// 생성자(Constructor)







public class Test078
{
	int x;
	
	//※ 생성자의 이름은 항상 예외없이 클래스의 이름과 동일해야 하며
	//	 필요할 경우 인수를 받아들이는 것도 가능하고
	//	 같은 이름의 메소드를 정의하는 중복정의가 가능하지만 (메소드 오버로딩)
	//	 리턴값(반환값)은 가질 수 없다.

	//※ 생성자는 다른 일반 메소드처럼 호출될 수 없고,
	//	 『new』연산자를 이용하여 객체를 생성하기 위해 호출되며,
	//	 각 클래스의 인스턴스인 객체를 생성한 후에
	//	 생성된 객체의 멤버를 초기화 시키는 작업을 수행한다.

	Test078() // 여기서 보이는 x = 전역변수 x 1개
	{	
		// ※ 생성자 내부에서 다른 생성자를 호출하는 것은 가능하다.
		//	  하지만, 생성자 내부에서 가장 먼저 실행 되어야 한다.안그러면 내가 따로 쓰는것도 다 초기화 되버
		//Test078(100);
		this(100);   //인스턴스 생성구문이 아닌데 클래스 이름을 명시한다 ?? 
					 //이는 심각히 고민해봐야 한다.

		x = 10;
		System.out.println("인자가 없는 생성자");
		System.out.println("Test078이 갖고있는 x : " + x);
	}

	Test078(int x)//이게 가능?
	{	//여기선 전역변수 x와 지역변수 x 2개가 보임
		//x = x;//이러면 둘다 지역변수 x를 가르킴
		//『this』
		this.x = x; //this.x는 클래스의 x구나(Test078.x)이렇게 쓰면안되? → 이미 다른곳에서 사용중이라..
		System.out.println("인자가 하나인 생성자");
		System.out.println("Test078이 갖고있는 x : " + this.x);
	}




	public static void main(String[] args)
	{
		//test078 클래스 기반 인스턴스 생성
		Test078 ob1 = new Test078();   // 인자가 없는 윗 생성자 호출
		Test078 ob2 = new Test078(100);// 인자가 있는 아래 생성자 호출
		
		System.out.println();
		System.out.println("main 에서 ob1.x : " + ob1.x);
		System.out.println("main 에서 ob2.x : " + ob2.x);


	}
}
/*
인자가 하나인 생성자
Test078이 갖고있는 x : 100
인자가 없는 생성자
Test078이 갖고있는 x : 10
인자가 하나인 생성자
Test078이 갖고있는 x : 100

main 에서 ob1.x : 10
main 에서 ob2.x : 100
계속하려면 아무 키나 누르십시오 . . .

*/