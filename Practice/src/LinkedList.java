
public class LinkedList {
	
	int size=5;
	int items[]=new int[5];
	int top;
	LinkedList(){
		top=-1;
	}
	public void addAtLast(int addItem){
		if(top>=size-1){
			System.out.println("LinkedList is overflow");
		}else{
			top = top+1;;
			items[top] = addItem;
			
		}
	}
	public void display(){
		for(int i=0;i<=top;i++){
			System.out.print(items[i]+"--->");
			
		}
		System.out.println("\n");
	}
	public void delete(int deleteItem){
		int recordLock = 0,tag=0;
		for(int i=0;i<=top;i++){
			if(items[i]==deleteItem){
				recordLock = i;
				tag=1;
				break;
			}
		}
		if(tag==1){
		  for(int j=recordLock+1;j<=top;j++){
			items[recordLock] = items[j];
			recordLock++;
		  }
		  top--;
		}else{
			System.out.println("\nNo record matched to delete\n");
		} 
		
	}


}

