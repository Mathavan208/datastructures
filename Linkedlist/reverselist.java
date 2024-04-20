import java.util.*;
class reverselist{
	int data;
	reverselist next;
	reverselist back;
	reverselist(int data){
           this.data=data;
           this.next=null;
           this.back=null;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		reverselist r=new reverselist(arr[0]);
		reverselist tail=r;
		for (int i=1;i<n;i++) {
			reverselist newnode=new reverselist(arr[i]);
			tail.next=newnode;
			newnode.back=tail;
			tail=newnode;
		}
		//reverselist
		reverselist iterator=r;
		reverselist prev =null;
		while(iterator!=null){
			prev=iterator.back;
			iterator.back=iterator.next;
			iterator.next=prev;
			iterator=iterator.back;
		}
		reverselist temp=prev.back;
      while(true){
      	if(temp.next!=null){
      	System.out.print(temp.data+" ");
      	temp=temp.next;
      }
      else{
      	System.out.print(temp.data+" ");
      	break;
      }
      }

	}
}