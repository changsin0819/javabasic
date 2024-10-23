package a_datatype;

public class Ex06_복습 
{

	public static void main(String[] args) 
	{
		// 나이를 저장한 변수를 선언하고 본인의 나이를 대입한 후 출력
		int age = 28;
		System.out.println("나이 : " + age);
		
		// 본인의 키를 소숫점 포함한 데이타로 저장하고 출력
		double stat = 186.6;
		System.out.println("키  : " + stat);
		
		// 이름 저장한 변수를 선언하고 이름을 대입 후 출력
		char name  = '곽';
		char name2 = '창';
		char name3 = '신';
		System.out.println("이름 : " + name + name2 + name3);
		
		// ****************
		// 문자 : char
		// 문자열 : String (클래스 - 참조형)
		String irum = "곽창신";
		System.out.println("이름 : " + irum);

	}

}
