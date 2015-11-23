<%-- 
    Document   : counter
    Created on : 16.11.2015, 16.11.2015 17:12:30
    Author     : Tatiana
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Список пользователей</title>
    <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/resources/css/dataTables.foundation.css" rel="stylesheet" type="text/css" />
    <script src="${pageContext.request.contextPath}/resources/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.dataTables.min.js"></script>
    
    <script type="text/javascript" language="javascript">
	
$(document).ready(function() {
	$('#usrs').DataTable(
          
                );
} );

	</script>
</head>

<body>

<table id="outerTable">
 
    <tr><td id="mainMenu">
        <div>
		<ul>
		<li style="display: inline-block"><a href="gear.html" >Главная</a></li>	
		<li style="display: inline-block; padding: 4px; background-color: #999"><a href="project.html">Сообщество</a></li>
		<li style="display: inline-block"><a href="gear.html">Р-та с заказч.</a></li>
		<li style="display: inline-block"><a href="gear.html">Выход</a></li>
		</ul>
        </div>
    </td></tr>
    <tr><td>
        <table id="contentTable"><tr>
            <td id="contentLeft">
                <div id="mainContent">
					
       <table id="usrs" width="600px">
 <thead>
 <tr>
     <td>Имя</td>
     <td>Рейтинг</td>
     <td>Изменить репутацию</td>
     
   </tr>
 </thead>
   <c:forEach items="${users}" var="user">
   <tr >
     <td cellpadding="20px">${user.name}</td>
     <td>${user.rate}</td>
     <td><a href="#up"><img src="..\resources\1uparrow.png"</a></td>
     
   </tr>
   </c:forEach>
 </table>

                </div> <!-- mainContent -->
            </td>
            <td id="contentRight">
                <div id="sideBar">
  <br clear="center">
  
  </div>
            </td>
        </tr></table>
    </td></tr>
	<tr><td height=120px style="background-color: #4682B4">
<div id="footer">&copy; Mephorce &nbsp;&nbsp;</div></tr>
</table>


</body>
</html>

