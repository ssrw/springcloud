
public class WiproPractice1 {

	public static void main(String[] args) {
		
		int arr[] = new int[]{2,3,4,5};
		int arr1[] = new int[]{3,2,7,10,16};
		int length = arr1.length;
		int arr3[] = new int[arr.length];
		int k=0;
		int j;
		for(int i=0;i<arr.length;i++){
			int tag=0;
			
			for(j=0;j<length;j++){
				if(arr[i]==arr1[j]){
					tag=1;
					break;
				}else{
					tag=0;	
				}
			}
			if(tag==1){
				 arr3[k++] = j+1;
				 int recordLock = j;
				 for(int m= recordLock; m<length-1; m++){
					 arr1[m]=arr1[recordLock+1];
					 recordLock=recordLock+1;
				 }
				 length=length-1;
			}else{
				arr3[k++] = -1;
			}	 
		}
		for(int l:arr3){
			System.out.println(l);
		}
		

	}

}
