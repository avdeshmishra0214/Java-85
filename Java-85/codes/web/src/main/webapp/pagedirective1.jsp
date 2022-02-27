<%@page import="java.util.Date" info="example to understand page directive" language="java"
				 contentType="text/html" %>
<%!
  Date today;
%>
<h2 align=center>
<%
 today = new Date();
 out.println("Today is " + today);
%>
<br>
<%=getServletInfo() %>
</h2>