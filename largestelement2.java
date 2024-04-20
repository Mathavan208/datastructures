import java.util.*;
class largestelement2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int secondsmall=Integer.MAX_VALUE;
		int small=Integer.MAX_VALUE;
		int large=Integer.MIN_VALUE;
		int secondlarge=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(small>arr[i]){
				secondsmall=small;
				small=arr[i];
			}
			else if(secondsmall>arr[i]&&small!=arr[i]){
				secondsmall=arr[i];
			}
			if(large<arr[i]){
                secondlarge=large;
                large=arr[i];
			}
			else if(secondlarge<arr[i]&&large!=arr[i]){
				secondlarge=arr[i];
			}
		}
		System.out.println(secondsmall);
		System.out.println(secondlarge);
	}
}