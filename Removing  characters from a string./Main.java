import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String string = in.nextLine(); 
     StringBuilder str = new StringBuilder(string);
    String strg = in.nextLine();
    StringBuilder str1 = new StringBuilder(strg);
  
    int str_len = str.length();
     int str_lenl= str1.length();
  
    for(int index1 = 0; index1 < str_lenl; index1++)
    {
        for(int index2 = 0; index2 < str_len; index2++)
        {
            if(str1.charAt(index1) == str.charAt(index2))
            {
               
                    str.setCharAt(index2,' ' );
               
            }
        }
    }
    for(int i=0;i<str_len;i++){
      if(str.charAt(i)!=' ')
    System.out.print(str.charAt(i));
    }
  }
}