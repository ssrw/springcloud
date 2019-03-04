package jspFilesForJSPPages;

import java.io.IOException;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import constantFiles.StaffConstant;
import beanFiles.Staff;
import beanFiles.Student;
import dataAccessObject.StaffDAO;

/**
 * Servlet implementation class PostStaffLogin
 */
@WebServlet("/PostStaffLogin")
public class PostStaffLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private WebApplicationContext webApplicationContext;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostStaffLogin() {
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

		StaffDAO stDao=(StaffDAO) webApplicationContext.getBean("staffdao");
		String email = request.getParameter("email");
		String regno = request.getParameter("regno");
		
		Staff st = new Staff();
		st.setEmail(email);
		st.setRegno(regno);
		
		List<Staff> stRecord = stDao.getAllStaffsRecords(st);
		
		if(stRecord !=null && !stRecord.isEmpty() && stRecord.get(0).getEmail() != null && stRecord.get(0).getRegno() != null && stRecord.get(0).getStatus() != null){
			if(stRecord.get(0).getEmail().equals(email) && stRecord.get(0).getRegno().equals(regno) && stRecord.get(0).getStatus().equals(StaffConstant.ACTIVE)){
				 request.getRequestDispatcher("/PostStaffRegistration.jsp").forward(request, response);
			}else{
				 request.getRequestDispatcher("/StaffRegistration.jsp").forward(request, response);
			}
		}else{
			 request.getRequestDispatcher("/StaffRegistration.jsp").forward(request, response);
		}
		
	}

}
