<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%@ page import="java.sql.*"%>
    <%!String name,email,telephone,message;%>
    <%name=request.getParameter("name") ;%>
    <%email=request.getParameter("email") ;%>
    <%telephone=request.getParameter("telephone") ;%> 
    <%message=request.getParameter("message") ;%>
    <%!int i = 0;%>
     <%
	   PreparedStatement ps = null;
	   ConnectionSSRW ob = new ConnectionSSRW();
	   Connection con = ob.getConnection(); 
	   try
	   {
	 
	   String sql = "INSERT INTO dfsf(name,id) VALUES(?,?)";
	   ps= con.prepareStatement(sql); 
	   ps.setString(1,name);
	   ps.setString(2,email);
	   ps.setString(2,telephone);
	   ps.setString(2,message);
	   i = ps.executeUpdate();
	
	   }
	   catch(Exception e){
		System.out.println(e.getMessage());   
	   }
	      
	   
	   
    
    %>

</body>
</html>