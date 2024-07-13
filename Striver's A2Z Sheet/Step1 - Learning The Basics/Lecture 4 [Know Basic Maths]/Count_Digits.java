class Solution{
    static int evenlyDivides(int N){
        // code here
        int NUM = N;
        int count = 0;
        int num;
        while(N != 0){
            if(N>9){
                num = N%10;
            }
            else{
                num = N;
            }
            if(num !=0 && NUM%num==0){
                count++;
            }
            N = N/10;
        }
        return count;
    }
}