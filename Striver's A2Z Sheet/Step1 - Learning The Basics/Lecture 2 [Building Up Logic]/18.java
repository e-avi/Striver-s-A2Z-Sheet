public class Solution {
    public static void alphaTriangle(int n) {
        char ch = 'A';
        for(int i=1;i<n;i++){
            ch++;
        }
        for(int i=1;i<=n;i++){
            char chr = ch;
            for(int j=1;j<=i;j++){
                System.out.print(chr+" ");
                chr--;
            }
            System.out.println();
        }
    }
}