<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="com.example.board.BoardDTO"%>
<% BoardDTO dto =  new BoardDTO(); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${detail}

<%= dto.getpIdx() %>
<%= dto.getTitle() %>
<%=dto.getContent() %>
<%=dto.getWriter() %>
<%=dto.getRegdate() %>


</body>
</html>