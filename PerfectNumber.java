import java.util.*;

public class PerfectNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int Num= sc.nextInt();

        int n,sum =0;
        for(int i=1;i<Num;i++){
            if(Num%i==0){
                sum = sum+i;
            }
        }
        if(Num == sum){
            System.out.print("Perfect Number");
        }else{
            System.out.println("Not Perfect Number");
        }
    }
    
}
