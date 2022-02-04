//Test148 같이 푼 풀이


import java.util.Random;
import java.util.Arrays;
class Lotto
{
	private int[] num;

	// 생성자
	Lotto()
	{
		num = new int[6];
	}

	//getter
	public int[] getNum()
	{
		return num;
	}

	// 6개의 난수를 발생시키는 메소드 정의
	public void start()
	{
		Random rd = new Random();
		int n;
		int cnt =0;

		jump :

		while (cnt<6)   // 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1; // 1~45 // num[0] 10 가정

			for (int i =0;i<cnt ;i++ )
			{
				if (num[i]==n)
				{
					continue jump;
				}
			}
			num[cnt++] = n; // num[0] num[1] num[2] num[3] num[4] num[5]
		}

		sorting();
	}


	// 정렬 메소드 정의
	private void sorting()
	{
		Arrays.sort(num);
	}
}

public class Test148_1
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();

		// 기본 5게임 
		for (int i =1 ;i<6 ;i++ )
		{
			lotto.start();

			for (int j:lotto.getNum() )
			{
				System.out.printf("%4d",j);
			}
			System.out.println();
		}
	}
}
/*
   1  12  22  25  31  42
  15  16  20  28  31  39
   6  14  23  24  35  44
  13  19  25  26  29  36
  10  15  25  30  31  36
계속하려면 아무 키나 누르십시오 . . .

*/