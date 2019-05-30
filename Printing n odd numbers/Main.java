import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
     int c=0;
      for (int i=1;c!=n;i++)
      {
        if(i%2!=0)
        {
        System.out.println(i);
          c=c+1;
        }
      }
	}
}