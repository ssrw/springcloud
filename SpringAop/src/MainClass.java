import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		Shape shp = ctx.getBean("shape", Shape.class);
		System.out.println(shp.getCircle().getName());
        System.out.println(shp.getShapeName());
	}

}
