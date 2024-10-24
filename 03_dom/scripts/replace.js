
// window.onload = function()
// {	
		
  var list = document.getElementById('list');
  var pic = document.getElementById('pic');
  var del = document.getElementById('del');

  // 리스트에서 선택(클릭했을 때)
  list.onclick = function(evt)
  {
	 //console.log(evt.target);		// 이벤트가 발생한 타겟을 찾음
	 let isbn = evt.target.getAttribute('data-isbn');
	 // 이벤트가 발생한 타겟의 data-isbn속성 값을 isbn에 저장
	 
	 if(isbn)
	{
		// <img src='경로' width='100' height='150'>	
		let img = document.createElement('img');
		// img태그를 만들어서 img에 저장
		img.width = 100;
		img.height = 150;
		img.src = 'images/' + isbn + '.jpg';
		// img태그에 속성 넣기
		
		//console.log(img);
		//pic.append(img);
		
		if (pic.getElementsByTagName('img').length>0)
		// pic에 자식중에 img라는 태그의 개수가 0보다 클때
		{
			// pic 아래 <img>태그가 이미 있는경우
			pic.replaceChild(img, pic.lastChild);
			// 만들어진 <img>를 pic의 마지막 자식으로 맞바꾼다
		}
		else
		{
			// pic 아래 <img>태그가 없는경우
			pic.append(img);
			// img 요소를 pic에 붙인다
			del.disabled = false;
			// 삭제버튼을 클릭할 수 있게 한다.
		}
	}
  }
  
  
  // 삭제 버튼 누르면 pic 아래 자식(img 태그)를 지운다
del.onclick = function()
{
	pic.lastChild.remove();		// pic의 마지막 자식요소를 지운다
}
  
  
// };
