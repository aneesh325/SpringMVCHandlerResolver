<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Hi welcome to the application

Addition
<form:form action="addition" method="POST" modelAttribute="addForm" >

num1: <form:input id="num1" path="num1"/> 

<br>

num2: <form:input id="num2" path="num2"/> 

<input type="submit" name="submit" value="add">

</form:form>

Subtraction
<form:form action="subtraction" method="POST" modelAttribute="addForm" >

num1: <form:input id="num1" path="num1"/> 

<br>

num2: <form:input id="num2" path="num2"/> 

<input type="submit" name="submit" value="subtract">

</form:form>


<br>
${greet}

${addition}

</body>
</html>