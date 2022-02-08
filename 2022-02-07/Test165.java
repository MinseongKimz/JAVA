/*=====================================================
  ■■■ 컬렉션 프레임워크 (Collection Framework)■■■
=======================================================*/

//Test 165 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

/*
실행 예)

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 1

	1번째 요소 입력 : 박현수 
	1번째 요소 입력 성공 ~!! 
	요소 입력 계속(Y/N)? : y

	2번째 요소 입력 : 오이삭
	2번째 요소 입력 성공~!! 
	요소 입력 계속(Y/N)? : N

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 2

	[벡터 전체 출력]
		박현수
		오이삭
	벡터 전체 출력 완료 ~!!!

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 3

	검색할 요소 입력 : 오이삭 

	[검색 결과 출력]
	항목이 존재합니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 3

	검색할 요소 입력 : 김민성 

	[검색 결과 출력]
	항목이 존재하지 않습니다.
	
	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 4

	삭제할 요소 입력 : 홍은혜 

	[삭제 결과 출력]
	항목이 존재하지 않습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 4

	삭제할 요소 입력 : 박현수

	[삭제 결과 출력]
	박현수 항목이 삭제되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 5

	변경할 요소 입력 : 김민성

	[변경 결과 출력]
	변경할 대상이 존재하지 않습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 5

	변경할 요소 입력 : 오이삭
	수정할 내용 입력 : 정은정

	[변경 결과 출력]
	변경이 완료되었습니다. 
	
	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 2

	[벡터 전체 출력]
		정은정
	벡터 전체 출력 완료 ~!!!

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 6

	프로그램 종료
	계속하려면 아무 키나 누르세요.....
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

	private static final Vector<Object> vt; // 자료 구조
	private static BufferedReader br;       // 입력 시 활용
	private static Integer sel;				// 메뉴 선택 값
	private static String con;				// 계속 여부 Y/N


	// static 초기화 블럭
	static
	{
		//벡터 자료 구조 생성
		vt = new Vector<Object>();
		
		// BufferedReader 클래스 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));
		
		//사용자 입력값 초기화 
		sel =1;
		con = "Y";
	}


	// 메뉴 출력 메소드
	public static void menuDisp()
	{
		System.out.println("\n\t[메뉴 선택]");
		System.out.println("\t1. 요소 추가");
		System.out.println("\t2. 요소 출력");
		System.out.println("\t3. 요소 검색");
		System.out.println("\t4. 요소 삭제");
		System.out.println("\t5. 요소 변경");
		System.out.println("\t6. 종료");
	}


	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException, NumberFormatException
	{
		do
		{
			System.out.print(">> 메뉴 선택(1~6) : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 ||sel>6); // 메뉴 6번까지 있음
	}


	// 선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException
	{
		switch (sel) // sel 을 입력 받았으니
		{			 // 받은거에 맞게 메소드 호출해주자..
		case Menus.E_ADD: addElement(); break;	//요소 추가 
		case Menus.E_DISP: dispElement(); break;	//요소 출력
		case Menus.E_FIND: findElement(); break;	//요소 검색
		case Menus.E_DEL: delElement(); break;	//요소 삭제
		case Menus.E_CHA: chaElement(); break;	//요소 변경
		case Menus.E_EXIT: exit(); break;			//종료
		default : System.out.println("에러"); // 그냥 디폴트 넣음
		}
	}


	// 자료구조 요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
		boolean flag = false; // 입력받기 결정할 플래그
		do
		{
			System.out.printf("\t%d번째 요소 입력 : ", (vt.size()+1)); // 처음 사이즈는 0 이니깐..
			vt.add(br.readLine());
			System.out.printf("\t%d번째 요소 입력 성공 ~!!\n",vt.size()); //채워졌다.
			
			System.out.print("\t요소 입력 계속(Y/N)? : "); //계속 입력받기 묻기
			con = br.readLine(); 
				
				//if (con.equalsIgnoreCase("y")) //대소문자 구분안하는 비교 메소드
				if (con.equals("y") ||con.equals("Y")) // 문자열은 == 로 비교 X
					flag = true;
				else
					break;		
			System.out.println();
		}
		while (flag); // true 즉 Y 입력이면 계속 반복
	}


	// 자료구조 전체 요소 출력 메소드
	public static void dispElement() 
	{
		System.out.println();
		System.out.println("\t[벡터 전체 출력]");
		for (int i=0;i<vt.size();i++ ) // 벡터 사이즈만큼 
				System.out.printf("\t     %s\n",vt.get(i)); //계속 출력
		System.out.println("\t벡터 전체 출력 완료 ~!!!");
	}


	// 자료구조 내 요소 검색 메소드
	public static void findElement() throws IOException
	{
		boolean flag; // 검색 결과 플래그
		System.out.println();
		System.out.print("검색할 요소 입력 : ");
		
		flag = vt.contains(br.readLine()); // 벡터 검색 결과후 boolean형으로 반환
		if (flag == true) // 검색 결과 벡터에 있다면..
		{
			System.out.println("\t[검색 결과 출력]");
			System.out.println("\t항목이 존재합니다.");
		}
		else // 검색 결과 벡터에 없다면..
		{
			System.out.println("\t[검색 결과 출력]");
			System.out.println("\t항목이 존재하지 않습니다.");
		}
	}


	// 자료 구조 내 요소 삭제 메소드
	public static void delElement() throws IOException
	{
		boolean flag; // 삭제 결과 플래그 
		System.out.println();
		System.out.print("\t삭제할 요소 입력 : ");
		String str = br.readLine(); 
		flag = vt.removeElement(str); //대상 객체를 제거한다. 그후 제거되면 true를 반환..
		
		if (flag == true)
		{
			System.out.println("\t[삭제 결과 출력]");
			System.out.printf("\t%s 항목이 삭제되었습니다.\n",str);
		}
		else 
		{
			System.out.println("\t[삭제 결과 출력]");
			System.out.println("\t항목이 존재하지 않습니다.");
		}
	}


	// 자료 구조 내 요소 수정(변경) 메소드
	public static void chaElement() throws IOException
	{
		boolean flag;
		System.out.println();
		System.out.print("\t변경할 요소 입력 : ");
		String str = br.readLine(); 
		flag = vt.contains(str); // 벡터 검색 결과후 있으면 true로 반환 

		if (flag == true) // 검색결과 있다면 
		{
			System.out.println();
			System.out.print("\t수정할 내용 입력 : ");
			String change = br.readLine(); // 바꿀거 받을 문자열
			int i = vt.indexOf(str); // 바꿀 위치 indexOf int형으로 반환
			
			vt.set(i, change); //벡터에 앞은 바꿀위치 , 뒤는 내용 (int, Object)
			System.out.println();
			System.out.println("\t[변경 결과 출력]");
			System.out.println("\t변경이 완료되었습니다.");
		}
		else // 검색결과 없다면..
		{
			System.out.println("\t[변경 결과 출력]");
			System.out.println("\t변경할 대상이 존재하지 않습니다.");
		}
	}


	// 프로그램 종료 메소드 → 완성
	public static void exit()
	{
		System.out.println("\n\t프로그램 종료 ~!!!");
		System.exit(-1);
	}

	// 메인 메소드 → 완성
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