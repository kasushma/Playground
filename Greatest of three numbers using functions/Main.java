import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
     int n= great(n1,n2);
      if(n>n3)
        System.out.println(n);
      else
         System.out.println(n3);
	}
  public static int great(int a,int b){
    if(a>b)
      return a;
      else
        return b;
  }
}