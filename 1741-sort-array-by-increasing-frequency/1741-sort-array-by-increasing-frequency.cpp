class Solution {
public:
    vector<int> frequencySort(vector<int>& nums) {
        int n = nums.size();
        map<int,int>map;
        for(int i=0;i<n;i++){
            map[nums[i]]++;
        }

        vector<int>ans;
        vector<vector<int>>pair;
        for(auto i:map){
            vector<int>pop;
            pop.push_back(i.second);
            pop.push_back(i.first);
            pair.push_back(pop);
        }


        sort(pair.begin(),pair.end());

        for(auto i:pair){
            cout<<i[0]<<" "<<i[1]<<endl;
        }

        for(int i=pair.size()-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                if(pair[i][0]==pair[j][0]){
                    if(pair[i][1]>pair[j][1]){
                        int p=pair[j][1];
                        pair[j][1] = pair[i][1];
                        pair[i][1]=p;
                    }
                
                }
            }
        }

        for(auto i:pair){
            int t=i[0];
            while(t>0){
                ans.push_back(i[1]);
                t--;
            }
        }

        return ans;
    }
};