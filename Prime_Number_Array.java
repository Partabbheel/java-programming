import java.util.*;

public class Prime_Number_Array {
    public static void main(String args[]){
         int count =0;
        int num[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers:");
        for(int i=0;i<num.length;i++){
            num[i] =sc.nextInt();
        }
        for(int i=0;i<num.length;i++){
            for(int k=1;k<=num[i];k++){
               if(num[i]% k== 0){
                    count ++;
                }
                if(count == 2){
                    System.out.print(num[i]+" ");
                    count=0;
                }
            }
        }
    }
    
}
