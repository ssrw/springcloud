<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String ind1,ind2;  %>
   <% HttpSession session1=request.getSession();
        
        if(session1.getValue("greenDisplay")!=null && session1.getValue("redDisplay")!=null){ 
         ind1=(String)session1.getAttribute("greenDisplay"); 
         ind2=(String)session1.getAttribute("redDisplay");
         System.out.println(ind1+"  "+ind2);
       }else{
           ind1 = "none";
           ind2 = "none";
       }
       
    %>
<form action="Login" method="post">
    Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="name"/><br><br>        
    Password:&nbsp;&nbsp;&nbsp;<input type="text" name="group"/><br><br>
    
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="submit">


</form>

<% if ("block".equals(ind1) && "none".equals(ind2)) { %>
<div id="messageDiv" style="color:green;">
			 <h5><p align="left" color="GREEN"><b>Record has been inserted successfully</b></p></h5>
			 
</div>

<% } %>

<% if ("none".equals(ind1) && "block".equals(ind2)) { %>
<div id="messageErrorDiv" style="color:red;">
			 <h5><p align="left" color="RED"><b>Error occured, Record has not been inserted successfully.Please try again</b></p></h5>
</div>
<% } %>
</body>
</html>