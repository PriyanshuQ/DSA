//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
public:

    bool chk(int k,vector<int> &st,int mid){
        
        int cnt = 1;
        int prev = st[0];
        
        for(int i=1;i<st.size();i++){
            if(st[i] - prev >= mid){
                prev = st[i];
                cnt++;
            }
        }
        
        
        if(cnt >= k){
            return true;
        }
        return false;
    }

    int solve(int n, int k, vector<int> &stalls) {
        // Write your code here
        int l=0,r=1e9;
        sort(stalls.begin(),stalls.end());
        int ans;
        while(l <= r){
            int mid = (r-l)/2 + l;
            if(chk(k,stalls,mid)){
                ans = mid;
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return ans;
    }
};

//{ Driver Code Starts.

int main() {
    int t = 1;
    cin >> t;

    // freopen ("output_gfg.txt", "w", stdout);

    while (t--) {
        // Input

        int n, k;
        cin >> n >> k;

        vector<int> stalls(n);
        for (int i = 0; i < n; i++) {
            cin >> stalls[i];
        }
        // char ch;
        // cin >> ch;

        Solution obj;
        cout << obj.solve(n, k, stalls) << endl;

        // cout << "~\n";
    }
    // fclose(stdout);

    return 0;
}
// } Driver Code Ends