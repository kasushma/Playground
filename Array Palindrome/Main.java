import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
       Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
       
       int l = 0;
       int r = arr_size-1;
       int f=0;
       while(l <r)
       {
          if(arr[l]==arr[r])
          {
            f=1;
          }
          else 
          {f=0;
          }
          r--;
             l++;
       }
      if(f==1)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}