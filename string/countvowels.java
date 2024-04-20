import java.util.*;
class countvowels{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String vowels="aeiou";
		int count=0;
		for(char c:s.toCharArray()){
             if(vowels.indexOf(c)!=-1){
             count++;
             }
		}
		System.out.print(count);
	}
}