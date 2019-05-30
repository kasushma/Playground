import java.util.Scanner;
class Main{
       public static int prod(int a,int b){
 int f=1;
         for(int i=1;i<=b;i++)
           f=f*a;
    return f;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
   int n = in.nextInt();
      int m = in.nextInt();
      int k;
     k=prod(n,m);
      System.out.println(k);
    }
  
	
}