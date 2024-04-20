import java.util.*;
class nodelength{
	int data;
	nodelength next;
	nodelength(int data)
    {
        this.data=data;
        this.next=null;
    }
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        	arr[i]=sc.nextInt();
        }
        nodelength n1 =new nodelength(arr[0]);
        nodelength tail =n1;
        for(int i=1;i<n;i++){
        	nodelength newnode=new nodelength(arr[i]);
        	tail.next=newnode;
        	tail=newnode;
        }
        nodelength temp=n1;
        int count=0;
        while(true){
        	if(temp.next!=null){
              count++;
              System.out.print(temp.data+" ");
              temp=temp.next;
        	}
        	else{
        		count++;
        		System.out.print(temp.data+" ");
        		break;
        	}
        }
        System.out.println();
        System.out.println(count);
	}
}