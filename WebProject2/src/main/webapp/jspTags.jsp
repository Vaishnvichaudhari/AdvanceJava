<%@ page import="java.time.LocalDate,java.time.LocalTime" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <body>
 <h1>Demonstrating JSP Tags</h1>
  <%--Including the resource:Greeting.html --%>
  <%@include file="Greeting.html" %>
  
  <%-- Adding Some declarations --%>
  
  <%!int number=5;
  public String sayWelcome(String name){
	  return "Welcome" + name;
  }
  %>
  
  <%--Printing Hello 5 times using <h2>Heading</h2> --%>
  <% 
   for(int a =1; a<5; a++){
   %>
	 <h2>HELLO</h2>
	 
  <% }
  LocalDate sysDate=LocalDate.now();
  LocalTime sysTime=LocalTime.now();
  %> 
  
  <h2>Number is <%=number %></h2>
  <h2>Square of<%= number %> is <%= (number * number)%></h2>
  <h3>Reply from method is<%=sayWelcome("Vaishaa") %></h3>
  <h2>Current Date:<%= sysDate %></h2>
   <h2>Current Time:<%= sysTime %></h2>
  
  
  
  
 </body>
</html>