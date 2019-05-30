import java.util.Scanner;
class Main
{
	  public static int prod(int m)
   {
      int p=m*m;
      return p;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
    
        int s = prod(n);
        n = s;
     
     System.out.println(n);
   }
}