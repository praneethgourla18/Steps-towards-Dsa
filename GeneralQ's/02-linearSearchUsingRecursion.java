import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	  int[] arr={55,21,96,78,46};
	  
	  int target=97;
	  
	  int ans=linearSearch(arr,target,0);
	  
	  System.out.println(ans);
	}
	
	static int linearSearch(int[] arr,int target,int index){
	   
	   if(index==arr.length){
	       return -1;
	   }
	   
	   if(arr[index]==target){
	       return index;
	   }
	   return linearSearch(arr,target,index+1);
	}
}
