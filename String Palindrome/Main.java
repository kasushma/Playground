import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int str_len = sb.length();
    int end = str_len - 1;
    int front = 0;
      int t=0;
    while(front < end)
    {
      char ch = sb.charAt(front);
      char d=sb.charAt(end);
      if(ch!=d)
      {
        t=0;
      }
      else
        t=1;
      front++;
      end--;
    }
      if(t==1)
    System.out.println("Yes");
      else
         System.out.println("No");
  }
   
}