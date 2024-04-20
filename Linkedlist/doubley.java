import java.util.*;
class doubley{
	int data;
	doubley next;
	doubley before;
	doubley(int data){
		this.data=data;
		this.before=null;
		this.next=null;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
         		int[] arr=new int[n];
         for (int i=0;i<n;i++) {
         	arr[i]=sc.nextInt();
         }
         doubley d=new doubley(arr[0]);
         doubley tail=d;
         for(int i=1;i<n;i++){
         	doubley newnode=new doubley(arr[i]);
         	tail.next=newnode;
         	newnode.before=tail;
         	tail=newnode;
         }
        doubley temp=d;
      while(true){
      	if(temp.next!=null){
      	System.out.println(temp.data);
      	temp=temp.next;
      }
      else{
      	System.out.println(temp.data);
      	break;
      }
      }

	}
}