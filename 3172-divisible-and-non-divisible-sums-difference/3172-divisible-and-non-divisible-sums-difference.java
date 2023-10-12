class Solution {
    public int differenceOfSums(int n, int m) {
        int num1=0;
        int num2=0;

        for(int i=0;i<n;i++){
            if((i+1)%m==0) num2+=(i+1);
            else num1+=(i+1);
        }
        return num1-num2;
    }
}