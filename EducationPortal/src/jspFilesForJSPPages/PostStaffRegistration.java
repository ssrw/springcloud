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

import constantFiles.StaffConstant;
import dataAccessObject.StaffDAO;
import dataAccessObject.StudentDAO;

/**
 * Servlet implementation class PostStaffRegistration
 */
@WebServlet("/PostStaffRegistration")
public class PostStaffRegistration extends HttpServlet {
	private WebApplicationContext webApplicationContext;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostStaffRegistration() {
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

		 String name = request.getParameter("staffnamesignup");
		 String contactno = request.getParameter("staffcontactnumber");
		 String email = request.getParameter("emailsignup");
		 String regno = request.getParameter("registrationnumber");
		 String designation = request.getParameter("designation");
		 String address = request.getParameter("staffaddress");
		 String guardianname = request.getParameter("gurdianname");
		 String guardiancntctno = request.getParameter("gurdiancontactnumber");
		 
		 StaffDAO staffDao=(StaffDAO) webApplicationContext.getBean("staffdao");
		 int insertInd = 0;
		 try{
		   insertInd= staffDao.create(name, contactno, email, regno, designation, address, guardianname, guardiancntctno , StaffConstant.PENDING);
		 }
		 catch(Exception e){
			 insertInd = 0; 
			 System.out.println(e.getMessage());
		 }
		 
		 if(insertInd>0){
		   request.getRequestDispatcher("/StaffRegistration.jsp").forward(request, response);
		 }else{
			request.getRequestDispatcher("").forward(request, response);
		 }
	}

}
