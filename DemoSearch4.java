public class DemoSearch4 {
    public static void main(String args[]){
    int myArray[] = {34,2,3,5,68,45,78,90,34,1,56};
    int num1= 45;
    int num2 = 30;
    int num3 = 56;

    boolean found1 = false;
    boolean found2 = false;
    boolean found3 = false;
    for(int i=0;i<myArray.length;i++){
        if(myArray[i]==num1){
            found1= true;
        }
        if(myArray[i]==num2){
            found2 = true;
        }
        if(myArray[i]==num3){
            found3 = true;
        }
    }
    if(found1){
        System.out.println(num1+"is present in Array");
    }else{
        System.out.println(num1+"in not Present in Array");
    }
    if(found2){
        System.out.println(num2+"is Present in Array");

    }else{
        System.out.println(num2+"is not Present in Array");
    }
      if(found3){
        System.out.println(num3+"is Present in Array");
        }else{
          System.out.println(num3+"is not present in Array");
       }
   }
}
