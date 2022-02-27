<%!
  String companyName = "edureka limited";

  public int add(int x, int y){
	return x+y;	  
  }
%>
<h2>
Our Company Name --->  <%=companyName %>
<br>
<%="Sum = " + add(12, 21) %>
</h2>