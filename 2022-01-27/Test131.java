/*=================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
===================================*/

// Objcet 클래스

class NewCar
{
	private int velocity;
	private int wheelNum;
	private String carName;

	NewCar(int speed, String name, int wheel)
	{
		velocity = speed;
		carName = name;
		wheelNum = wheel;
	}
}

public class Test131
{
	public static void main(String[] args)
	{
		NewCar nCar1 = new NewCar(80, "아반떼", 4);
		NewCar nCar2 = new NewCar(150, "그랜저", 4);

		//equals()
		System.out.println("1-1 : " + nCar1.equals(nCar2));    // false
		System.out.println("1-2 : " + (nCar1==nCar2));		   // false
	
		NewCar nCar3 = nCar1;     // 얕은 복사 → 주소값 복사

		System.out.println("2-1 : " + nCar1.equals(nCar3));		// true
		System.out.println("2-2 : " + (nCar1==nCar3));			// true

		System.out.println("3-1 : " + nCar1.toString());
		System.out.println("3-2 : " + nCar2.toString());
		System.out.println("3-3 : " + nCar3.toString());
		//3-1 : NewCar@15db9742
		//3-2 : NewCar@6d06d69c
		//3-3 : NewCar@15db9742

		//  hashCode() Object클래스 내의 메소드겟군..
		System.out.println("4-1 : " + nCar1.hashCode());
		System.out.println("4-2 : " + nCar2.hashCode());
		System.out.println("4-3 : " + nCar3.hashCode());
		//4-1 : 366712642
		//4-2 : 1829164700
		//4-3 : 366712642
		//-- 결과값을 16진수로 바꾸게 되면 
		//   『toString()』메소드가 반환된 결과값과 같은 값이 나온다.


		//getClass()
		System.out.println("5-1 : " + nCar1.getClass());
		System.out.println("5-2 : " + nCar2.getClass());
		System.out.println("5-3 : " + nCar3.getClass());
		//5-1 : class NewCar
		//5-2 : class NewCar
		//5-3 : class NewCar
		//-- 생성된 객체를 통해
		//	 해당 객체의 기반 설계도를 확인할 수 있는 기능을 가진 메소드


		//clone() // -- 객체 복사 메소드

		// finalize() // -- 객체 직렬화 메소드

		// 기타 나머지 메소드는 스레드 처리와 관련된 메소드..

	}
}