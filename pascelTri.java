import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
        ArrayList<ArrayList<Long>> lst = new ArrayList<ArrayList<Long>>();
        ArrayList<Long> pre= null;
        ArrayList<Long> temp=null; 
        for(int i=0;i<n;i++)
        {
            temp = new ArrayList<Long>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    temp.add(Long.valueOf(1));
                }
                else{
                    temp.add(pre.get(j-1)+pre.get(j));
                }
                
            }
//             System.out.println(pre+" "+temp);
            pre = temp;
            lst.add(temp);
        }
        return lst;
        
	}
}
