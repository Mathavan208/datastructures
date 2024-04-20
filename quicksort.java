import java.util.*;
class quicksort{
	public static int partion(int[] arr,int start,int end){
		
		int boundary=start-1;
		int pivot=arr[end];
	    for(int i=start;i<=end;i++){
if(arr[i]<=pivot){
boundary++;
int temp=arr[boundary];
arr[boundary]=arr[i];
arr[i]=temp;
}
	    }
	    return boundary;
	}
	public static void sort(int[] arr,int start,int end){
		if(start>=end)
			return;
		int boundary=partion(arr,start,end);
		sort(arr,start,boundary-1);
		sort(arr,boundary+1,end);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		sort(arr,0,n-1);
		
		System.out.println(Arrays.toString(arr));
	}
}