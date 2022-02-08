/*=====================================================
  ���� �÷��� �����ӿ�ũ (Collection Framework)����
=======================================================*/

//Test 165 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��)

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 1

	1��° ��� �Է� : ������ 
	1��° ��� �Է� ���� ~!! 
	��� �Է� ���(Y/N)? : y

	2��° ��� �Է� : ���̻�
	2��° ��� �Է� ����~!! 
	��� �Է� ���(Y/N)? : N

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 2

	[���� ��ü ���]
		������
		���̻�
	���� ��ü ��� �Ϸ� ~!!!

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է� : ���̻� 

	[�˻� ��� ���]
	�׸��� �����մϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է� : ��μ� 

	[�˻� ��� ���]
	�׸��� �������� �ʽ��ϴ�.
	
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : ȫ���� 

	[���� ��� ���]
	�׸��� �������� �ʽ��ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : ������

	[���� ��� ���]
	������ �׸��� �����Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : ��μ�

	[���� ��� ���]
	������ ����� �������� �ʽ��ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : ���̻�
	������ ���� �Է� : ������

	[���� ��� ���]
	������ �Ϸ�Ǿ����ϴ�. 
	
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 2

	[���� ��ü ���]
		������
	���� ��ü ��� �Ϸ� ~!!!

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 6

	���α׷� ����
	����Ϸ��� �ƹ� Ű�� ��������.....
*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Menus
{
	public static final int E_ADD = 1;
	public static final int E_DISP = 2;
	public static final int E_FIND = 3;
	public static final int E_DEL = 4;
	public static final int E_CHA = 5;
	public static final int E_EXIT = 6;

}

public class Test165
{

	private static final Vector<Object> vt; // �ڷ� ����
	private static BufferedReader br;       // �Է� �� Ȱ��
	private static Integer sel;				// �޴� ���� ��
	private static String con;				// ��� ���� Y/N


	// static �ʱ�ȭ ��
	static
	{
		//���� �ڷ� ���� ����
		vt = new Vector<Object>();
		
		// BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));
		
		//����� �Է°� �ʱ�ȭ 
		sel =1;
		con = "Y";
	}


	// �޴� ��� �޼ҵ�
	public static void menuDisp()
	{
		System.out.println("\n\t[�޴� ����]");
		System.out.println("\t1. ��� �߰�");
		System.out.println("\t2. ��� ���");
		System.out.println("\t3. ��� �˻�");
		System.out.println("\t4. ��� ����");
		System.out.println("\t5. ��� ����");
		System.out.println("\t6. ����");
	}


	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException, NumberFormatException
	{
		do
		{
			System.out.print(">> �޴� ����(1~6) : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 ||sel>6); // �޴� 6������ ����
	}


	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{
		switch (sel) // sel �� �Է� �޾�����
		{			 // �����ſ� �°� �޼ҵ� ȣ��������..
		case Menus.E_ADD: addElement(); break;	//��� �߰� 
		case Menus.E_DISP: dispElement(); break;	//��� ���
		case Menus.E_FIND: findElement(); break;	//��� �˻�
		case Menus.E_DEL: delElement(); break;	//��� ����
		case Menus.E_CHA: chaElement(); break;	//��� ����
		case Menus.E_EXIT: exit(); break;			//����
		default : System.out.println("����"); // �׳� ����Ʈ ����
		}
	}


	// �ڷᱸ�� ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		boolean flag = false; // �Է¹ޱ� ������ �÷���
		do
		{
			System.out.printf("\t%d��° ��� �Է� : ", (vt.size()+1)); // ó�� ������� 0 �̴ϱ�..
			vt.add(br.readLine());
			System.out.printf("\t%d��° ��� �Է� ���� ~!!\n",vt.size()); //ä������.
			
			System.out.print("\t��� �Է� ���(Y/N)? : "); //��� �Է¹ޱ� ����
			con = br.readLine(); 
				
				//if (con.equalsIgnoreCase("y")) //��ҹ��� ���о��ϴ� �� �޼ҵ�
				if (con.equals("y") ||con.equals("Y")) // ���ڿ��� == �� �� X
					flag = true;
				else
					break;		
			System.out.println();
		}
		while (flag); // true �� Y �Է��̸� ��� �ݺ�
	}


	// �ڷᱸ�� ��ü ��� ��� �޼ҵ�
	public static void dispElement() 
	{
		System.out.println();
		System.out.println("\t[���� ��ü ���]");
		for (int i=0;i<vt.size();i++ ) // ���� �����ŭ 
				System.out.printf("\t     %s\n",vt.get(i)); //��� ���
		System.out.println("\t���� ��ü ��� �Ϸ� ~!!!");
	}


	// �ڷᱸ�� �� ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		boolean flag; // �˻� ��� �÷���
		System.out.println();
		System.out.print("�˻��� ��� �Է� : ");
		
		flag = vt.contains(br.readLine()); // ���� �˻� ����� boolean������ ��ȯ
		if (flag == true) // �˻� ��� ���Ϳ� �ִٸ�..
		{
			System.out.println("\t[�˻� ��� ���]");
			System.out.println("\t�׸��� �����մϴ�.");
		}
		else // �˻� ��� ���Ϳ� ���ٸ�..
		{
			System.out.println("\t[�˻� ��� ���]");
			System.out.println("\t�׸��� �������� �ʽ��ϴ�.");
		}
	}


	// �ڷ� ���� �� ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		boolean flag; // ���� ��� �÷��� 
		System.out.println();
		System.out.print("\t������ ��� �Է� : ");
		String str = br.readLine(); 
		flag = vt.removeElement(str); //��� ��ü�� �����Ѵ�. ���� ���ŵǸ� true�� ��ȯ..
		
		if (flag == true)
		{
			System.out.println("\t[���� ��� ���]");
			System.out.printf("\t%s �׸��� �����Ǿ����ϴ�.\n",str);
		}
		else 
		{
			System.out.println("\t[���� ��� ���]");
			System.out.println("\t�׸��� �������� �ʽ��ϴ�.");
		}
	}


	// �ڷ� ���� �� ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		boolean flag;
		System.out.println();
		System.out.print("\t������ ��� �Է� : ");
		String str = br.readLine(); 
		flag = vt.contains(str); // ���� �˻� ����� ������ true�� ��ȯ 

		if (flag == true) // �˻���� �ִٸ� 
		{
			System.out.println();
			System.out.print("\t������ ���� �Է� : ");
			String change = br.readLine(); // �ٲܰ� ���� ���ڿ�
			int i = vt.indexOf(str); // �ٲ� ��ġ indexOf int������ ��ȯ
			
			vt.set(i, change); //���Ϳ� ���� �ٲ���ġ , �ڴ� ���� (int, Object)
			System.out.println();
			System.out.println("\t[���� ��� ���]");
			System.out.println("\t������ �Ϸ�Ǿ����ϴ�.");
		}
		else // �˻���� ���ٸ�..
		{
			System.out.println("\t[���� ��� ���]");
			System.out.println("\t������ ����� �������� �ʽ��ϴ�.");
		}
	}


	// ���α׷� ���� �޼ҵ� �� �ϼ�
	public static void exit()
	{
		System.out.println("\n\t���α׷� ���� ~!!!");
		System.exit(-1);
	}

	// ���� �޼ҵ� �� �ϼ�
	public static void main(String[] args)	throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}