import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      int g=0;
      for(int i=0;i<n;i++)
          {
            a[i]=s.nextInt();
          }
   
          for(int i=0;i<n;i++)
          {
            if(a[i]>g){
             g=a[i];
            }
            else
              g=g;
          }
              System.out.println(g);
    }
}