//{ Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                // adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.bfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V];
        ArrayList<Integer> al = new ArrayList<>();
        func(0, al, adj, vis);
        return al;
    }
    public void func(int node, ArrayList<Integer> al, ArrayList<ArrayList<Integer>>adj, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        vis[node]=true;
        al.add(node);
        q.add(node);
        
        while(!q.isEmpty()){
            int r=q.remove();
            for(int i:adj.get(r)){
                if(vis[i]==false){
                    vis[i]=true;
                    al.add(i);
                    q.add(i);
                }
            }
        }
    }
}