//For a given list of numbers, find its factors and add the factors. Then if the sum of factors is present in the original list, sort it and print it else print -1.
//Example:
//Input: 0,1,6
//Factors of 0 = 0. Thus sum = 0
//Factors of 1 = 1. Thus sum = 1
//Factors of 6 = 1,2,3. Thus sum = 6
//Output = 1,6
import java.util.*;
import java.lang.*;
public class Main
{
    public static int sumoffactors(int n)
    {
      int s=1;
	  for(int i=2;i<n;i++)
	        {
	            if(n%i==0)
	            s+=i;
	        }  
	        return s;
    }
	public static void main(String[] args) {
	    int a[]={1,4,7,9};
	     int j=1,val;
	    ArrayList<Integer> arr=new ArrayList<>();
	    for(int i=0;i<a.length;i++)
	    arr.add(a[i]);
	   ArrayList<Integer> res=new ArrayList<>(); 
	   
	    for(int i=0;i<a.length;i++)
	    {
	      val=sumoffactors(a[i]); 
	       if(arr.contains(val))
	       if(!res.contains(val))
	       res.add(val);
	    }
	     Collections.sort(res);
	        if(res.size()>0)
	        System.out.println(res);
	        else
	        System.out.println("-1");
	}
}
