import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
      
       sub_array_sum(arr_size, arr);
      
   }
   public static void sub_array_sum(int arr_size, int arr[])
   {
     
       for(int index1 = 0; index1 <= arr_size - 1; index1++)
       {
           for(int index2 = index1; index2 <= arr_size - 1; index2++)
           {
               if(arr[index2]>arr[index1])
       
           System.out.println(arr[index1]+","+ arr[index2]);
     
           }
       }
     
   }
}  