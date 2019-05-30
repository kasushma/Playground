import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		
  		// Type your code here
      	Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int p=1;
		for(int cur_row =1; cur_row <= n; cur_row++) {
			for(int cur_col=1; cur_col <=cur_row ; cur_col++) {
              if(p!=0)
              {
              System.out.print("*");
                p=0;
              }
             else
             {
               System.out.print("#");
               p=1;
             }
			}
		System.out.print("\n");
		}
    }
}