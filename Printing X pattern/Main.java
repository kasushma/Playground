import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
      	int i=0,j=0;
		for (int row_no = 1; row_no <= n; row_no++) {
			
			for(int star = 1; star <= n; star++) {
              if(star==1+i||star==n-j)
				System.out.print("*");
                else 
                  System.out.print(" ");
             
			}
          i=i+1;
          j=j+1;
			System.out.print("\n");
		}
		
		
	}
}