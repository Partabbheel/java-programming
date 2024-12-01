public class DescendingorderArray {
    public static void main(String args[]){
        int arr[] = {7,9,35,70,45,23,44};
       int temp =0;
        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++){
                if(arr[i]<arr[j]){

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for(int i=0;i<6;i++){
            System.out.print(arr[i]+" ,");
        }
    }
    
}
