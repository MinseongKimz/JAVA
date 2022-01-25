/*============================
  ■■■ 클래스 고급 ■■■
==============================*/

// 상속(Inheritance)

/*
※	메소드 오버라이딩(Method Overriding) 의 특징

	메소드 이름, 리턴 타입, 파라미터 수나 타입이 완전히 일치 해야한다.
	반드시 상속 관계가 있어야 한다.

	재정의된 하위 클래스의 메소드 접근제어지시자는 
	상위 클래스의 메소드 접근제어지시자 보다 범위가 크거나 같아야 한다.

	예를 들어, 상위 클래스 메소드의 접근 제어지시자가 『protected』일 경우
	하위 클래스가 이 메소드를 오버라이딩 하는 경우
	접근제어 지시자는 『protected』또는『public』이어야 한다.

	『static』『final』『private』 메소드는 오버라이딩 할수 없다.

	Exception의 추가가 불가능하다.
	즉, 상위 메소드가 가지고 있는 기존 예외사항에 
	새로운 Exception을 추가하는 것은 불가능 하다는 것이다.

*/

// 부모 클래스
class SuperTest116
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}
}

// 자식 클래스
class SubTest116 extends SuperTest116
{

	/*
	//private int a = 5; 못받음 
	protected int b = 10; // 받음
	public int c = 20; // 받음

	public void write() // 받음
	{
		System.out.println("Super write() 메소드 : " + a + ":" + b + ":" + c);
	}
	
	*/

	protected int b = 100;

	public void print()
	{
		//System.out.println("Super write() 메소드 : " + a + ":" + b + ":" + c);
		// 슈퍼클래스116에서 선언한 a에는 접근할 수 없다
		// private a 이니까..
		System.out.println("Sub write() 메소드 : " + b + " : " + c);//==>Sub write() 메소드 : 100 : 20

		//System.out.println("Sub write() 메소드 : " + b);  // 100
		//System.out.println("Sub write() 메소드 : " + this.b);//100
		//System.out.println("Sub write() 메소드 : " + super.b); //==> Sub write() 메소드 : 10
		// 즉 변수 b는 접근 방법에 따라 다른 b로 접근 및 출력이 이루어 진다.

		// 슈퍼 클래스에서 선언한 b나 서브 클래스에서 선언한 b 선택해서 쓸 수 있다.

		//System.out.println("Sub write() 메소드 : " + c);  // 20 
		//System.out.println("Sub write() 메소드 : " + this.c); // ? 20나온다
		//System.out.println("Sub write() 메소드 : " + super.c); // 20
		// c는 서브 클래스에서 따로 선언한 적이 없기 때문에
		// this든 super든 그냥 c던 다 물려받은 c이다.

	}
	@Override 
	public void write()
	{
		//System.out.println("Sub write() 메소드 : " + a + " : " + b + " : " + c); 
		// 수퍼클래스에서 선언된a 는 private 이기 때문에 에러
		System.out.println("Sub write() 메소드 : " + b + " : " + c);
	}

}


public class Test116
{
	
	public static void main(String[] args)
	{

		// 자식 클래스(SubTest116) 기반 인스턴스 생성
		SubTest116 ob = new SubTest116();
		ob.print();
		//==>Sub write() 메소드 : 100 : 20
		ob.write();
		// 부모로 부터 물려받은 write()메소드 >>Super write() 메소드 : 5 : 10 : 20 
		// Overriding >> Sub write() 메소드 : 100 : 20

		System.out.println("---------------------------------------------"); 
		System.out.println(ob.b);   // 100 

		System.out.println(((SuperTest116)ob).b);
		// 10 ?!            --------------
		//					부모클래스로 형변환  >> 슈퍼 부름 이라함

		((SuperTest116)ob).write();  // 메소드도 슈퍼부름 가능?
		// Sub write() 메소드 : 100 : 20  >> 불가능. 오버라이딩은 아예 덮어 씌운 거기 때문

		// 메소드와 변수를 꼭 구분하여 정리할 것!!

	}
}