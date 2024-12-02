public class BinarySearch3 {
    public static void main(String args[]){
        int array[] = {2,5,8,12,16,23};

        int num = 16;
        int firstindex = 0;
        int lastIndex = array.length-1;

        for(int mid = firstindex;mid<=lastIndex;mid++){
            int midindex = firstindex+(firstindex-lastIndex)/2;

            if(array[mid]==num){
                System.out.println("Element found in Array:"+num);
                break;
            }else if(array[mid]<num){
                lastIndex= mid+1;
            }else{
                lastIndex = mid -1;
            }
        }
        if(firstindex> lastIndex){
            System.out.println("Element not found in the Array:");
        }
    }
    
}
