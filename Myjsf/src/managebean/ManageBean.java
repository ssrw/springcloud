
package managebean;
import java.util.regex.Matcher;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
@ManagedBean(name = "message")
@RequestScoped
public class ManageBean {
	private String name;
	private String password;
	private String confirmpassword;
    private String email;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	
	public String validateUser(){
		UserValidation ob=new UserValidation();
		String str=ob.fetchDataFromCredentilas(this.name, this.password);
		if("success".equalsIgnoreCase(str)){
			return "next";
		}else{
			return null;
		}
		
		
	}
	
	
	public void validatePassword1(ComponentSystemEvent event) {

		  FacesContext fc = FacesContext.getCurrentInstance();

		  UIComponent components = event.getComponent();

		  // get password
		  UIInput uiInputPassword = (UIInput) components.findComponent("password");
		  String password = uiInputPassword.getLocalValue() == null ? ""
			: uiInputPassword.getLocalValue().toString();
		  String passwordId = uiInputPassword.getClientId();

		  // get confirm password
		  UIInput uiInputConfirmPassword = (UIInput) components.findComponent("confirmpassword");
		  String confirmPassword = uiInputConfirmPassword.getLocalValue() == null ? ""
			: uiInputConfirmPassword.getLocalValue().toString();
		  String confirmpasswordId = uiInputConfirmPassword.getClientId();

		  // Let required="true" do its job.
		  if (password.isEmpty() || confirmPassword.isEmpty()) {
			return;
		  }

		  if (!password.equals(confirmPassword)) {

			FacesMessage msg = new FacesMessage("Password must match confirm password");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			fc.addMessage(confirmpasswordId, msg);
			fc.renderResponse();
				
		  }
		  
		
		  /*UIInput uiInputEmail = (UIInput) components.findComponent("email");
		  String email = uiInputPassword.getLocalValue() == null ? ""
			: uiInputEmail.getLocalValue().toString();*/
		  
		 /*  String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\." +
					"[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*" +
					"(\\.[A-Za-z]{2,})$";

			Pattern pattern;
			Matcher matcher;
		  pattern = Pattern.compile(EMAIL_PATTERN);*/
			

		}
	
	
	

}
