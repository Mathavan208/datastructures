import java.util.*;
class firstandlast{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		int target=sc.nextInt();
  int[] res=new int[2];
            Arrays.fill(res,-1);
        int left=0,right=nums.length-1;
        int mid=0;
        while(left<=right){
             mid=(left+right)/2;
            System.out.println(mid);
            if(nums[mid]==target){
                res[1]=mid;
                break;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
           
        }
          while(left<=mid){
            int mid1=(left+mid)/2;
            //System.out.println(mid);
            if(nums[mid1]==target){
                res[0]=mid1;
                break;
            }
            else if(nums[mid1]>target){
                mid=mid1-1;
            }
            else{
                left=mid1+1;
            }
           
        }
      System.out.println(Arrays.toString(res)+ " "+ left +" " +right);
	}
}