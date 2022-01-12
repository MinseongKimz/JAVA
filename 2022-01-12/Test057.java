/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

// 반복문 (do ~ while) 실습

/*
○	개요
	do ~ while 문은 while문과 마찬가지로
	특정한 영역을 반복 수행하는 반복문
	다만 while 문과 다른점은
	조건식에 대한 검사를 반복문을 수행한 이후에 한다는 것.
	이와 같은 성격으로 인해 반드시 한 번은 수행하게 되는 특징을 갖는다.

○	형식 및 구조
	do
	{
		실행문;
	}
	while(조건식);
*/


public class Test057
{
	public static void main(String[] args)
	{
		/*int n =1;
		do
		{
			System.out.println("n = " + n);
			n++;
		}
		while (n<=10);*/ 

		/*
		int n = 1;
		do
		{
			n++;
			System.out.println("n = " + n);
		}
		while (n<=10); //2 ~ 11 예상 */   
		/*
		int n = 0;
		do
		{
			n++;
			System.out.println("n = " + n);
		}
		while (n<10); // 예상 1~10 출력*/
		/*
		int n = 0;
		do
		{
			System.out.println("n = " + ++n);
		}
		while (n<=10); */ //예상 1~11 출력

		// do~while 문의 활용 모델
		// 예를 들어.. 사용자로부터 특정 범위의 정수가 입력될 때 까지
		// 입력받는 행위 자체를 반봅해서 수행해야 하는 상황이라 가정한다.
		
		//즉, 최소 한번은 사용자의 입력값을 받는 처리를 수행해야
		// 반복을 추가로 수행할지 말지 여부를 결정할 수 있는 상황이다.
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int n;

		do
		{
			System.out.print("100 이상의 정수를 입력하세요 :");
			n = sc.nextInt();
		}
		while (n<100);  // 100 이하로 입력받으면 계속 저거 묻고 입력 받을꺼야

		System.out.println("사용자가 입력한 정수 : " + n);
	}
}
/*
100 이상의 정수를 입력하세요 :1
100 이상의 정수를 입력하세요 :2
100 이상의 정수를 입력하세요 :101
사용자가 입력한 정수 : 101
계속하려면 아무 키나 누르십시오 . . .
*/