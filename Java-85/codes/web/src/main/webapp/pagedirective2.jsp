<%@page errorPage="handler.jsp" %>
<%@page info="test message" %>
<%!
  int x = 10;
  int y = 5;
  //int y = 0;
  int[] marks = new int[8];
%>
<h2>
<%
 int z = x / y;
 out.println(x + " / " + y + " = " + z + "<br>");
 
 out.println(marks[0]);
%>
<hr>
<%=getServletInfo() %>
</h2>