package jspFilesForJSPPages;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import dataAccessObject.StudentDAO;

/**
 * Servlet implementation class PostStudentRegistration
 */
@WebServlet("/PostStudentRegistration")
public class PostStudentRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private WebApplicationContext webApplicationContext;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostStudentRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
	
		super.init(config);
		webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(config.getServletContext());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //fetching values from request and assigning it to corresponding variables
		 String name = request.getParameter("usernamesignup");
		 String contactno = request.getParameter("studentcontactnumber");
		 String email = request.getParameter("emailsignup");
		 String regno = request.getParameter("registrationnumber");
		 String dept = request.getParameter("departmentname");
		 String address = request.getParameter("studentaddress");
		 String guardianname = request.getParameter("gurdianname");
		 String guardiancntctno = request.getParameter("gurdiancontactnumber");
		 
		 StudentDAO stDao=(StudentDAO) webApplicationContext.getBean("studentdao");
		 int insertInd = 0;
		 try{
		   insertInd= stDao.create(name, contactno, email, regno, dept, address, guardianname, guardiancntctno);
		 }
		 catch(Exception e){
			 insertInd = 0; 
			 System.out.println(e.getMessage());
		 }
		 
		 if(insertInd>0){
		   request.getRequestDispatcher("/registration.jsp").forward(request, response);
		 }else{
			request.getRequestDispatcher("").forward(request, response);
		 }
	}
}
