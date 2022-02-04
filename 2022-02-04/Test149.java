/*=================================
  ���� ����(Exception)ó�� ����
===================================*/
/*
��	���α׷����� �߻��ϴ� ����(error)��
	
	��	�߸��� ������ ����ϰų� ���� ���� �������� �ʴ� ���¿���
		��������ν� ������ �ܰ迡�� �߻��ϴ� �������� ������
	
	��	���α׷��� �����ϴ� �������� �߻��Ǵ� ��Ÿ�� ������ 
		���� �� �ִ�.

		- �����ڰ� ���� �м��� �߸��ϰų� �Ǽ��� ����
		  ������ ����� �������� �Ǵ� ������ ������

		- �ý��� �̻󿡼� �߻��Ǵ� �ý��� ����, �׸���

		- ���α׷� ���� �� �߻��Ǵ� ���������� ��Ȳ�� �ǹ��ϴ�
		  ���ܻ���(Exception)�� �ִ�.

		  �������,
		  �� � ���� 0���� �����ų�...
		  �� �迭 ÷�ڸ� ����� ��Ȳ�� �߻��ϰų�...
		  �� �������� �ʴ� ������ �����Ͽ� �о���δٰų�..
		
	==> �����ڰ� �̷� ���ܻ����� �߻��� ��츦 �̸� �����Ͽ�
	    ������ �����ϱ� ���� ������ �����ϵ��� ������ ������ ���� ��.
		��. ��. ó. ��
	
��	������ ���� ����~!(�� Excetion Ŭ����)
	
	- ���ܴ� ���α׷� ���� �߿� �߻��� �� �ִ�
	  ��ɾ��� �������� �帧�� �����ϴ� �̺�Ʈ��
	  �ڹٿ��� ���ܴ� �ϳ��� ������Ʈ(Object, ��ü)�̴�.
	 
	- ���α׷� �����߿� �޼ҵ� �ȿ��� ������ �߻��ϰ� �� ���,
	  �޼ҵ�� �� ������ �ش��ϴ� ���� ������Ʈ�� �����
	  �װ��� �ڹ� ��Ÿ�� �ý���(Runtime System)�� ������ �ش�.

	- �ڹٿ����� ��� ���� Ŭ������ Throwable Ŭ������
	  Throwable Ŭ������ ���� Ŭ������ ��ӹ޾� ����Ѵ�.

	- Throwable Ŭ������ ���ܸ� �����ϴ� �����̳�
	  ���ܰ� �߻��� ���� ���α׷��� ���׿� ���� ������ �����ϰ� �ִ�.

	- Throwable Ŭ�������� �Ļ��� Ŭ����
	  
	  Exception Ŭ����
	  Exception ���� Ŭ������ �Ϲ������� ���α׷��ӿ� ����
	  ������ �� �ִ� ���� ��Ȳ����
	  �޼ҵ尡 ���� �߿� ������ ���ܸ� ����Ų��.

	  Error Ŭ����
	  �ɰ��� ������ ���·� �����ڰ� ������ �� ���� ������ ���� �̴�.

��	������ ����

	- checked exception
	  �޼ҵ� ������ ���ܰ� �߻��� ���
	  �޼ҵ带 ������ �� ��throws������ �޼ҵ� ������ �߻��� �� �ִ�
	  ���ܵ��� ����� �ְų� �Ǵ� �� ���ܸ� ��try~catch���ؼ�
	  ó���� �־�߸� �ϴ� ���� �̴�.
	  �����Ϸ��� ������ �ϴ� �������� ��checked exception����
	  ��throws���Ǵ°��� ���� Ȥ�� ��try~catch���Ǵ����� ���θ� �Ǵ��Ͽ�
	  ���α׷����� ���ܸ� � ������ε� ó������ ������
	  ������ ��ü�� �Ұ��� �ϴ�.

	- unchecked exception
	  ������ ó������ �ʾƵ� �����Ϸ��� üũ���� �ʴ� 
	  ��Ÿ�� �ÿ� �߻��� ���ִ� ���� �̴�.
*/
/*
��	java.lang.Throwable Ŭ������ �ֿ� �޼ҵ�
	
	- String toString()
	  : Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�.
	- void printStackTrace(PrintStream s)
	- void printStackTrace(PrintWriter w)
	  : ǥ�� ��� ��Ʈ���� ���� ȣ�� ����� ������ �޼ҵ� ���� ����Ѵ�.

��	�ֿ� ��Ÿ�� ���� Ŭ����
	
	- ArithmeticException
	  : ��ġ ������ ����(0���� ������ ��)
	- ArrayStoreException
	  : �迭�� �߸��� ������ ���� �����Ϸ� ���� ��� �߻��ϴ� ����
	- IndexOutOfBoundsException
	  : �迭, ���ڿ�, ���� ��� �ε��� ������ ��� ��� �߻��ϴ� ����
	- ClassCastException
	  : Ŭ���� ��ȯ�� �߸��� ��� �߻��ϴ� ����
	- NullPointerException
	  : �� ��ü�� �����ϴ� ���(�ʱ�ȭ ���� ���� ���� ��� ��)
	    �߻��ϴ� ����
	- SecurityException
	  : �ڹ��� ���� ���� ������ �����Ͽ��� ��� �߻��ϴ� ����

		   :
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test149
{										   //�� ����ó�� 1
	public static void main(String[] args) //throws IOException
	{
		//BufferedReader Ŭ���� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;
		
		//�� ����ó��2 
		/*
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);
		}
		catch (IOException e)
		{
			// IOException �� checked exception
			//-- �޼ҵ带 �����ϴ� �������� throws �ѿ���.
			// ��Ƴ��ų� ������ ���� ��� ������ ����...
			System.out.println(e.toString());
		} */

		/*
		//�� ����ó��3 
		 try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);
		}
		catch (IOException e1)
		{
			// IOException �� checked exception
			//-- �޼ҵ带 �����ϴ� �������� throws �ѿ���.
			// ��Ƴ��ų� ������ ���� ��� ������ ����...
			System.out.println(e1.toString());
		}
		catch (NumberFormatException e2)
		{
			// NumberFormatException �� unchecked exception
			//-- ��Ÿ�ӽ� �߻��� �� �ִ� ���ܷ�
			// �ݵ�� ���� �ʿ䵵, ��Ƴ� �ʿ䵵 ����.
			System.out.println(e2.toString());
			System.out.println("���� ������ �����͸� �Է��ؾ� �մϴ�~!!");
		}
		//ù ��° ���� �Է� : a
		//java.lang.NumberFormatException: For input string: "a"
		//���� ������ �����͸� �Է��ؾ� �մϴ�~!!
		*/
	
		/*
		//�� ����ó��4 
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println("printStackTrace...");
			e.printStackTrace();
		}*/
		


		//�� ����ó�� 5
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			// ���ܰ� �߻��ϵ� ���ϵ� �����ϰ� �Ǵ� ����
			System.out.println("����ϼ̽��ϴ�. �����մϴ�");
		}
		//ù ��° ���� �Է� : a
		//java.lang.NumberFormatException: For input string: "a"
		//����ϼ̽��ϴ�. �����մϴ�
		//����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
	}
}