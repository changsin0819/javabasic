window.onload = function()
{
	var img = document.querySelector('#profile > img');	// id가 profile인 요소의 자식 img요소를 img 변수에 저장
	
	var desc_user = document.querySelectorAll('.user');	// class 가 user인 요소들을 desc_user 변수에 저장
													    // querySelector 는 한가지 값만 가져올수있으니 
														// 여러개의 값을 가져올때에는 querySelectorAll 사용
	
	var h3 = document.querySelector('#btn');			// id가 btn인 요소를 변수 h3에 저장
	h3.onclick = function()								// h3 클릭시 이벤트 발생
	{
		img.src = 'images/me.PNG';						// img의 주소를 'images/me.PNG'로 변경
		desc_user[0].innerHTML = '이름 : 홍길동';			// desc_user 의 0번째 태그 안의 값을 '이름 : 홍길동'으로 바꿈
		desc_user[1].innerHTML = '주소 : 서울'	;			// desc_user 의 1번째 태그 안의 값을 '주소 : 서울'로 바꿈
		desc_user[2].innerHTML = '연락처 : 010-1234-1234';// desc_user 의 2번째 태그 안의 값을 '연락처 : 010-1234-1234'로 바꿈
	}	
	
	
};

