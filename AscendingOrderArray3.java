public class AscendingOrderArray3 {
    public static void main(String args[]){
            int arr[] = {5,7,4,2,9,3,8};
                System.out.println("Original array:");
             for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]+" ");
             }
            int temp =0;
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]){
    
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            
           System.out.print("Sorted array in descending order:");
        }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+",");
            }
        }
        
    }
    

