import java.util.*;
class reverselisthard{
	int data;
	reverselisthard next;
	reverselisthard(int data){
		this.data=data;
		this.next=null;
	}
	public static reverselisthard reverse(reverselisthard node){
                 reverselisthard prev=null;
                 reverselisthard temp=node;
                 while(temp.next!=null){
                 	reverselisthard front=temp.next;
                 	temp.next=prev;
                 	prev=temp;
                 	temp=front;
                 }
                // System.out.println(prev.data);
                 return prev;
	}
	public static reverselisthard getkthnode(reverselisthard node,int k){
		k=k-1;
		reverselisthard temp=node;
		while(temp!=null&&k>0){
			k--;
			temp=temp.next;
		}
		//System.out.println(temp.data);
		return temp;
	} 
	public static reverselisthard reversek(reverselisthard node,int k){
       reverselisthard temp=node;
       reverselisthard prevnode=null;
       while(temp!=null){
       reverselisthard kthnode=getkthnode(temp,k);
      // System.out.println(kthnode.data);
       
       if(kthnode==null){
       	if(prevnode!=null){
       		prevnode.next=temp;
       	}
       	break;
       }
       // else{
       // 	//System.out.println(kthnode.data);
       // }

       reverselisthard nextnode=kthnode.next;
       kthnode.next=null;
reverse(temp);
if(temp==node){
	node=kthnode;

}
else{
	prevnode.next=kthnode;
}
prevnode =temp;
temp=nextnode;


}
return temp;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		reverselisthard r=new reverselisthard(arr[0]);
		reverselisthard head=r;
		reverselisthard tail=r;
	 for(int i=1;i<n;i++){
	 	reverselisthard newnode=new reverselisthard(arr[i]);
         tail.next=newnode;
         tail=newnode;
	 }
	 System.out.println(head.data);
       reverselisthard temp=r;
       while(true){
      	if(temp.next!=null){
      	System.out.print(temp.data+" - > ");
      temp=temp.next;
      }
      else{
      	System.out.println(temp.data);
      	break;
      }
      }
head=reversek(head,k);
      while(true){
      	if(head!=null){
      	System.out.println(head.data+" helooo");
      	head=head.next;
      }
      else{
      
      	break;
      }
      }
	}
}