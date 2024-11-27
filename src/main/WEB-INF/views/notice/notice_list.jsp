<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<%
  request.setCharacterEncoding("UTF-8");
%>


<html>
<head>
<meta charset=UTF-8">
<title>코드 그룹 출력창</title>
</head>
<body>
<h1>공지사항</h1>

<table border="1"  align="center"  width="80%">
    <tr align="center"   bgcolor="lightgreen">
      <td><b>번호</b></td>
      <td><b>구분</b></td>
      <td><b>제목</b></td>
      <td><b>내용</b></td>
      <td><b>등록일</b></td>
      <td><b>수정일</b></td>
      <td><b>참/불</b></td>
   </tr>

 <c:forEach var="notice_list" items="${notice_list}" >
   <tr align="center">
      <td>${N_IDX.N_IDX}</td>
      <td>${N_IDX.N_CATEGORY}</td>
      <td>${N_IDX.N_TITLE}</td>
      <td>${N_IDX.N_CONTENT}</td>
      <td>${N_IDX.N_REGDATE}</td>
      <td>${N_IDX.N_UPDATE}</td>
      <td>${N_IDX.N_STATUS}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>