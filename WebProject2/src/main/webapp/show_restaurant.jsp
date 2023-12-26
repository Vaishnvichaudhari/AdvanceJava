<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--USing the Pre-created beans with id: r1 of type Restaurant from 'session" scope --%>

<jsp:useBean id="r1" class="day5.Resturant" scope="session"></jsp:useBean>

  <%--Fetching its properties and printing it --%>
  <h2>Printing Restaurant details:</h2>
  <h2>ID:<jsp:getProperty property="id" name="r1"/></h2>
  <h2>Name:<jsp:getProperty property="name" name="r1"/></h2>
  <h2>cuisine:<jsp:getProperty property="cuisine" name="r1"/></h2>
  <h2>BranchCount:<jsp:getProperty property="branches" name="r1"/></h2>
</body>
</html>