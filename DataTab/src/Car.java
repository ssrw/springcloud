import java.io.Serializable;


public class Car implements Serializable {
	public String carlabel;
	public String carvalue;
	public Car(String carLabel, String carValue) {
		this.carlabel=carLabel;
		this.carvalue=carValue;

	}
	public String getCarlabel() {
		return carlabel;
	}
	public void setCarlabel(String carlabel) {
		this.carlabel = carlabel;
	}
	public String getCarvalue() {
		return carvalue;
	}
	public void setCarvalue(String carvalue) {
		this.carvalue = carvalue;
	}
	
}
