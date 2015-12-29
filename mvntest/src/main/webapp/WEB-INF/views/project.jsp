<%-- 
    Document   : project
    Created on : 19.11.2015, 19.11.2015 12:05:27
    Author     : Tatiana
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Просмотр проекта</title>
        <link href='http://tfgame.rusff.ru/files/0014/74/03/50643.css' rel="stylesheet" type="text/css" />
    </head>

    <body>

        <table id="outerTable">

            <tr><td id="mainMenu">
                    <div>
                        <ul>
                            <li style="display: inline-block"><a href="index" >"Главная"</a></li>	
                            <li style="display: inline-block; padding: 4px; background-color: #999"><a href="#">Сообщество</a></li>
                            <li style="display: inline-block"><a href="../work.html">Р-та с заказч.</a></li>
                            <li style="display: inline-block"><a href="#">Выход</a></li>
                        </ul>
                    </div>
                </td></tr>
            <tr><td>
                    <table id="contentTable"><tr>
                            <td id="contentLeft">
                                <div id="mainContent">
                                    <p>Имя:</p> ${project.user.name}
                                    <p>Роль:</p> ${project.user.role}
                                    <br><hr><br>

                                    <p>Описание проекта № ${project.id}</p>
                                    <p class="content">${project.description}</p>

                                    <p>Условия проекта</p>
                                    <p class="content">${project.conds}</p>
                                    <p>Статус проекта</p> 
                                    <p>${project.status}</p>
                                    <p>Участники проекта</p>
                                    <table>
                                        <thead>
                                            <tr>
                                                <td>Имя</td> <td>Статус</td>   
                                            </tr>
                                        </thead>
                                        <c:forEach items="${project.users}" var="user">
                                            <tr>
                                                <td>${user.name}</td>
                                                <td>${user.task.status}</td>
                                            </tr>
                                        </c:forEach>
                                    </table>


                                </div> <!-- mainContent -->
                            </td>
                            <td id="contentRight">
                                <div id="sideBar">
                                    <br clear="center">
                                    <ul>
                                        <li style="display: block"><a href="gear.html" >Кнопка декомпозиция</a></li>	
                                        <li style="display: block"><a href="gear.html">Кнопка мониторинга</a></li>
                                        <li style="display: block"><a href="gear.html">Кнопка пригл./уд.участ.</a></li>
                                        <li style="display: block"><a href="gear.html">Чат с заказчиком</a></li>
                                        <li style="display: block"><a href="close/${project.id}">Сдать проект</a></li>
                                    </ul>
                                </div>
                            </td>
                        </tr></table>
                </td></tr>
            <tr><td height=120px style="background-color: #4682B4">
                    <div id="footer">&copy; Mephorce &nbsp;&nbsp;</div></tr>
        </table>


    </body>
</html>


