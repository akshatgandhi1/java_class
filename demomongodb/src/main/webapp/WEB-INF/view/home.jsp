<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action=insertTrainee>
id<input type="number" name="id">
name<input type="text" name="tname">
location<input type="text" name="tlocation">
insert<input type="submit" name="submit">
${aggregate}
</form>
</body>
</html>