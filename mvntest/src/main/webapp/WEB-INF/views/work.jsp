<%-- 
Document   : work
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
        <link href="http://tfgame.rusff.ru/files/0014/74/03/50643.css" rel="stylesheet" type="text/css" />
    </head>

    <body>

        <table id="outerTable">

            <tr><td id="mainMenu">
                    <div>
                        <ul>
                            <li style="display: inline-block"><a href="index" >"Главная"</a></li>	
                            <li style="display: inline-block; padding: 4px; background-color: #999"><a href="#">Сообщество</a></li>
                            <li style="display: inline-block"><a href="work">Р-та с заказч.</a></li>
                            <li style="display: inline-block"><a href="#">Выход</a></li>
                        </ul>
                    </div>
                </td></tr>
            <tr><td>
                    <table id="contentTable"><tr>
                            <td id="contentLeft">
                                <div id="mainContent">
                                    <ul>
                                        <li style="display: block"><a href="project/1" >Проект 1</a></li>
                                        <li style="display: block"><a href="project/2" >Проект 2</a></li>
                                    </ul>
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
