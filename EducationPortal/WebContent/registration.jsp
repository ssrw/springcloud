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
                            <form  method="post" action="/EducationPortal/PostLogin" autocomplete="on"> 
                                <h1>Log in</h1> 
                                <p> 
                                    <label for="username" class="uname" data-icon="u" > Your email or username </label>
                                    <input id="username" name="username" required="required" type="text" placeholder="myusername or mymail@mail.com"/>
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p"> Your password </label>
                                    <input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EO" /> 
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
                            <form   method="post" action="/EducationPortal/PostStudentRegistration"  autocomplete="on"> 
                                <h1> Sign up </h1> 
                                <p> 
                                    <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Student Name</label>
                                    <input id="usernamesignup" name="usernamesignup" required="required" type="text" placeholder="Student's Name" />
                                </p>
                                 <p> 
                                    <label for="studentcontactnumber"data-icon="u">Student Contact Number</label>
                                    <input id="studentcontactnumber" name="studentcontactnumber" required="required" type="text" placeholder="Student's Contact Number" />
                                </p>
                                 <p> 
                                    <label for="emailsignup" class="youmail" data-icon="e" > Student email</label>
                                    <input id="emailsignup" name="emailsignup" required="required" type="email" placeholder="student email id"/> 
                                </p>
                                 <p> 
                                    <label for="registrationnumber"data-icon="u">Student Registration Number</label>
                                    <input id="registrationnumber" name="registrationnumber" required="required" type="text" placeholder="Student Registration Number" />
                                </p>
                                 <p> 
                                    <label for="departmentname"data-icon="u">Department</label>
                                    <input id="departmentname" name="departmentname" required="required" type="text" placeholder="Department Name" />
                                </p>
                                 <p> 
                                    <label for="studentaddress"data-icon="u">Student Address</label>
                                    <input id="studentaddress" name="studentaddress" required="required" type="text" placeholder="Student Address" />
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