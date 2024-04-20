import java.util.*;
class deletelastnode{
	int data;
	deletelastnode next;
	deletelastnode(int data){
          this.data=data;
          this.next=null;
	}
	//to delete a node at give position we need to find the previous node the previous node pointer is set to the deleteing node next pointer and he deleliting node is set to null 
	public static deletelastnode delete(deletelastnode n,int target){
		    if(n==null||n.next==null){
		    	return null;
		    }
		    deletelastnode temp=n;
            deletelastnode prev=null;
		    while(temp.data!=target){
		    	prev=temp;
		    	temp=temp.next;
		    }
		    prev.next=temp.next;
		     temp.next=null;
		   
		    return n;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        deletelastnode d=new deletelastnode(arr[0]);
        deletelastnode tail=d;
        for(int i=1;i<n;i++){
        	deletelastnode d1=new deletelastnode(arr[i]);
        	tail.next=d1;
        	tail=d1;
        }

       deletelastnode temp=delete(d,target);
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