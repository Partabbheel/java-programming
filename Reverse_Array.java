import java.util.*;

public class Reverse_Array {
    public static void main(String args[]){
        int arr[] = new int[6];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter elements in array:");
        for(int i=0;i<arr.length;i++){
        arr[i] =sc.nextInt();
        }
        System.out.print("array elements: ");
        //for(int i=0;i<arr.length;i++){
           // System.out.print(arr[i]+" ");
        
        
            for(int i=arr.length-1;i>=0;i--){
                System.out.println(arr[i]+" ");
            }
        }

   // }
}
