/*============================
  ■■■ 클래스 고급 ■■■
==============================*/

// 상속(Inheritance)
/*
○	상속(Inheritance)이란..
	새로 설계(생성)하고자 하는 클래스가
	이미 설계되어 있는 다른클래스의 기능과 중복되는 경우
	이미 설계된 클래스의 일부분이나 전체 구조를 공유할 수 있도록 하는 기능을 의미한다.

	즉, 상속은 객체를 좀 더 쉽게 만들 수 있는
	고수준의 재사용성(reuseability)을 확보하고
	객체간의 관계를 구성함으로써
	객체 지향의 또 다른 특징인 『다형성』의 문법적 토대가 된다.

	상속은 기존 프로그램의 클래스 내용을 공유함으로써
	중복된 코드들을 재작성할 필요 없이
	반복적이고 세부적인 작업을 처리하지 않기 때문에
	프로그램을 작성하는 시간을 절약할 수 있고
	유지보수를 편리하게 할 수 있으며,
	프로그램의 길이도 짧아지게 된다.

	또한, 이미 작성된 프로그램들은 앞서 테스트되었기 때문에
	오류를 줄일 수 있어 현재 작성중인 프로그램에만 전념할 수 있다.

 ※	주의할 점

 	자바는 『다.중.상.속』을 지원하지 않기 때문에
	두 개 이상의 클래스로부터 상속을 받을 수 없다.
*/
// 상위 클래스 == 부모 클래스 == Super클래스 → 물려주는 클래스
// 하위 클래스 == 자식 클래스 == Sub 클래스  → 상속받는 클래스





// 부모 클래스
class SuperTest113
{
	protected double area;

	SuperTest113() // 생성자
	{
		System.out.println("Super Class..");
	}
	
	void write(String title)
	{
		System.out.println(title + " - " + area);
	}

}
// 자식 클래스
public class Test113 extends SuperTest113
{

	/*
	protected double area;  // 상속 가능                          // 부모로 부터 받은 area

	SuperTest113() // ※ 생성자는 상속 대상에서 제외된다!
	{
		System.out.println("Super Class..");
	}
	
	void write(String title) // 디폴트 상속 불가  그러나 벗 동일패키지라 접근 가능
	{
		System.out.println(tltle + " - " + area);
	}
	*/

	//double area = 10.1234;										  //나(자식)이 원래 가지고 있던 area 

	// 자식 클래스의 생성자
	Test113()
	{
		//super();// 부모클래스의 생성자 호출  this랑 비슷 
		// this 는 클래스 만 보면 되지만 super는 클래스가 받은 상속클래스도 봐야한다..
		// SuperTest113(); 라 쓸 수 없으니깐..
		// ※ 생성자 내부에서 다른 생성자를 호출하는 것은 가능하다.
		//	  하지만, 생성자 내부에서 가장 먼저 실행 되어야 한다.안그러면 내가 따로 쓰는것도 다 초기화 되버리나..
		// 그래서 메인에서 Super Class... 가 먼저 실행된다..
		System.out.println("Sub Class...");
		//super(); ....(X) 생성자 내부에서 가장 먼저 실행 되어야 한다. 에러임
	}
	Test113(double x)
	{
		area = x;
	}

	public void actionCircle()
	{
		int r = 10;
		area = r * r * 3.141592;       // 이 area는 부모껄까 내껄까..?
		write("원");                   // 부모의 write 메소드를 호출
	}


	public void actionRect()
	{
		int w =20, h =5;

		area = w*h;                   // 이 area는 부모껄까 내껄까..?

		write("사각형");			  // 부모의 write 메소드를 호출		 
	}


	public static void main(String[] args)
	{
		// Test113 클래스(자식) 기반 인스턴스 생성
		Test113 ob = new Test113();

		//Super Class..        .....? 부모로부터 물려받으면 부모의 클래스도 메모리에 올라간다..
		//Sub Class...				  그래서 부모의 생성자도 같이 실행된다..
		//계속하려면 아무 키나 누르십시오 . . .

		ob.actionCircle();
		//원 - 314.1592 (73번 주석)
		ob.actionRect();
		//사각형 - 100.0 (73번 주석)
		//Test114에 계속..
	}
}
