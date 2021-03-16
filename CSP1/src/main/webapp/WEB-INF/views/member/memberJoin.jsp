<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>



<div class="content_area">


	<form action="memberJoin" method="post">
		<h1>회원가입</h1>
		
		<br>
		
		ID: <input name="id"  class="id_input">
		<span class="id_input_re1">사용 가능한 아이디입니다.</span>
		<span class="id_input_re2">중복된 아이디입니다.</span>
		<br>

		<button style="border: 5px; border-radius: 5px; width: 280px; padding: 10px 15px; margin-top: 15px; color: white; background-color: #3A1D1D">아이디 중복 체크</button>
		
		<br><br>
		
		Password: <input type="password" name="pw">
		
		<br><br>
		
		Password(확인): <input type="password" name="pw2">
		
		<br><br>
		
		이름: <input name="name">
		
		<br><br>
		
		<div class="v2">
				성별: <input name="gender" type="radio" checked value="m"> 남
				<input name="gender" type="radio" value="f"> 여
		     </div>
		
		<br><br>
		
		email: <input name="email" type="email">
		
		<br><br>
		
		핸드폰: <input name="phone" type="tel">
		
		<br><br>
		
		주소: <input name="address" type="text">
		
		<br><br><br>
		
		<input type="submit" value="가입" style="border: 5px; border-radius: 5px; width: 280px; padding: 10px 15px; margin-top: 15px; color: white; background-color: #3A1D1D">
		
		<input type="hidden" name="checkedid" value="0">
	</form>

</div>

<<script type="text/javascript">

// 아이디 중복 검사
$('.id_input').on("propertychange change keyup paste input", function(){
	console.log("keyup 테스트");
	var id = $('.id_input').val();
	var data = {id : id}
	
	$.ajax({
		type: "post",
		url: "/member/memberIdCheck",
		data : data
	});
	

});

</script>


<%@include file="../include/footer.jsp"%>