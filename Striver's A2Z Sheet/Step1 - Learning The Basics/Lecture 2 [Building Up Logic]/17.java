public class Solution {
    public static void alphaHill(int n) {
        for(int i=1;i<=n;i++){
            char ch = 'A';
            for(int j=n-i;j>=1;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(ch+" ");
                ch++;
            }
            ch--;
            for(int l=0;l<i-1;l++){
                ch--;
                System.out.print(ch+" ");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}