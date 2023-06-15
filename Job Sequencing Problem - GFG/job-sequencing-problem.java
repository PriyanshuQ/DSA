//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


class Solution{
    int[] JobScheduling(Job arr[], int n){
        Arrays.sort(arr,(a,b)->(b.profit-a.profit));
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i].deadline>max) max=arr[i].deadline;
        }
        int a[]=new int[max+1];
        Arrays.fill(a,-1);
        int tj=0,tp=0;
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(a[j]==-1){
                    tj++;
                    a[j]=i;
                    tp+=arr[i].profit;
                    break;
                }
            }
        }
        int[] ans={tj,tp};
        return ans;
    }
}


// Sort the jobs in descending order of profit. 
// If the maximum deadline is x, make an array of size x .Each array index is set to -1 initially as no jobs have been performed yet.
// For every job check if it can be performed on its last day.
// If possible mark that index with the job id and add the profit to our answer. 
// If not possible, loop through the previous indexes until an empty slot is found.