public class DemoSearch3 {
    public static void main(String args[]){
        int myArray[] ={34,56,7,83,1,4};

        int num1 = 5;
        boolean found = false;
        for(int i=0;i<myArray.length;i++){
            if(myArray[i]==num1){
                found =true;
                break;

            }
        }
        if(found){
            System.out.println(num1+" is Present array");
        }else{
            System.out.println(num1+" is not present in array");
        }
    }
    
}
