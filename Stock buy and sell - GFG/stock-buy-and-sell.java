//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int A[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                A[i] = Integer.parseInt(inputLine[i]);
            }
            int p = 0;
            for(int i=0; i<n-1; i++)
                p += Math.max(0,A[i+1]-A[i]);
                
            Solution obj = new Solution();
            ArrayList<ArrayList<Integer> > ans = obj.stockBuySell(A, n);
            if(ans.size()==0)
                System.out.print("No Profit");
            else{
                int c=0;
                for(int i=0; i<ans.size(); i++)
                    c += A[ans.get(i).get(1)]-A[ans.get(i).get(0)];
                
                if(c==p)
                    System.out.print(1);
                else
                    System.out.print(0);
            }System.out.println();
        }
    }
}
// } Driver Code Ends

class Solution{
    ArrayList<ArrayList<Integer> > stockBuySell(int arr[], int n) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int start=0,end=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]) end++;
            else{
                if(start!=end){
                    ArrayList<Integer> inner = new ArrayList<>();
                    inner.add(start);
                    inner.add(end);
                    list.add(inner);
                }
                end++;
                start=end;
            }
        }
        if(start!=end){
            ArrayList<Integer> inner=new ArrayList<>();
            inner.add(start);
            inner.add(end);
            list.add(inner);
        }
        return list;
    }
}