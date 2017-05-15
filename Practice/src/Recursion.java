import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Recursion {
 
	public static void main(String args[]){
		Integer arr[]=new Integer[]{2,3,1,4,6,5,8};
		int a[]=new int[1];
		int i=1;
		List<Integer> list=new ArrayList<Integer>();
		list=Arrays.asList(arr);
		new Recursion().method(list,i,a);
		//.out.println(k);
		System.out.println(a[0]);
		
	}
	
	public  void method(List<Integer> list,int i,int[] a){
		int p=0;
		int s=Collections.frequency(list,i);
		
		if(s!=0 && i!=9){
			method(list,++i,a);
		}else{
			 p=i;
			 a[0]=p;
			 //System.exit(0);
			 return;
		}
		
	}

}

	
