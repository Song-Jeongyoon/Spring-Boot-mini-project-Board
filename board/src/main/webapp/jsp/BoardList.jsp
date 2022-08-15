<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- forEach사용 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>게시판</title>

</head>
<body>

<form action=""> <!-- 검색기능. action 기능을 통해 넘어가게 -->
	<select name = "search" >
		<option value="제목" >제목</option>
		<option value="작성자" >작성자</option>	
	</select>
	<input type="text" name="searchBox">
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
			<tr>
				<c:forEach var="l" items="${list }"> <!-- items 안에는 Controller의 mv.addObject명 -->
					<td>${l.idx}</td>
					<td>${l.title}</td>
					<td>${l.writer}</td>
					<td>${l.regdate}</td>
				</c:forEach>				 
			</tr>
		</tbody>
	</table>
</div>

</body>
</html>