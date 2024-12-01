public class AscendingOrderArray {
    public static void main(String args[]){
        int myArray[] ={9,8,2,6,5,1,4,7,3};

       int temp = 0;
       for(int i=0;i<myArray.length;i++){
       }

       for(int i=0;i<myArray.length;i++){
          for(int j=i+1;j<myArray.length;j++){
            if(myArray[i]>myArray[j]){

                temp =myArray[i];
                myArray[i] =myArray[j];
                myArray[j] = temp;
            }
          }
        }
       for(int i=0;i<myArray.length;i++){
        System.out.print(myArray[i]+" ");
       }


    }
    
}
