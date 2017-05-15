
public class WiproTest {
	public static void main(String args[]){
		int input1[]=new int[]{23,6,2,45,8,9,7,8,12,11};
		int input2[]=new int[]{6,23,7,100};
		int output[]=new int[input2.length];
		int tag=0;
		int index=0;
		int size=input1.length -1;
		for(int i=0;i<=input2.length - 1;i++){
			for(int j=0;j<=size ;j++){
				if(input2[i] == input1[j]){
					output[index] = j+1;
				    index++;
				    int recordlock= j;
					for(int k=recordlock+1;k<=size;k++){
						input1[recordlock]=input1[k];
						recordlock++;
					}
				   size--;
				   tag=0;
				   break;
				}else{
					tag=1;
				}
				
			}
			if(tag==1){
				output[index++] = -1;
			}
		}
		for(int s=0;s<=output.length - 1;s++){
			System.out.println(output[s]);
		}
		
	}

}
