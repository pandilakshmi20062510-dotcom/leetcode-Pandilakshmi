// Last updated: 12/08/2026, 20:31:46
class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        int num1=0;
        int num2=1;
        int num3=1;
        for(int i=3;i<=n;i++){
            int  res=num1+num2+num3;
            num1=num2;
            num2=num3;
            num3=res;
        }
        return num3;
    }
}