<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${customer.firstName }  ${customer.lastName }  
<br><br>
 free passes: ${customer.freePasses }

<br><br>
 Postal Code : ${customer.postalCode}
 
 <br><br>
 Course code :${customer.courseCode }
</body>
</html>