class Solution {
    public List<List<Integer>> fourSum(int[] A, int t) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(A);
        int n1 = A.length - 3, n2 = n1 + 1;
        for(int i = 0; i < n1; i++){
            for(int j = i + 1; j < n2; j++){
                for(int l = j + 1, r = n2 + 1; l < r;){
                    long temp = (long)A[i] + A[j] + A[l] + A[r];
                    if(temp < t) l++;
                    else if(temp > t) r--;
                    else{
                        ArrayList<Integer> arr = new ArrayList<>();
                        arr.add(A[l]); arr.add(A[i]);
                        arr.add(A[r]); arr.add(A[j]);
                        list.add(arr);
                        while(l < r && A[l] == A[l + 1]) l++;
                        while(l < r && A[r] == A[r - 1]) r--;
                        l++;r--;
                    }
                }
                while(j < n2 && A[j] == A[j + 1]) j++;
            }
            while(i < n1 && A[i] == A[i + 1]) i++;
        }
        return list;
    }
}