public class DemoSearch5 {
    public static void main(String args[]){
        int myArray[] = {45,78,90,43,23,12,21,43,65,7,5};

        int num1 = 3;
        int num2 = 90;
        int num3 = 23;
        int num4 = 21;

        boolean found1 = false;
        boolean found2 = false;
        boolean found3 = false;
        boolean found4 = false;
        for(int i=0;i<myArray.length;i++){
            if(myArray[i]==num1){
                found1 =true;
            }
            if(num2 ==myArray[i]){
                found2 = true;
            }  
            if(num3 == myArray[i]){
                found3 = false;
            } 
            if(num4 == myArray[i]){
                found4 = true;
            }
        }
        if(found1){
            System.out.println(num1+ " Is Present in Array");
        }else{
            System.out.println(num1+ " Is not Present in Array");
        }
        if(found2){
            System.out.println(num2+ " Is Present in Array");
        }else{
            System.out.println(num2+ " Is not Present in Array");
        }
        if(found3){
            System.out.println(num3+ " Is Present in Array");
        }else{
            System.out.println(num3+ " Is not Present in Array");
        }
        if(found4){
            System.out.println(num4+ " Is Present in Array");
        }else{
            System.out.println(num4+ " Is not Present in Array");
        }

    }
    
}
