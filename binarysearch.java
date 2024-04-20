import java.util.*;
class binarysearch{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int k=sc.nextInt();
	    int left=0,right=n-1;
	    int ans=0;
	    while(left<right){
	    	int mid=(left+right)/2;
	    	if(arr[mid]==k){
                 ans=mid;
                 break;
	    	}
	    	else if(arr[mid]>k){
	    		right=mid;
	    	}
	    	else{
	    		left=mid+1;
	    	}
	    }
System.out.println(ans);
	}
}