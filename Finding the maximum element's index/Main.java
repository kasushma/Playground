import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int index = 0; index < n; index++)
    {
      list[index] = sc.nextInt();
    }
    elem(list, n);
	}

	public static void elem(int list[], int n)
	{
		 int max=0,m=0;
		  for(int index = 0; index <= (n-1); index = index +1)
		  {
		   if(list[index]>max){
             max=list[index];
             m=index;;
           }
            else
              max=max;
		  }
		System.out.println(m);
		 
  }
}