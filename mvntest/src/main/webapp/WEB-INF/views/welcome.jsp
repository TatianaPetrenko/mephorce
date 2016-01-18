<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
    <style>
	ul {
		list-style-type: none;
		margin: 0;
		padding: 0;
	}
	li {
		padding: 15px 9px;
		display: inline;
	}

	a{
		text-decoration: none;
		color:black;
		font-size: 18px;
	}

	.header, .main{
		border: solid black 1px;
	}

	.info{
		text-align: left;
		display: inline-block;
		width: 200px;
	}

	.boxproject {
		display: inline-block;
		width: 42%;
		min-height: 300px;
		margin: 1em;
		border: solid black 1px;
		overflow: hidden;
	}
</style>
<script>
	function res(data){
		var arr_from_json = JSON.parse( data );
		document.getElementById('name').innerHTML ="Имя: "+arr_from_json.name;
		document.getElementById('do').innerHTML ="Дата до: "+arr_from_json.dates;
		document.getElementById('worktype').innerHTML ="Тип работы: "+arr_from_json.worktype;
		document.getElementById('otchtype').innerHTML ="Тип отчёта: "+arr_from_json.otchtype;
		document.getElementById('comment').innerHTML ="Комментарий: "+arr_from_json.comment;
		console.log(arr_from_json);
	}

	function info(id){
		$.ajax({
			url: "/spring-hibernate-mysql/pages/prinfo/"+id,
			type: "POST",
			success: res
		});
	}


</script>
<center>
	<div style="width: 600px">
		<div class="header">
			<ul>
				<li><a  href="/spring-hibernate-mysql/pages/create">Создать проект</a></li>
				<li><a href="/spring-hibernate-mysql/pages/home">Главная</a></li>
				<li><a href="#">Сообщество</a></li>
				<li><a href="#">Р-та с закасч.</a></li>
				<li><a href="#">Выход</a></li>
			</ul>
		</div>
		<div class="main">
			<div  class="info">
            <label>Имя:${ses_user.name}</label><br>
            <label>Роль: ${ses_user.role}</label>
          
      </div>
			<div style="display: inline-block">
				<h2>Готовые проекты</h2>
			</div>
			<div class="projects">
				<div class="boxproject">
					<h3>Список текущих проектов</h3>
					
				</div>
				<div class="boxproject">
					<h3>Информация по проекту</h3>
					<div id="name"></div>
					<div id="do"></div>
					<div id="worktype"></div>
					<div id="otchtype"></div>
					<div id="comment"></div>
				</div>
			</div>
		</div>
	</div>
</center>
</body>
</html>