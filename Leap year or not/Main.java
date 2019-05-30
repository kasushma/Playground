import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Type your code here
      Scanner s=new Scanner(System.in);
      int y=s.nextInt();
      if((y%4==0)&&(y%100!=0)||(y%400==0))
        System.out.println("Leap year");
      else
         System.out.println("Non Leap year");
    }
}