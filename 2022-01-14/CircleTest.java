/*==========================================
  ����Ŭ������ �ν��Ͻ� ����
============================================*/

// �� Test073.java �� ��Ʈ��
// ���� ���̿� �ѷ� ���ϱ�
// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
// (Ŭ������ : CircleTest) �� CircleTest.java

// ���� ���� = ������ * ������ *3.141592
// ���� �ѷ� = ������ * 2 *3.141592

// ���� ��)
// ������ �Է� : xx

// >> �������� xx �� ����
// >> ���� : xxxxx.xx
// >> �ѷ� : xxxxx.xx
// ����Ϸ��� �ƹ� Ű�� ��������...
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CircleTest
{
	//���� ����
	int r;
	final double PI = 3.141592;

	// Ŭ���� ���� ���� ���� �޼ҵ�
	public static void main(String[] args) 
	{
	}

	// ������ �Է� �ޱ� ���� �Է� �޼ҵ�
	void input() throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}
	
	// �ѷ� ��� �޼ҵ�
	double calLength()  
	{
		double result;

		result  = r * 2 * PI;

		return result;
	}

	// ���� ��� �޼ҵ�
	double calArea()
	{
		double result;

		result = r * r * PI;

		return result;
	}

	// ��� �޼ҵ�
	void print(double a, double l)	
	{
		System.out.printf("�������� %d �� ���� \n",r);
		System.out.printf(">>���� : %.2f\n" , a);
		System.out.printf(">>�ѷ� : %.2f\n" , l);
	}

}