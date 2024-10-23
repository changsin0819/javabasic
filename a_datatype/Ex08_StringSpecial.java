package a_datatype;

/*
 *  @@@@@@@@@@@@@@@
 * 	
 * 	String : 클래스임 ( 참조형 )
 * 
 * 		-> 참조형은 무조건 new 연산자로 메모리를 확보해야한다
 * 
 * 		=> 단, 하나 String 특권으로 new 생략해도 된다
 * 
 */
public class Ex08_StringSpecial 
{

	public static void main(String[] args) 
	{
		String name  = "곽창신";
		String name2 = "곽창신";
		
		if(name == name2) 
		{
			System.out.println("주소가 같다");
		}
		else
		{
			System.out.println("주소가 다르다");
		}
		
		if(name.equals(name2))
		{
			System.out.println("이름이 같다");
		}
		else
		{
			System.out.println("이름이 다르다");
		}

	}

}
