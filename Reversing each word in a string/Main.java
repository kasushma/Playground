import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String revstr="";
  String words[]=str.split(" ");
    for(int i=0;i<words.length;i++){
     String word=words[i];
      String revw="";
      for(int j=word.length()-1;j>=0;j--){
        revw=revw+word.charAt(j);
      }
      revstr=revstr+revw+" ";
    }
    System.out.println(revstr);
  }
}