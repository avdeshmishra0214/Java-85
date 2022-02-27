<h2>
<%
 String uid = request.getParameter("txt_uid");
 out.println("Hello, " + uid);
 pageContext.setAttribute("uname", uid, PageContext.SESSION_SCOPE);
%>
</h2>

<a href="pagecontext2.jsp">Next Page</a>