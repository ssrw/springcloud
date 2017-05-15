package test;

public class MainTest {

	public static void main(String[] args) {
		
		//AbstractTest abs= new AbstractTest();
		InterfaceTest ints= new InterfaceTest() {
		@Override
		public void sampleInt()
		{
			System.out.println(intvar);
		}
		};
		ints.sampleInt();
		AbstractTest abs= new AbstractTest()
		{
			
		};
		abs.a();

	}

	

}
