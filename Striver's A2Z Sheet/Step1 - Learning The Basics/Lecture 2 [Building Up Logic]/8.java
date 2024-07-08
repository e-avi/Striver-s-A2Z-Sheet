public class Solution {
    public static void nStarTriangle(int n) {
        for(int i=n; i>=1; i--){
            for(int k=i;k<=n-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            for(int k=i;k<=n-1;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}