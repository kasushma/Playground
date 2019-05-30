import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
      int k = sc.nextInt();
    int list[] = new int[n];
    for(int i = 0; i < n; i++)
    {
      list[i] = sc.nextInt();
    }
   
    for (int i = 1; i<=k; i++)
    {int c=0;
      for (int j = 0; j<n; j++)
    {
      if(i==list[j]){
     c++;
    }
    }
      System.out.println(i+" "+c);
    }
    }
}