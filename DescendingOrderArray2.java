import java.util.*;

public class DescendingOrderArray2 {
    public static void main(String args[]){
        int myArray[] = new int[8];
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements in Array:");
        for(int i=0;i<8;i++){
            myArray[i] = sc.nextInt();
        }
        int temp =0;
        for(int i=0;i<8;i++){
            for(int j=i+1;j<8;j++){
                if(myArray[i]<myArray[j]){

                    temp = myArray[i];
                    myArray[i]=myArray[j];
                    myArray[j] =  temp;
                }
            }
        }
        for(int i=0;i<8;i++){
            System.out.print(myArray[i]+" ");
        }
    }
}

    

