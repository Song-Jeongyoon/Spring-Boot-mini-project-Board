<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- forEach사용 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> <!-- 등록일 날짜포맷 -->
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>게시판</title>
</head>
<body>

<!-- 검색기능. action 기능을 통해 넘어가게 -->
<form action="/board/search" method="Post"> 
	<select name = "searchType" >
		<option value="title" <c:if test="${searchType eq 'title'}">selected</c:if>>제목</option>
		<option value="content" <c:if test="${searchType eq 'content'}">selected</c:if>>내용</option>
		<option value="writer" <c:if test="${searchType eq 'writer'}">selected</c:if>>작성자</option>
	</select>
	<input value="${keyword}" name="keyword" type="text">
	<input type="submit" value="검색">
</form>	
<br>

<div class="container">
	<table class="table">
		<colgroup>
			<col width="15%"/>
			<col width="40%"/>
			<col width="25%"/>
			<col width="30%"/>
		</colgroup>
		<thead>
			<tr>  
				<th scope="col">번호</th>
				<th scope="col">제목</th>
				<th scope="col">작성자</th>
				<th scope="col">등록일</th>
			</tr>
		</thead>
		<tbody>
			<!-- items 안에는 Controller의 mv.addObject명 -->
			<c:forEach var="l" items="${list }" varStatus="status"> 
			<tr>
					<td>${l.pIdx}</td>
					<td>${l.title}</td>
					<td>${l.writer}</td>
					<td><fmt:formatDate value="${l.regdate}" pattern="yyyy-MM-dd"/></td>
			</tr>
			</c:forEach>				 
		</tbody>
	</table>
</div>

</body>
</html>