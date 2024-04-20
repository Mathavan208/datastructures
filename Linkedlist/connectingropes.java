import java.util.*;
class connectingropes{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr=new int[n];
		for (int i=0; i<n;i++ ) {
			arr[i]=sc.nextInt();
		}
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
		for(int i=0;i<n;i++){
			p1.add(arr[i]);
		}
		int res=0;
		while(p1.size()>1){
               int first=p1.poll();
               int second=p1.poll();
               res=res+first+second;
               p1.add(first+second);
		}
		System.out.println(res);
	}
}