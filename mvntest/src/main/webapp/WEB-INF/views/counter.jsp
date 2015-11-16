<%-- 
    Document   : counter
    Created on : 16.11.2015, 16.11.2015 17:12:30
    Author     : Tatiana
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
   <title>Пользователи</title>
</head>
<body>
<h3>Пользователи</h3>
<a href="<c:url value="/addUser.html"/>">Добавить пользователя</a>
 
 <table>
 <thead>
 <tr>
     <td>Имя</td>
     <td>ID</td>
     <td>Рейтинг</td>
   </tr>
 </thead>
   <c:forEach items="${users}" var="user">
   <tr>
     <td>${user.name}</td>
     <td>${user.id}</td>
     <td>${user.rate}</td>
     
   </tr>
   </c:forEach>
 </table>
</body>
</html>