import java.util.*;
class bubblesort{
	public static void main(String[] a){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		//boolean b;
		for(int i=0;i<n;i++){
	
			for(int j=1;j<n-i;j++){
                    if(arr[j-1]>arr[j]){
                    	int temp=arr[j-1];
                    	arr[j-1]=arr[j];
                    	arr[j]=temp;
                    	//b=false;
                    }
                   
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
}