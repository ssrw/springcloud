import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		//BeanFactory ctx = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

		EmpDAO dao = (EmpDAO) ctx.getBean("edao");
		EmpDAO dao1 = (EmpDAO) ctx.getBean("edao");
		//dao1.create("niladri", "aq1234a");
		List<Student> list = dao.getAllStudents();

		for (Student e : list)
			System.out.println(e.getName() + " " + e.getRoll());
		
		/*((AbstractApplicationContext) ctx).registerShutdownHook();
		
		TemplateImpl impl = (TemplateImpl) ctx.getBean("templateImpl");
		System.out.println(impl.getA()+" ----->"+impl.getB()+"------>"+impl.getC());
		
		
		Employee e = (Employee) ctx.getBean("employee");
		System.out.println(e.getName()+"    "+e.getAddr().getStreet());
		
		Person p = (Person) ctx.getBean("person");
		List<String> list1 = p.getA();
		for(String s:list1){
			System.out.println(s);
		}*/
		
		
		
		
		
		

	}

}
