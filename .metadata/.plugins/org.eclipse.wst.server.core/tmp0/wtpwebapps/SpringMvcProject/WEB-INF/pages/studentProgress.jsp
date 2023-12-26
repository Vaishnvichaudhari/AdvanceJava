<%@page import="day2.model.StudentProgress"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <body>
     <% 
      Object msg=request.getAttribute("message"); 
      Object progressObject=session.getAttribute("progressReport");
      StudentProgress progress=(StudentProgress)progressObject;
     %>
     <h2><%=msg %>,Here is your Progress</h2>
     <h2>Your Name:<%=progress.getName() %></h2>
        <h2>TotalMarks::<%=progress.getTotalMarks() %></h2>
  </body>
</html>