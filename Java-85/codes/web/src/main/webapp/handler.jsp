<%@page isErrorPage="true"%>

<body style="background-color:lightblue">
<h2>
<%
 if(exception instanceof ArithmeticException)
	 out.println("Error: "+ exception.toString());
 else if(exception instanceof ArrayIndexOutOfBoundsException)
	 out.println("Error: Invalid Array Index --> " + exception.getMessage());
 else
	 out.println("Internal Server Error");
%>
</h2>
</body>