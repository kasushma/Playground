import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
      Scanner scan = new Scanner(System.in);
       String str = scan.nextLine();
       StringBuilder sb = new StringBuilder(str);
       int sb_len = sb.length();
       for(int index = 0; index <= sb_len - 1; index++)
       {
           if(sb.charAt(index) == 'a'||sb.charAt(index) == 'e'||sb.charAt(index) == 'i'||sb.charAt(index) == 'o'||sb.charAt(index) == 'u')
           {
               sb.setCharAt(index,'$');
           }
       }
    for(int index = 0; index <= sb_len - 1; index++)
       {if(sb.charAt(index)!='$')
       System.out.print(sb.charAt(index));
    }
  }
}