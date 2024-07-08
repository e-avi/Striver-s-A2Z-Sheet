import java.util.*;
public class For_Loop {


	public static void main(String[] args) {
		
		int n1=1,n2=1,n3=0;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for(int i=3; i<=n ; i++){
			n3 = n1+n2;
			n1=n2;
			n2=n3;
		}

		if(n==1 || n==2){
			return 1;
		}else{
			return n3;
		}

	}

}