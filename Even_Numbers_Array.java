public class Even_Numbers_Array {
    public static void main(String args[]){
        int[] array ={1,2,3,4,5,6,7,8,9};

        System.out.println("EvenNumbers:");

        for(int i =0;i<array.length;i++){
            if(i% 2==0){
                System.out.print(i+" ");
            }
        }
    }
}
