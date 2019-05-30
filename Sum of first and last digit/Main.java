import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      int temp=0;
      int i=n%10;
      while(n!=0)
      {
      temp=n;
         n=n/10;
      }
      sum=i+temp;
        System.out.println(sum);  
	}
}