import java.util.*;
class selectionsort{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			int minindex=i;
			for(int j=i;j<n;j++){
				if(arr[j]<arr[minindex]){
					minindex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minindex];
			arr[minindex]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}