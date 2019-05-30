import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
     int temp,v;
      int c=1;
      int k=n;
      while(n>0){
   
       n=n/10; 
        count=count+1;;
      }
   temp=count-2;
      while(temp>0)
      {
        c=(c*10);
        temp=temp-1;
      }
      v=(k/c);
      v=v%10;
        System.out.println(v);  
	}
}