<h2>
<%
 //String uid = request.getParameter("txt_uid");
 String uid = pageContext.getAttribute("uname", PageContext.SESSION_SCOPE).toString();
 out.println("Hello, " + uid);
%>
</h2>