class Calculator{
    public float add(float num1,float num2,float num3){
        return num1+num2;

    }
    public long add(long num1,long num2){
        return num1+num2;
    }
    public short add(short num1,short num2){
        return(short)(num1+num2);
    }
}

public class DemoOverloading2 {
    public static void main(String args[]){
        Calculator obj = new Calculator();
        //float floatResult = obj.add(10.5,20.7);
        System.out.println("Float value:"+obj.add(10.5f,20.7f,30.8f));
        System.out.println("Long value:"+obj.add(10000000,20000000));
        System.out.println("Short value:"+obj.add (10,20));
    }
    
}
