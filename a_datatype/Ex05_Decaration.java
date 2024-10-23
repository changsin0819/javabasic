package a_datatype;

public class Ex05_Decaration 
{

	public static void main(String[] args) 
	{
		/*
		int kor;			// 숫자를 저장하는 변수 kor을 선언 -> 변수선언
		kor = 30;			// 선언한 변수에 30 대입 -> 값 대입
		
		// 초기화 = 변수선언 + 값 대입
		int eng = 30;
		*/

		int kor = 30, eng = 50;		// 8 ~ 13행을 단축하여 사용
		
		
		System.out.println("국어 : " + kor  + ", 영어 : " + eng);
		System.out.printf("국어 : %d , 영어 : %d\n", kor, eng);
		// printf는 개행되지않음 \n 명령으로 개행
		// System.out.println();
		
		/*
		 	만약에 국어점수와 영어점수가 동일하니
		 	그렇다면 "두 점수가 동일" 이라고 출력
		 	그렇지 않다면 "두 점수는 다름" 이라고 출력
		 */
		if(kor==eng)
		{
			System.out.println("두 점수가 동일");
		}
		else
		{
			System.out.println("두 점수는 다름");
		}
		
		// 두 점수 맞바꾸기 => 두 변수의 값을 바꾸기
		// kor=30, eng=50;
		// [ 바꾼 후 ] kor=50, eng=30
		int temp=kor;			// 정수형변수 temp를 생성하여 kor 변수값 임시저장
		kor=eng;				// kor에 eng변수값 지정
		eng=temp;				// eng에 임시로 저장해둔 temp값 지정
		System.out.println("국어 : " + kor + ", 영어 : " + eng);
								// 결과값이 서로 바뀌어서 출력됨
	}

}
