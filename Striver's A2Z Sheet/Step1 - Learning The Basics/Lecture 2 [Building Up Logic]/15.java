public class Solution {
    public static void nLetterTriangle(int n) {
        for(int i=n;i>=1;i--){
            char ch = 'A';
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}