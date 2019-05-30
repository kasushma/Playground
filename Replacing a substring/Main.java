import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
       Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str); // Copying input string to sb (StringBuilder)
     String rep = scan.nextLine(); 
      String inc = scan.nextLine();
    
      
    System.out.print(str.replace(rep,inc));
    }
}