<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome</h2>
	<form action="save" method="post">
				<table>

		
        <tr>
            <td>Name</td>
            <td><input type="text" name="fname" /></td>
        </tr>
        <tr>
            <td>City</td>
            <td><input type="text" name="city" /></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email" /></td>
        </tr>
        <tr>
            <td>Mobile</td>
            <td><input type="text" name="contact" /></td>
        </tr>
       
       
    </table>


		<input type="submit" value="save" />


	</form>
</body>
</html>