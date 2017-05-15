import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
	
	    @Pointcut("execution(* Circle.*(..))")  
	    public void k(){}//pointcut name  
	      
	    @Before("k()")//applying pointcut on before advice  
	    public void beforeAdvice(JoinPoint jp){
	      System.out.println("getname() called");
	    }

}
