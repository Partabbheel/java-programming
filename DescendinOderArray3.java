public class DescendinOderArray3 {
    public static void main(String args[]){
        int arr[] = {90,60,50,80,70,10,40,20,30};
            System.out.println("Original array:");
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
         }
        int temp =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted array in descending order:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    
}
