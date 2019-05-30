import java.util.Scanner;
class Main{
       public static boolean prime(int m){
  boolean f=true;
   for(int i=2;i<m;i++){
      if(m%i==0){
     f=false;
      break; 
   }
   }
    return f;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
   int n = in.nextInt();
      int k;
      for(k=2;k<n;++k)
      if(prime(k))
      System.out.println(k);
    }
  
	
}