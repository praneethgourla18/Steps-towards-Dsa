import java.util.*;
import java.lang.*;
import java.io.*;

// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
	
// 	 int[] arr={3,4,12,24,56,12,4,3};
// 	 int target=12;
	 
// 	 findAllOcc(arr,target,0);
	 
// 	 System.out.println(list);

// 	}
	
// 	static ArrayList<Integer> list=new ArrayList<>();
	
// 	static void findAllOcc(int[] arr,int target,int index){
	    
// 	    if(index==arr.length){
// 	        return;
// 	    }
// 	    if(arr[index]==target){
// 	        list.add(index);
// 	    }
// 	    findAllOcc(arr,target,index+1);
// 	}
// }

//method 2

// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
	
// 	 int[] arr={3,4,12,24,56,12,4,3};
// 	 int target=12;
	 
// 	 ArrayList<Integer> list=new ArrayList<>();
	 
	 
// 	 System.out.println(findAllOcc(arr,target,0,list));

// 	}
	
// 	static ArrayList<Integer> findAllOcc(int[] arr,int target,int index ,ArrayList<Integer> list){
	    
// 	    if(index==arr.length){
// 	        return list;
// 	    }
// 	    if(arr[index]==target){
// 	        list.add(index);
// 	    }
// 	   return findAllOcc(arr,target,index+1,list);
// 	}
// }
 
 
 
 
///Method 3 -- dont use more


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	 int[] arr={3,4,12,24,56,12,4,3};
	 int target=12;
	 
// 	 ArrayList<Integer> list=new ArrayList<>();
	 
	 
	 System.out.println(findAllOcc(arr,target,0));

	}
	
	static ArrayList<Integer> findAllOcc(int[] arr,int target,int index ){
	    
	   ArrayList<Integer> list=new ArrayList<>();
	   
	    if(index==arr.length){
	        return list;
	    }
	    if(arr[index]==target){
	        list.add(index);
	    }
	  ArrayList<Integer> allAnsBelow = findAllOcc(arr,target,index+1);
	  
	  list.addAll(allAnsBelow);
	  return list;
	}
}
 
