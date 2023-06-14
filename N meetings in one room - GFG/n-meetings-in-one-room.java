//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int maxMeetings(int[] start, int[] end, int n) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            indices.add(i);
        }
        
        // Sort the indices based on the end time
        indices.sort(Comparator.comparingInt(i -> end[i]));
        
        int count = 1;
        int prevEnd = end[indices.get(0)];
        for (int i = 1; i < n; i++) {
            int currStart = start[indices.get(i)];
            if (currStart > prevEnd) {
                count++;
                prevEnd = end[indices.get(i)];
            }
        }
        
        return count;
    }
}
