<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ServletToJSP" method="post">
		Numero primo: <input type="number" name="primo2"/>
		<input type="submit" value="calcular es primo"/>
	</form>
	Resultado: ${resultado}
</body>
</html>