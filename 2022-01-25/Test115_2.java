// Test115 ���� Ǭ Ǯ�� 

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

// AŬ������ ��ӹ޴� Ŭ������ ����
class Bclass extends Aclass
{
	/*
	protected int x, y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	} // �������� ����
	*/

	Bclass()
	{
		
	}

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �� ���� �Է�(���� ����) : "); // if ����ڰ� 20 10 �Է� �� "20 10" ���ڿ� ����
		String temp = br.readLine(); //"20 10"


		// �� ���ڿ�.split("������") 	
		// �� ���ڿ�.split("\\s")    // �� �����ڸ� �������� ���  
		// ex) "10 20 30 40".split("\\s")
		// {"10" "20" "30" "40"} ���ڿ� Ÿ�� �迭�� ��ȯ

		//ex) "010-1234-5678".split('-');
		// {"010", "1234", "5678"} ���ڿ� Ÿ�� �迭�� ��ȯ
		String[] strArr = temp.split("\\s");

		if (strArr.length != 2)
			return false;
			// �� ������ ������ ���.. �Ʒ� ������ ���� X 
			// false �� ��ȯ�ϸ� input()�޼ҵ� ����
						

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("������ �Է�(+ - * /) : ");
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

// ���� �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
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
������ �� ���� �Է�(���� ����) : 2 3
������ �Է�(+ - * /) : +
>> 2 + 3 = 5.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ �� ���� �Է�(���� ����) : 3 4 5
������ �Է�(+ - * /) : +
Error...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ �� ���� �Է�(���� ����) : 2 3
������ �Է�(+ - * /) : =
Error...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/