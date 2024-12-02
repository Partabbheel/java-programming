public class AmStrongNumber{
    public static void main(String args[]){
        int num = 371;
        int temp= num;
        int sum = 0;
        int digitCount = String.valueOf(num).length();

        for(int i= num;i!=0;i/=10){
            int remainder = i%10;
            sum +=(int)Math.pow(remainder,digitCount);
        }
        if(sum == temp){
            System.out.println(temp+ " = Is AmStrong Number");
        }else{
            System.out.println(temp+"Is not An AmStrong number");
        }
    }
}
