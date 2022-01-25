/*============================
  ■■■ 클래스 고급 ■■■
==============================*/

// 추상 클래스 (Abstract)

/*
○	추상 클래스 (Abstract)는

	선언만 있고 정의가 없는 하나 이상의 메소드(추상 메소드)를 갖는 클래스로
	하위 클래스에서 오버라이딩(Overrriding)할 것으로 예상되는 메소드에 대해
	메모리 낭비 없이 미리 호출 계획을 세워두기 위해 만든다..

○	형식 및 구조
	[접근제어지시자] abstract class 클래스명
	{
		[접근제어지시자] abstract 자료형 메소드명([매개변수]....);
	}

○	특징
	클래스가 적어도 하나 이상의 추상 메소드를 포함할 때
	그 클래스는 클래스 앞에 『abstract』 키워드를 붙혀
	추상 클래스로 명시해야 하며
	추상 클래스로 선언한 경우에는
	불완전한 형태의 클래스 이므로 객체를 생성할 수 없다.
	추상 메소드가 존재하지 않는 추상 클래스 마저도
	객체를 생성할 수 없는 것이다

	즉, 추상 클래스는 독립적으로 존재할 수 없기 때문에
	상속을 위해서만 존재하며
	추상 클래스에서 상속받은 하위 클래스에서는
	반드시 추상 메소드를 오버라이딩(Overriding) 해야 한다.

※	『abstract』 키워드는
	클래스와 메소드에서만 사용할 수 있으며
	멤버 변수나 로컬 변수에서는 사용 불가능 하다.


*/ 
// 추상 클래스
abstract class SortInt117
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}

	// 추상 메소드
	protected abstract void sorting();
	// 정렬 알고리즘이 많으니깐 
	// 여기다 정렬 알고리즘을 설계 할꺼라는 계획을 세움
	// 상속을 안하면 이 구문은 쓰레기다.


	protected int dataLength()
	{
		return value.length;
	}

	// 『final』 키워드로 인해
	// 이 클래스(SortInt117)를 상속받는 클래스에서
	// 이 메소드를 재정의 (Method Overriding) 할 수 없다.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
		{
			return 0;
		}
		else if (x>y)
		{
			return 1;
		}
		else 
			return -1;
	}
	
	// 『final』 키워드로 인해
	// 이 클래스(SortInt117)를 상속받는 클래스에서
	// 이 메소드를 재정의 (Method Overriding) 할 수 없다.
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
}
//public class abstract Test117 extends SortInt117 // 일단은 추상 클래스다
public class Test117 extends SortInt117 
{

	/* 물려받은 것들..
	protected void sort(int[] value) 
	{
		this.value = value;
		sorting();
	}

	// 추상 메소드
	protected abstract void sorting();
	// 정렬 알고리즘이 많으니깐 
	// 여기다 정렬 알고리즘을 설계 할꺼라는 계획을 세움
	// 상속을 안하면 이 구문은 쓰레기다.

	protected int dataLength()
	{
		return value.length;
	}

	protected final int compare(int i, int j) // 크기 비교 메소드
	{
		int x = value[i];
		int y = value[j];

		if (x==y)
		{
			return 0;
		}
		else if (x>y)
		{
			return 1;
		}
		else 
			return -1;
	}

	protected final void swap(int i, int j) // 자리바꿈 메소드
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
		
	*/	
	//protected abstract void sorting(); 
	//이놈을 해결하면 정상적인 클래스로 쓸 수 있다.

	int i, j;

	static int[] data = {7, 10, 3, 8, 7};

	
	@Override
	protected void sorting()
	{
		//System.out.println("배열길이 : " + dataLength()); 
		// ==> 5
		/*

		// 선택 정렬
		for (int i =0;i<dataLength()-1 ;i++ )// swap이 선택정렬 꼴 처럼 보임 
		{
			for (int j=i+1;j<dataLength() ;j++ ) // 그래서 범위 Test109처럼 해줌
			{
				if (compare(i,j)==1)
					swap(i,j);
			}
		}*/

		// 버블 정렬 
		for (int i=1;i<dataLength() ;i++ )
		{
			for (int j =0;j<dataLength()-i ;j++ )
			{
				if (compare(j,j+1)==1)
				{
					swap(j,j+1);
				}
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.print("Source Data : ");
		for (int n: data )
			System.out.print(n + " ");
		System.out.println();
		

		Test117 ob = new Test117();
		ob.sort(data);
	
		System.out.print("Sorted Data : ");
		for (int n: data )
			System.out.print(n + " ");
		System.out.println();

		
	}
	
}