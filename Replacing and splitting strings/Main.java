import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner scan=new Scanner(System.in);
      String str = scan.nextLine();
        StringBuilder str1  = new StringBuilder(str);
      String st = scan.nextLine();
        StringBuilder str2 = new StringBuilder(st);
      int n=str1.length();
      str1.replace(0,n-1,st);
      String arr[]=st.split(" ");
      for(String x:arr)
        System.out.println(x);
    }
}