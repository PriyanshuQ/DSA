//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class GfG {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.2f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}
// } Driver Code Ends

class Com implements Comparator<Item>{
    public int compare(Item a,Item b){
        return Integer.compare(b.value*a.weight,a.value*b.weight);
    }
}

class Solution{
    double fractionalKnapsack(int W, Item arr[], int n) {
        Arrays.sort(arr,new Com());
        double c=0;
        
        for(Item i:arr){
            if(i.weight<=W){
                W-=i.weight;
                c+=i.value;
            }else{
                c+=(i.value*W)/(double)i.weight;
                W=0;
                return c;
            }
        }
        return c;
    }
}