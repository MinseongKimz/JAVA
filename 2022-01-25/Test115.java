/*============================
  ���� Ŭ���� ��� ����
==============================*/

// ���(Inheritance)

// ������ ���� ���α׷��� �����Ѵ�.
// ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 15

// ������ �Է�(+ - * /) : -
// >> 20 - 15 = 5.00
// ����Ϸ��� �ƹ� Ű�� ��������...

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
	
	Bclass()
	{
		
	}
	boolean flag;
	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		flag = true;
		
		System.out.print("������ �� ���� �Է�(���� ����) : ");

		String[] str = br.readLine().split(" "); //BufferedReader �޼ҵ��� split�̶�� �޼ҵ��
												 //" " ���⼱ ������ �������� �ڸ��� ���ִ� �޼ҵ��.
												 // �׷��� �ڸ��͵� ���ڿ��̱� ������ ���ڿ� �迭�� ����־���
												 // �ٸ�������� java.util.StringTokenizer Ŭ������ ����� ���� �ִ�.
												 
		

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
		

		if (str.length!=2)		// ���� �迭�� ���̰� 2 �� �ƴ϶�� �߸� �Է��̱� ������
			return false;		// �Ʒ� ����� ���� ���� ���� false �� ���ش� 								
								// ���� return false �� �ƴ϶� flag = false �� �ϰ� �Ǹ� 
								// �ؿ� x y�� �迭������ �����ϴ� ������ ������ �ǰ�
								// �׶� ���࿡ ����ڰ� �Է��� 1���� ������ �Է����� ��
								//  IndexOutOfBoundsException ������ �߻��ϰ� �ȴ�.

		x = Integer.parseInt(str[0]); // �迭 ������ ���������� �ٲٰ� ��������
		y = Integer.parseInt(str[1]);

		if (op=='+'||op=='-'||op=='*'||op=='/') // ��ȣ�� �˻�����
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

// ���� �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
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