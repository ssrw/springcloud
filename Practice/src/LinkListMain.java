
public class LinkListMain {
	
	public static void main(String args[]){
		LinkedList ob=new LinkedList();
		ob.addAtLast(23);
		ob.addAtLast(100);
		ob.addAtLast(50);
		ob.addAtLast(20);
		ob.addAtLast(10);
		ob.display();
		ob.delete(50);
		ob.display();
		ob.delete(100);
		ob.display();
		ob.delete(23);
		ob.display();
		ob.addAtLast(50);
		ob.display();
		
	}

}
