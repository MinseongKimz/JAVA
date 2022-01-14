/*==========================================
  ■■■클래스와 인스턴스 ■■■
============================================*/

//사용자로부터 임의의 정수를 입력받아
// 1 부터 입력받은 수까지의 합을 현산하여
// 결과 값을 출력하는 프로그램을 구현한다.

// 단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한 입력 처리 과정에서 BufferedReader의 readLine()을 사용하며
// 입력 데이터가 1보다 작거나 1000보다 큰 경우 
// 다시 입력 받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력(1~1000) : 1050
// 임의의 정수 입력(1~1000) : -50
// 임의의 정수 입력(1~1000) : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하려면 아무 키나 누르세요...


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Hap
{	
	int a;

	void input() throws IOException // 정수 입력 메소드
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("임의의 정수 입력 (1~1000): ");
			a = Integer.parseInt(br.readLine());
		}
		while (1>a || a>1000);
	}

	int sum()
	{	
		int asum = 0;
		for (int i=0;i<=a ;i++ )
		{
			asum += i;
		}
		return asum;
	}

	void print(int result)
	{
		System.out.printf("1 ~ %d 까지의 합 : %d\n",a, result);
	}
}

public class Test074
{
	public static void main(String[] args) throws IOException
	{
		Hap ob = new Hap();

		ob.input();
		int sum = ob.sum();
		ob.print(sum);
	}
}

/*
 임의의 정수 입력 (1~1000): 0
 임의의 정수 입력 (1~1000): -2
 임의의 정수 입력 (1~1000): 10000
 임의의 정수 입력 (1~1000): 233
1 ~ 233 까지의 합 : 27261
계속하려면 아무 키나 누르십시오 . . .
*/