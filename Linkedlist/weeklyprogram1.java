import java.util.*;
class weeklyprogram1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] l1=new int[n];
		int[] r1=new int[n];
		for(int i=0;i<n;i++){
			l1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			r1[i]=sc.nextInt();
		}
	HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
	h1.put(1,(r1[0]-l1[0])+1);
	int count=2,left=0,right=1;
	while(left<n-1&&right<n){
		if((l1[right]>=l1[left])&&(r1[right]<=r1[left])){
			h1.put(count,(r1[right]-l1[right])+1);
			
			count++;
		}
		else{
			h1.put(count,0);
		}
		left++;
			right++;
	}
	System.out.println(h1);	
	}
}