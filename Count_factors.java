import java.util.*;

public class Count_factors {
    public static void main(String args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int[] array =new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter element"+(i+1)+":");
            array[i] =sc.nextInt();
        }
        for(int num =0;num<size;num++){
         //   int num= array[i];
            int count =0;

            System.out.println("factors of "+num+":");

            for(int j=1;j<=num;j++){
                if(num % j==0){
                    System.out.println(j+" ");
                    count++;
                }
            }
            System.out.println("\n Number of factors:"+count);
        }
        System.out.println();
    }
    
}
