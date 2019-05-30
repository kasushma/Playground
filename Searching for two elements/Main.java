import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int b1=0,b2=0;
       int c1=0,c2=0;
      int a[]=new int[n];
      for(int i=0;i<n;i++)
          {
            a[i]=s.nextInt();
          }
          int b=s.nextInt();
          int c=s.nextInt();
          for(int i=0;i<n;i++)
          {
            if(b==a[i]){
              b1=1;
              b2=i;
              break;
            }
          }
      if(b1==1)
              System.out.println(b2);
            else
              System.out.println("-1");
      for(int i=0;i<n;i++)
          {
            if(c==a[i]){
              c1=1;
              c2=i;
              break;
            }
          }
      if(c1==1)
              System.out.println(c2);
            else
              System.out.println("-1");
         
    }
}