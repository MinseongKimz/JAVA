/*============================
  ■■■ 클래스 고급 ■■■
==============================*/

// 상속(Inheritance)

// 다음과 같은 프로그램을 구현한다.
// 단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 20 15

// 연산자 입력(+ - * /) : -
// >> 20 - 15 = 5.00
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Aclass
{
	protected int x, y;
	protected char op;

	Aclass()
	{
		
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

// A클래스를 상속받는 클래스로 설계
class Bclass extends Aclass
{
	
	Bclass()
	{
		
	}
	boolean flag;
	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		flag = true;
		
		System.out.print("임의의 두 정수 입력(공백 구분) : ");

		String[] str = br.readLine().split(" "); //BufferedReader 메소드중 split이라는 메소드는
												 //" " 여기선 공백을 기준으로 자르게 해주는 메소드다.
												 // 그래서 자른것도 문자열이기 때문에 문자열 배열에 담아주었다
												 // 다른방법으로 java.util.StringTokenizer 클래스를 사용할 수도 있다.
												 
		

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
		

		if (str.length!=2)		// 위에 배열의 길이가 2 가 아니라면 잘못 입력이기 때문에
			return false;		// 아래 내용과 관계 없이 리턴 false 를 해준다 								
								// 만약 return false 가 아니라 flag = false 를 하게 되면 
								// 밑에 x y를 배열값으로 대입하는 구문이 실행이 되고
								// 그때 만약에 사용자가 입력을 1개의 정수만 입력했을 때
								//  IndexOutOfBoundsException 에러가 발생하게 된다.

		x = Integer.parseInt(str[0]); // 배열 담은걸 정수형으로 바꾸고 대입해줌
		y = Integer.parseInt(str[1]);

		if (op=='+'||op=='-'||op=='*'||op=='/') // 부호도 검사해줌
			flag = true;
		else 
			flag = false; 

		return flag;
	}


	double calc() //Test075
	{
		double result = 0.0;

		
		if (op == '+')
		{
			result = (double)x + y;
		}
		else if (op == '-')
		{
			result = (double)x - y;
		}
		else if (op == '*')
		{
			result = (double)x * y;
		}
		else if (op == '/')
		{
			result = (double)x / y;
		}

		return result;
	}

}

// 메인 메소드를 포함하는 외부의 다른 클래스
public class Test115
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

		if (!ob.input())
		{
			System.out.println("Error...");
			return;
		}
		double result = ob.calc();

		ob.write(result);
	}
}

/*
임의의 두 정수 입력(공백 구분) : 2 3
연산자 입력(+ - * /) : +
>> 2 + 3 = 5.00
계속하려면 아무 키나 누르십시오 . . .

임의의 두 정수 입력(공백 구분) : 3 4 5
연산자 입력(+ - * /) : +
Error...
계속하려면 아무 키나 누르십시오 . . .

임의의 두 정수 입력(공백 구분) : 2 3
연산자 입력(+ - * /) : =
Error...
계속하려면 아무 키나 누르십시오 . . .
*/