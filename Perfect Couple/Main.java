import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
        Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      int v=s.nextInt();
      sol(n,a,v);
    }
   public static void sol(int n,int a[],int v){
     int sum=0;
     for(int i=0;i<n;i++)
     {
       for(int j=i+1;j<n;j++)
       {
         sum=a[i]+a[j];
         if(sum==v)
           System.out.println(a[i]+", "+a[j]);
       }
     }
    }
}