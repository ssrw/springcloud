package ssrw.javafiles;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Servlet implementation class ContactHandler
 */
@WebServlet("/ContactHandler")
public class ContactHandler extends HttpServlet {
	private WebApplicationContext webApplicationContext;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		//get Spring ApplicationContext
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
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String telephone = request.getParameter("telephone");
		String message = request.getParameter("message");
		
		ContactDao cdao=(ContactDao) webApplicationContext.getBean("contactdao");
		int i=cdao.insertToContact(name, email, telephone, message);
		ContactDao ob= new ContactDao();
		if(i==1){
		  
		   ob.setDivInd("display");
		   ob.setErrInd("none");
		  
		 
		   request.getRequestDispatcher("contact.jsp").forward(request, response);
		}else{
			
			ob.setDivInd("none");
			ob.setErrInd("display");

			
			request.getRequestDispatcher("contact.jsp").forward(request, response);
		}
	}

}
