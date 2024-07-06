import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	  int[] arr={1,2,3,4,5};
	  
	  boolean ans=sorted(arr,0);
	  System.out.println(ans);
	}
	
	static boolean sorted(int[] arr,int index){
	    if(index==arr.length-1){
	        return true;
	    }
	    
	    if(arr[index]>arr[index+1]){
	        return false;
	    }
	    return sorted(arr,index+1);
	}
}
