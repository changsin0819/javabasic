window.onload = function()
{
	/* var item = document.getElementsByClassName('item'); */	
	 var item = document.querySelectorAll('.item');
	// 클래스 이름이 item인 요소들을 item변수에 저장(배열)
	
																
	for(let i=0;i<item.length;i++)			// for 문 안에는 var 쓰지않기
	{
		item[i].onclick = function()		// item 변수의 값마다 클릭이벤트 생성
		{
			var price = item[i].getAttribute('data-price');	
			// item 변수의 값마다 data-price요소의 값을 가져와서 price 변수에 저장
			alert(price);
			// 출력
		}
	}
//	alert('i='+i);	// -> let형 변수 i는 블록 내부에서만 사용하기에 블록 밖에서 i값을 찾지못해 에러
	
	for(var i=0;i<item.length;i++)			// for 문 안에는 var 쓰지않기
		{
			// i번째 td에서 클릭이벤트가 발생했을 때 함수를 연결
			// 이벤트 함수는 사용자가 클릭했을 때 실행함
			item[i].onclick = function()		// item 변수의 값마다 클릭이벤트 생성
			{
				var price = item[i].getAttribute('data-price');	
				// item 변수의 값마다 data-price요소의 값을 가져와서 price 변수에 저장
				alert(price);
				// 출력
			}
		}
//	alert('i='+i);	// -> var형 변수i는 블록 밖에서도 인식이 되어서 i는6으로 출력된다
	
	
}
