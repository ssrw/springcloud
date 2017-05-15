import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
@FacesValidator("customValidation")
public class CustomValidation implements Validator{
	
 
    @Override
    public void validate(FacesContext fc, UIComponent uic, Object obj)
            throws ValidatorException {
 
        String model = (String) obj;
 
        if (model.length() > 6) {
            FacesMessage msg = new FacesMessage(
                    " Maximum Length of 6 is exceeded.Please enter values within range");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
 
            throw new ValidatorException(msg);
        }
        if (model.length()==0) {
            FacesMessage msg1 = new FacesMessage(
                    "Field could not be empty");
            msg1.setSeverity(FacesMessage.SEVERITY_ERROR);
 
            throw new ValidatorException(msg1);
        }
 
    }
 
	/**
	 * 
	 */


}
