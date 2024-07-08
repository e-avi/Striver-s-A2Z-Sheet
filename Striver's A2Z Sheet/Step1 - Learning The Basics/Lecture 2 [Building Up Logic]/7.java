public class Solution {
    public static void nStarTriangle(int n) {
        for(int i=1; i<=n; i++){
            for(int k=i;k<=n-1;k++){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>0;j--){
                System.out.print("*");
            }
            for(int k=i;k<=n-1;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}