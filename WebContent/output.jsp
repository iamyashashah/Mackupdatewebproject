<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="MackGradebook" method="post">
		<table border="3" style="width: 50%">
			<tr>
				<td>${id}</td>
				<td>${stud_name}</td>
				<td>${stud_grade}</td>
				<td>${assignment_name}</td>
				<td>${assignment_type}</td>
			</tr>

			</form>
		<div>
		<form action="UpadateServlet" method="post">
		
		Student Name:<br>
		<input type="text" name="name" id="name" value=${param.name}>
		<br>
		Assignment name:<br>
		<input type="text" name="assignment_name" id="assignment_name" value=${param.assignment_name}>
		<br>
		Assignment type:<br>
		<input type="text" name="assignment_type" id="assignment_type" value=${param.assignment_type}>
		<br>
		Grade: <br>
		<input type="text" name="grade" id="grade" value=${param.grade}>
		<br>
		
		<br>
		<input type="submit" value="update">
		</div>
		
		</form>
		
		
		
</body>
</html>