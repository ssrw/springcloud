<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
        <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title>Registration</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style2.css" />
		<link rel="stylesheet" type="text/css" href="css/animate-custom.css" />
    </head>
<body>
<div class="container">
            <section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                     <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a> 
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form  method="post" action="/EducationPortal/PostStaffLogin" autocomplete="on"> 
                                <h1>Log in</h1> 
                                <p> 
                                    <label for="email" class="youmail" data-icon="u" > Your email </label>
                                    <input id="email" name="email" required="required" type="email" placeholder="mymail@mail.com"/>
                                </p>
                                <p> 
                                    <label for="regno" class="uname" data-icon="u"> Your Registration Number </label>
                                    <input id="regno" name="regno" required="required" type="text" placeholder="eg. X8df90EO" /> 
                                </p>
                                <p class="keeplogin"> 
									<input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" /> 
									<label for="loginkeeping">Keep me logged in</label>
								</p>
                                <p class="login button"> 
                                    <input type="submit" value="Login" /> 
								</p>
                                <p class="change_link">
									Not a member yet ?
									<a href="#toregister" class="to_register">Join us</a>
								</p>
                            </form>
                        </div>

                        <div id="register" class="animate form">
                            <form   method="post" action="/EducationPortal/PostStaffRegistration"  autocomplete="on"> 
                                <h1> Sign up </h1> 
                                <p> 
                                    <p> 
                                    <label for="staffnamesignup" class="uname" data-icon="u">Staff Name</label>
                                    <input id="staffnamesignup" name="staffnamesignup" required="required" type="text" placeholder="Staff's Name" />
                                </p>
                                 <p> 
                                    <label for="staffcontactnumber"data-icon="u">Staff Contact Number</label>
                                    <input id="staffcontactnumber" name="staffcontactnumber" required="required" type="text" placeholder="Staff's Contact Number" />
                                </p>
                                 <p> 
                                    <label for="emailsignup" class="youmail" data-icon="e" >Staff email</label>
                                    <input id="emailsignup" name="emailsignup" required="required" type="email" placeholder="staff email id"/> 
                                </p>
                                 <p> 
                                    <label for="registrationnumber"data-icon="u">Staff Registration Number</label>
                                    <input id="registrationnumber" name="registrationnumber" required="required" type="text" placeholder="Staff Registration Number" />
                                </p>
                                 <p> 
                                   <label for="designation" data-icon="u">Staff Designation</label>
		                           <select id="designation" name="designation">
		                                <%@page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
		                                <%@page import="dataAccessObject.*" %>
		                                <%@page import="java.util.*" %>
		                                <%!LinkedHashMap<String,String> map; %>
		                                <%
		                                  
		                                   StudentDAO stDao = (StudentDAO) WebApplicationContextUtils.getWebApplicationContext(application).getBean("studentdao");
		                                   map= stDao.getAllDesignationsForStaff();
		                                %>
		                                <% for(Map.Entry<String,String> hm:map.entrySet()){%>
		                                 <option value="<%=hm.getValue()%>"><%=hm.getValue()%></option>
		                                <%}%>
		                                      
		                                
		                          </select>
                                 </p>
                                 <p> 
                                    <label for="staffaddress"data-icon="u">Staff Address</label>
                                    <input id="staffaddress" name="staffaddress" required="required" type="text" placeholder="Staff Address" />
                                </p>                 
                                 <p> 
                                    <label for="gurdiansname" class="uname" data-icon="u">Guardian Name</label>
                                    <input id="gurdiansname" name="gurdianname" required="required" type="text" placeholder="Guirdian's Name" />
                                 </p>
                                 <p> 
                                    <label for="gurdiancontactnumber"data-icon="u">Gurdian Contact Number</label>
                                    <input id="gurdiancontactnumber" name="gurdiancontactnumber" required="required" type="text" placeholder="Gurdian's Contact Number" />
                                 </p>
                                <p class="signin button"> 
									<input type="submit" value="Sign up"/> 
								</p>
                                <p class="change_link">  
									Already a member ?
									<a href="#tologin" class="to_register"> Go and log in </a>
								</p>
                            </form>
                        </div>
						
                    </div>
                </div>  
            </section>
        </div>
</body>
</html>