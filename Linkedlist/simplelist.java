import java.util.*;
class simplelist{
	int data;
	simplelist next;
	simplelist(int data,simplelist next1){
		this.data=data;
		this.next=next1;
	}
	simplelist(int data){
          this.data=data;
          this.next=null;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        simplelist s=new simplelist(arr[0]);
        simplelist tail=s;
        for(int i=1;i<n;i++){
               simplelist newnode=new simplelist(arr[i]);
               tail.next=newnode;
               tail=newnode;
        }
      simplelist s1=s;
      while(true){
      	if(s1.next!=null){
      	System.out.println(s1.data);
      	s1=s1.next;
      }
      else{
      	System.out.println(s1.data);
      	break;
      }
      }

	}
}