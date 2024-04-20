import java.util.*;
class recursivebubblesort{
	public static void sort(int[] arr,int n){
		if(n==1)
			return;
		for(int i=0;i<=n-2;i++){
			if(arr[i]>arr[i+1]){
             int temp=arr[i];
             arr[i]=arr[i+1];
             arr[i+1]=temp;
			}
		}
		sort(arr,n-1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
        sort(arr,n);
        System.out.println(Arrays.toString(arr));
	}
}