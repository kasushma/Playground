import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      double PI=3.14;
      switch(n)
      {
        case 1:int d=s.nextInt();
          System.out.println(d*d);
          break;
        case 2:int l=s.nextInt();
          int b=s.nextInt();
          System.out.println(l*b);
          break;
        case 3:int v=s.nextInt();
          int h=s.nextInt();
          System.out.println((v*h)/2);
          break;
        case 4:double r=s.nextInt();
          System.out.println(PI*r*r);
          break;
      }
    }
}