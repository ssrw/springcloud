package jspFilesForJSPPages;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import beanFiles.Student;
import dataAccessObject.StudentDAO;

/**
 * Servlet implementation class PostLogin
 */
@WebServlet("/PostLogin")
public class PostLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private WebApplicationContext webApplicationContext;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostLogin() {
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
		StudentDAO stDao=(StudentDAO) webApplicationContext.getBean("studentdao");
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		
		Student st = new Student();
		st.setName(userName);
		st.setRegno(passWord);
		
		List<Student> stRecord = stDao.getAllStudentsRecords(st);
		
		if(stRecord !=null && !stRecord.isEmpty() && stRecord.get(0).getName() != null && stRecord.get(0).getRegno() != null){
			if(stRecord.get(0).getName().equals(userName) && stRecord.get(0).getRegno().equals(passWord)){
				 request.getRequestDispatcher("").forward(request, response);
			}else{
				 request.getRequestDispatcher("/registration.jsp").forward(request, response);
			}
		}else{
			 request.getRequestDispatcher("/registration.jsp").forward(request, response);
		}
		
	}

}
