import java.util.*;

public class Sum_of_Array {
    public static void main(String args[]){
        int sum = 0;
        int arr[] = new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Elements in Array:");
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        System.out.print("Array Elements:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            sum=arr[i]+sum;
            
        }
        System.out.println("\nADDITION of Array Elements=" + sum);
    }
    
}
