import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      sol(n,a);
    }
   public static void sol(int n,int a[]){
     int c=0;
     for(int i=0;i<n;i++){
       for(int j=i+1;j<n;j++){
         for(int k=j+1;k<n;k++){
           System.out.print("("+a[i]+","+" "+a[j]+","+" "+a[k]+")"+" ");
         }
         c=i;
       }
     if(c==i)
       System.out.print("\n");
     }
   }
}