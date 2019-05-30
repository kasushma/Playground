import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
         Scanner in = new Scanner(System.in);
		    int n = in.nextInt();
      int m=1;
		    for(int rownum = 1; rownum <= n; ++rownum){
    		    for(int space = 1; space <= (n- rownum ); ++space){
    		        System.out.print(" ");
		        }
            	for(int colnum = 1; colnum <= rownum; ++ colnum){
    		        System.out.print(m+" ");
                  m=m+1;
    		    }  
            	System.out.print("\n");
		    }
    }    
}