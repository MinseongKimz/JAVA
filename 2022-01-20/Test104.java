/*================================
  ■■■ 클래스와 인스턴스 ■■■
==================================*/

// 클래스와 인스턴스 활용
// 1~3 사이의 난수를 발생시켜서
// 가위바위보 게임 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 배열을 활용하여 처리할 수 있도록 한다.
// 최종적으로 RpsGame 클래스를 완성할 수 있도록 한다

// ※ 기준 데이터 : → 1: 가위, 2: 바위, 3: 보

// 실행 예)
// 1 : 가위  2 : 바위   3 : 보  중 입력 (1~3) : 4
// 1 : 가위  2 : 바위   3 : 보  중 입력 (1~3) : -1
// 1 : 가위  2 : 바위   3 : 보  중 입력 (1~3) : 2

// - 유저   : 바위
// - 컴퓨터 : 보

// >> 승부 최종 결과 : 컴퓨터가 이겼습니다!!!

import java.util.Scanner;
import java.util.Random;

class RpsGame
{
	private int n;
	private int r;
	String[] rand = {"가위", "바위", "보"};
	
	// 사용자에게 입력 받음.
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print(" 1 : 가위  2 : 바위   3 : 보  중 입력 (1~3) : ");
			n = sc.nextInt();
		}
		while (1>n || n>3);
	}

	// 게임
	public void game()
	{
		Random rd = new Random();
		r = rd.nextInt(3) + 1;

		System.out.println();

		System.out.println("유저    :  " +rand[n-1]);
		System.out.println("컴퓨터  :  " +rand[r-1]);

		System.out.println();

		if ((n==1&&r==3)||(n==2&&r==1)||(n==3&&r==2))
		{
			System.out.println(" >> 승부 최종 결과 : 유저가 이겼습니다!!!");
		}
		else if ((n==3&&r==1)||(n==1&&r==2)||(n==2&&r==3))
		{
			System.out.println(">> 승부 최종 결과 : 컴퓨터가 이겼습니다!!!");
		}
		else
		{
			System.out.println(">> 승부 최종 결과 : 비겼습니다.!!!");
		}
	}

}

public class Test104
{
	public static void main(String[] args)
	{
		RpsGame rp = new RpsGame();
		rp.input();
		rp.game();
	}
}