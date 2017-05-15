

import java.io.IOException;
import java.net.URL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import Entity.Message;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
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
		
		try{
			 javax.ws.rs.client.Client client = ClientBuilder.newClient();
			 
			 String uri = "http://localhost:8080/messenger/webapi/hello/fetchallmessage1/jghkgj4";
			 URL url = new URL(uri.toString());

			 WebTarget resource = client.target(url.toString());

			 javax.ws.rs.client.Invocation.Builder request1 = resource.request();
			 request1.accept(MediaType.APPLICATION_JSON);
			
			 if (request1.get().getStatus()==200) {
				 Message msg = request1.get(Message.class);
				    System.out.println(msg.getId()+"---->"+msg.getName());
				    HttpSession session=request.getSession();  
			        session.setAttribute("greenDisplay","block"); 
			        session.setAttribute("redDisplay","none"); 
				    RequestDispatcher rd=request.getRequestDispatcher("/UserLogin.jsp");  
			        rd.forward(request, response); 
				    System.out.println(msg.getId()+"---->"+msg.getName());
			 } else {
				    System.out.println("ERROR! " + request1.get().getStatus());
				    System.out.println(request1.get().toString());
				    
				    HttpSession session=request.getSession(); 
				    session.setAttribute("greenDisplay","none"); 
			        session.setAttribute("redDisplay","green");
				    RequestDispatcher rd=request.getRequestDispatcher("/UserLogin.jsp");  
			        rd.forward(request, response); 
				    
				   
			 }

			
				   
		  }
	      catch(Exception e){
	    	  System.out.println("Check your url");
	    	 
	      }
		}
	}

