import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
        Scanner s=new Scanner(System.in);
      String s1=s.nextLine();
      int sl=s1.length();
      int s2[]=new int[26];
      for(int i=0;i<=25;i++)
        s2[i]=0;
      for(int i=0;i<sl;i++)
      {
        if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
        {
          int of=s1.charAt(i)-'a';
          s2[of]++;
        }
        else if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
        {
          int of=s1.charAt(i)-'A';
          s2[of]++;
        }
      }
     
      
      for(int i=0;i<=25;i++){
       if(s2[i]==0)
       {char c=(char) ('a'+i);
         System.out.print(c+" ");
       }
      }
    }
}