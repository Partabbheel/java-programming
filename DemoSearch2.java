public class DemoSearch2 {
    public static void main(String args[]){
        int myArray[] ={5,6,8,9,34,23,21,3,4,6};
        int num = 9;

        boolean found = false;
        for(int i=0;i<myArray.length;i++){
            if(myArray[i]==num){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println(num+" is Present in array");
        }else{
            System.out.println(num+" is not Present in array");
        }
    }
    
}
