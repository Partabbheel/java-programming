public class palindrom1 {
    public static void main(String args[]){
        int array[] ={231,323,345,676,551};
        
        for(int i=0;i<array.length;i++){
            int num = array[i];
            int reverseNum =0;
            int OriginalNum = num;

            for(int j=num;j!=0;j /=10){
                int remainder = j%10;

                reverseNum =reverseNum*10+remainder;

            }
            if(OriginalNum == reverseNum){
                System.out.print(array[i]+" ");
            }
        }
    }
    
}
