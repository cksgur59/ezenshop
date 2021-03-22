<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
<link rel="stylesheet" href="../resources/css/home.css">
</head>
<body>
<div class="wrapper">
		<div class="wrap">
			<div class="top_gnb_area">
				<div class="top_gnb_area_button_gruop">
				<!-- 비로그인 상태 -->
				<c:if test="${member==null}">
						<button class="top_login_button" type="button" data-toggle="modal"data-target="#myModal">LOGIN</button>
				</c:if>
				<!-- 로그인 상태 -->
				<c:if test="${member!=null }">
						<span>${member.name}님 환영합니다.</span>
							<!-- 관리자 전용 -->
								<c:if test="${member.admin==1}">
									<button class="top_admin_button" type="button">ADMIN</button>
								</c:if>
						<button class="top_logout_button" type="button">LOGOUT</button>
				</c:if>
				<button class="top_login_button" type="button" >MY PAGE</button>
				<button class="top_login_button" type="button" >WISH</button>
				<button class="top_login_button" type="button" >CART</button>
				<button class="top_login_button" type="button" >NOTICE</button>
				</div>
			</div>
			<div class="top_area">
				<div class="logo_area">
					<div class="glyphicon_center">
					<span class="glyphicon glyphicon-user" aria-hidden="true"></span>
					<span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>
					<span class="glyphicon glyphicon-heart" aria-hidden="true"></span>
					<span class ="glyphicon glyphicon-search" aria-hidden="true" ></span>
					<input class="logo_area_search" value="search..">
					<img id="logo" src="../resources/logo.PNG">
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="navi_bar_area">
				<div class="mainmenu">
					<ul class="mainmenu_ul">
							<li class="mainmenu_li"><a href="#"><span>HOME</span></a></li>
							<li class="mainmenu_li"><a href="#"><span>MAN</span></a></li>
							<li class="mainmenu_li"><a href="#"><span>WOMAN</span></a></li>
							<li class="mainmenu_li"><a href="#"><span>FAKESOCKS</span></a></li>
							<li class="mainmenu_li"><a href="#"><span>BABY/KIDS</span></a></li>
							<li class="mainmenu_li"><a href="#"><span>KNEE/STOCKING</span></a></li>
							<li class="mainmenu_li"><a href="#"><span>ACC</span></a></li>
							<li class="mainmenu_li"><a href="#"><span>NOTICE</span></a></li>
					</ul>
				</div>
			</div >