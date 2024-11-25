public class Small_Element {
    public static void main(String args[]){
    
        int[][] numbers = {{45,50,35},
                           {90,80,10}};

        int smallest = numbers[0][0];
        for(int i = 0;i<numbers.length;i++){
            for(int j= 0;j<numbers[i].length;j++){
                
                if(numbers[i][j]<smallest){
                    smallest= numbers[i][j];
                }
            }
        }
        System.out.println("smallest element = "+smallest);
    }
    
}
