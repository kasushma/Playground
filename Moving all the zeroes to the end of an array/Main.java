import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
     int a[]=new int[n]; 
      for(int i=0;i<n;i++){
        a[i]=s.nextInt();
      }
      elem(n,a);
      for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
  public static void elem(int n,int a[]){
    int c=0;
    int b[]=new int[n];
    int bs=0;
   for(int i=0;i<n;i++){
     if(a[i]==0){
       c++;
     }
     else{
      b[bs]=a[i];
       bs++;
     }
   } 
    int j=0;
   for(int i=0;i<bs;i++){
     a[j]=b[i];
     j++;
   }   
    for(int i=0;i<c;i++){
     a[j] = 0;
     j++;
   } 
  }
}