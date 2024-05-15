import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=s.nextInt();
		}
		
		boolean check[]=new boolean[10];
		
		for(int i:arr){
		    String str=Integer.toString(i);
		   for(char ch:str.toCharArray()){
		       check[ch-'0']=true;
		   }
		}
		for(int i=0;i<10;i++){
		    if(check[i]){
		        System.out.print(i+" ");
		    }
		}
	    
	}
}
