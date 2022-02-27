<%!
  String companyName = "edureka limited";

  public int add(int x, int y){
	return x+y;	  
  }
%>
<h2>
<%
 out.println("Company Name --> " + companyName + "<br>");
 out.println("Sum = " + add(11, 24));
%>
</h2>