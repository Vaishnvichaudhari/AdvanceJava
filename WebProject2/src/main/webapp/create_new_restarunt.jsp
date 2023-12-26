<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor='peach'>

	<form action="build_restaurant.jsp" method="post">
	<pre>
	RESTAURANTID : <input type = "text" name = "restId"/>
	
	NAME: <input type="text" name = "name"/>
	
	CUISINE: <select name="cuisine">
		<option>Select</option>
		<option>Lasagna</option>
		<option>Daal Baati</option>
		<option>Pizza</option>
		<option>Garlic bread</option>
		
	</select>
	
	BRANCHCOUNT: <input type = "text" name = "branchcount"/>
	
	<input type="submit" value = "Create"/>
	</pre>
	</form>

</body>
</html>