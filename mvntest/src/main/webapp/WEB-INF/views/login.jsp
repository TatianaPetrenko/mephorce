<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Авторизация</title>
    </head>

    <body>
           <style> 
body { 
    background-color: #ddd;
    background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0, #aaa), color-stop(1, #ddd));
     -webkit-locale: "en";
    background-repeat: no-repeat;
    height: 100%;
    box-sizing: border-box;
    box-shadow: 0 0 0.3em #082567;
    width: 650px;
    overflow-x: hidden;
    font-family:  Arial, "Lucida Grande", sans-serif;
    margin: 0 auto;
    }
   


.container{ 
background-color:white; 
margin: 0 auto;

} 
.header{ 
height:30%; 
background-color: #4682B4; 


} 
 h1 {
    color: white;
   
    text-align: center;
  
}


</style> 
    <div class="container">
      <div class="header">
    
          <h1>Авторизация</h1>
      </div>
    
        <form id="loginForm" method="post" action="login" modelAttribute="loginBean" >
            <table width="100%" cellspacing="0" cellpadding="4">
                
			<a style="font-size:20px "> 
                             <tr> 
                           <td align="right" width="100"><label path="username">Имя </label></td>
			<td><input id="username" name="username" path="username" /> </td>
           
                           </tr>

                               <tr> 

                       <td align="right" width="100"> <label path="username">Пароль</label></td>
                         <td>  <input id="password" type="password" name="password" path="password" /></td> 
                               </tr>

                       <tr> 
                     
                           <td align="right" width="100">  <label path="isAdmin">Роль</label></td>
                     <td>   <select name="role">
                            <option value="Исполнитель">Исполнитель</option>
                            <option value="Модератор">Модератор</option>
                            <option value="Заказчик">Заказчик</option>
                        </select> </td>

                    </tr>

            <tr> 
     <td></td>
                       <td> <input type="submit" value="Войти" /> </td>
                       
                        </tr>
 <tr> 
     <td></td>
                       <td> <a href="registration">Регистрация нового пользователя</a> </td>
	         </tr>      
                        </table>
  
    <tr> 
    
 
    

</form>
  </div>  
    </body>
</html>
