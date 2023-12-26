<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>


<body>
<%-- Using the bean:day5.Resturant and setting the values --%>

<jsp:useBean id="r1" class="day5.Resturant" scope="session"></jsp:useBean>

<jsp:setProperty property="*" name="r1"/>
     <h2>Resturant built Succesfully!</h2>
    
     <h2>To view its details</h2>
    
    <h2><a href="show_restaurant.jsp">click here</a></h2>
</body>
</html>