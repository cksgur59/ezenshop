<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>



<div class="content_area" style="text-align: center;">


	<form action="memberJoin" method="post">
		<br><br><br>
		<h1>회원가입</h1>
		
		<br>
		
		ID: <input name="id"  class="id_input">
		<br>
		<span class="id_input_re1" style=" color: green; display: none;">사용 가능한 아이디입니다.</span>
		<span class="id_input_re2" style=" color: red; display: none;">중복된 아이디입니다.</span>

		<br>
		
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
		
		<br>
		<div class="mail_wrap">
			<div class="mail_name">email: </div>
			<div class="mail_input_box">
				<input class="mail_input" name="email" type="email">			
			</div>
			<div class="mail_check_wrap">
				<div class="mail_check_input_box">
					<input  id="mail_check_input_box_false" class="mail_check_input" disabled="disabled">
				</div>
				<div class="mail_check_button">
					<span id="mail_check_button_span" style="border: 1px solid gray;">인증번호 전송</span>
				</div>
				<div class="clearfix"></div>
				<span id="mail_check_input_box_warn"></span>
			</div>
		</div>
		<br><br>
		
		핸드폰: <input name="phone" type="tel">
		
		<br><br>
		<div class="address_wrap">
			<div class="address_name">주소: </div>
			
			<div class="address_input_1_wrap">
				<div class="address_input_1_box">
					<input class="address_input_1" name="address1" readonly="readonly">
				</div>
				<div class="address_button">
					<span id="address_button_span">주소 찾기</span>
				</div>			
				<div class="clearfix"></div>
			</div>
			
			<div class="address_input_2_wrap">
				<div class="address_input_2_box">
					<input class="address_input_2" name="address2" readonly="readonly">
				</div>
			</div>
			
			<div class="address_input_3_wrap">
				<div class="address_input_3_box">
					<input class="address_input_3" name="address3" readonly="readonly">
				</div>
			</div>
		</div>
		<br><br><br>
		
		<input type="submit" value="가입" style="border: 5px; border-radius: 5px; width: 280px; padding: 10px 15px; margin-top: 15px; color: white; background-color: #3A1D1D">
		
		<input type="hidden" name="checkedid" value="0">
	</form>

</div>

<script type="text/javascript">

var code = "";

// 아이디 중복 검사
$('.id_input').on("propertychange change keyup paste input", function(){
	var id = $('.id_input').val();
	var data = {id : id}
	
	$.ajax({
		type: "post",
		url: "/member/memberIdCheck",
		data : data,
		success : function(result){
			console.log(result);
			if(result != 'fail'){
				$('.id_input_re1').css("display","inline-block");
				$('.id_input_re2').css("display","none");
			}else{
				$('.id_input_re1').css("display","none");
				$('.id_input_re2').css("display","inline-block");
			}
		}
	});
});

/* 이메일 인증번호 전송 */
$("#mail_check_button_span").click(function(){
	var email = $(".mail_input").val();
	var checkBox = $(".mail_check_input");
	var boxWrap = $(".mail_check_input_box");
	
	
	$.ajax({
		type: "GET",
		url: "/member/mailCheck?email="+email,
		success : function(data){
			checkBox.attr("disabled",false);
			checkBox.attr("id","mail_check_input_box_true");
			code = data;
		}
	});
});

/* 인증번호 비교 */
$(".mail_check_input").blur(function(){
	var inputCode = $(".mail_check_input").val();
	var checkResult = $("#mail_check_input_box_warn");
	
	if(inputCode == code){
		 checkResult.html("인증번호가 일치합니다.");
	     checkResult.attr("class", "correct");
	}else{
		checkResult.html("인증번호를 다시 확인해주세요.");
        checkResult.attr("class", "incorrect");
	}
	
	
});


</script>


<%@include file="../include/footer.jsp"%>