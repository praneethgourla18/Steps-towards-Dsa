import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int r=4;
		
		print(r,0);
		
	}
	static void print(int row,int col){
	    if(row == 0){
	        
	        return;
	    }
	    if(col<row){
	          print(row,col+1);
	        System.out.print("*"+" ");
	      
	    }
	    else{
	         print(row-1,0);
	        System.out.println();
	       
	    }
	}
}
