import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
     int n= gcd(n1,n2);
      int v=gcd(n,n3);
      System.out.println(v);
      
	}
  public static int gcd(int a,int b){
    int min,gcd=0;
    if(a>b)
      min= a;
      else
      min=b;
    while(min>=1){
    if((a%min==0)&&(b%min==0))
    {
      gcd=min;
      break;
    }
      else
        min=min-1;;
  }
    return gcd;
  }
}