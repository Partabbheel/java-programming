class Calculator{
    public int add(int num1,int num2){
        return num1 +num2;
    }
    public int add(int num1,int num2,int num3){
        return num1 +num2+num3;
    }
    public double add(double num1,double num2){
        return num1+num2;
    }
}

public class Demo1 {
    public static void main(String args[]){
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10,20));
        System.out.println(calculator.add(10,20,30));
        System.out.println(calculator.add(10.5,20.7));
    }
    
}
