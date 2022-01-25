// Test115 같이 푼 풀이 

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
	/*
	protected int x, y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	} // 물려받은 구문
	*/

	Bclass()
	{
		
	}

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("임의의 두 정수 입력(공백 구분) : "); // if 사용자가 20 10 입력 → "20 10" 문자열 생성
		String temp = br.readLine(); //"20 10"


		// ※ 문자열.split("구분자") 	
		// ※ 문자열.split("\\s")    // → 구분자를 공백으로 써라  
		// ex) "10 20 30 40".split("\\s")
		// {"10" "20" "30" "40"} 문자열 타입 배열로 반환

		//ex) "010-1234-5678".split('-');
		// {"010", "1234", "5678"} 문자열 타입 배열로 반환
		String[] strArr = temp.split("\\s");

		if (strArr.length != 2)
			return false;
			// 이 조건을 수행할 경우.. 아래 구문들 수행 X 
			// false 를 반환하며 input()메소드 종료
						

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		if (op!='+'&&op!='-'&&op!='*'&&op!='/')
			return false;

		return true;
	}


	double calc() //Test075
	{
		double result = 0.0;

		
		switch (op)
		{
		case '+': result = x + y; break;
		case '-': result = x - y; break;
		case '*': result = x * y; break;
		case '/': result = (double)x / y; break;
		}

		return result;
	}

}

// 메인 메소드를 포함하는 외부의 다른 클래스
public class Test115_2
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