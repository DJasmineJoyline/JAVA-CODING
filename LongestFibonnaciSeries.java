//Given array-(2,6,3,5,8,9)
//Possible XSeries-(2,3,5), (2,3,5,8)
//Output-Longest XSeries (2,3,5,8)
//XSeries -where sum of two numbers results in next number

import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    int a[]={6,2,3,5,8,9};
	    ArrayList<Integer> cur=new ArrayList<>();
	   ArrayList<Integer> fib=new ArrayList<>(); 
	    int first,second,i,j,k,sum;
	    for(i=0;i<a.length;i++)
	    {
	        for(j=i+1;j<a.length;j++)
	        {
	            first=a[i];
	            second=a[j];
	            cur.clear();
	            cur.add(first);
	            cur.add(second);
	            for(k=j+1;k<a.length;k++)
	            {
    	             sum=first+second;
    	            if(sum==a[k])
    	            {
    	                cur.add(a[k]);
    	                first=second;
    	                second=a[k];
    	            }
	            }
	            if(fib.size()<cur.size())
	             fib=(ArrayList)cur.clone();
	          
	        }
	    }
	    if(fib.size()>2)
	    System.out.println(fib);
	    else
	    
	    
		System.out.println("-1");
	}
}

