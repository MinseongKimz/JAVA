/*============================
  ■■■ 클래스 고급 ■■■
==============================*/

// 인터페이스(Interface)

// 인터페이스
interface ADemo
{
	public void write();
}

// 인터페이스
interface BDemo
{
	public void print();
}

// ※ 인터페이스는 2개 이상 구현(implements)할 수 있다.
//	→ 다중 상속이 되지 않는 부분을 보완(보충)하는 개념.

// 클래스
//class DemoImpl
//class DemoImpl extends ADemo, BDemo (이거 아님)
//class DemoImpl implements ADemo, BDemo
// 두 인터페이스를 구현했고 메소드는 정의하지 않았으니깐 아직은 추상 클래스
//abstract class DemoImpl implements ADemo, BDemo
//이제 메소드들 정의 했으니 그냥 클래스...
class DemoImpl implements ADemo, BDemo
{
	// JDK 1.5(5.0)에서는 인터페이스 메소드를 
	// 오버라이딩(Overriding)할 때
	// 『@Override』할 수 없다.
	// JDK1.6 이후부터 적용 가능한 문법이다.
	// 단, 상속받은 클래스의 메소드를 오버라이딩할 때는
	// JDK1.5 에서도 @Override 어노테이션 사용가능하다.
	@Override
	public void write()
	{
		System.out.println("ADemo 인터페이스 메소드 write()...");
	}

	@Override
	public void print()
	{
		System.out.println("BDemo 인터페이스 메소드 print()...");
	}
}



//main() 메서드를 포함한 다른 클래스
public class Test120
{
	public static void main(String[] args)
	{
		//ADemo ob = new ADemo(); // 인터페이스 → 인스턴스 생성 x
		//BDemo ob = new BDemo(); // 인터페이스 → 인스턴스 생성 x

		// ADemo, BDemo 인터페이스를 구현한 클래스 → DemoImpl 
		// 기반의 인스턴스 생성.
		DemoImpl ob1 = new DemoImpl();

		ob1.write();
		ob1.print();
		//ADemo 인터페이스 메소드 write()...
		//BDemo 인터페이스 메소드 print()...

		ADemo ob2 = new DemoImpl();	  // 업캐스팅
		BDemo ob3 = new DemoImpl();   // 업캐스팅

		//ob2.print();  // 에러발생
		//ob3.write();	// 에러발생

		ob2.write();		//ADemo 인터페이스 메소드 write()...
		ob3.print();		//BDemo 인터페이스 메소드 print()...

		((BDemo)ob2).print(); // 둘이 무슨 관계도 아닌것  처럼보여서 안될 것 같지만
		((ADemo)ob3).write(); // 사실 ob2ob3 둘다 DemoImpl에서 업캐스팅한거고
							  // DemoImpl클래스가 두 인터페이스 모두 다 구현 했기 때문에 관계가 있다.
							  // 만약,DemoImpl 클래스가 이들 중 한 인터페이스만 구현했다면
							  // 이 구문은 런타임 에러가 발생하는 구문이 된다. 
							  // 이건 다운캐스팅은 아니다. 인터페이스간에 캐스팅?


		((DemoImpl)ob3).write(); // 이건 다운캐스팅이다.
		//--==>ADemo 인터페이스 메소드 write()...  
	
	}
}
/*
ADemo 인터페이스 메소드 write()...
BDemo 인터페이스 메소드 print()...
ADemo 인터페이스 메소드 write()...
BDemo 인터페이스 메소드 print()...
BDemo 인터페이스 메소드 print()...
ADemo 인터페이스 메소드 write()...
ADemo 인터페이스 메소드 write()...
계속하려면 아무 키나 누르십시오 . . .
*/