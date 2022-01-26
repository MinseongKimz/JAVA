/*============================
  ■■■ 클래스 고급 ■■■
==============================*/


// 인터페이스(Interface)

// 인터페이스
interface Demo
{
	public void write();
	public void print();
}

// 인터페이스를 구현하는 추상 클래스
// print안해주면 추상 못땜
abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() 메소드 재정의...");
	}

	// public void print();
}



// 추상클래스(DemoImpl)를 상속 받는 추상 클래스
// 여기서 프린트 메소드를 완성시켜서
// 추상클래스를 벗어난다.
class DemoImplSub extends DemoImpl
{
	@Override
	public void print()
	{
		System.out.println("print() 메소드 재정의...");
	}
}




// main() 메소드를 포함하고 있는 외부에 다른 클래스
public class Test121
{
	public static void main(String[] args)
	{
		//Demo ob1 = new Demo(); 
		//-- 인스턴스 생성 불가 → 인터페이스
		
		//DemoImpl ob2 = new DemoImpl();
		//-- 인스턴스 생성 불가 → 추상 클래스

		DemoImplSub ob3 = new DemoImplSub();

		ob3.write();
		ob3.print();
	}
}

/*
write() 메소드 재정의...
print() 메소드 재정의...
*/