import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int row_no = 1; row_no <= n; row_no++) {
			
			for(int star = 1; star <= n; star++) {
              if(row_no==1||row_no==n)
				System.out.print("*");
              else{
                if(star==1||star==n)
                  System.out.print("*");
                else 
                  System.out.print(" ");
              }
			}
			System.out.print("\n");
		}
		
	}
}