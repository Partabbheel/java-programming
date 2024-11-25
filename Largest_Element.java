public class Largest_Element {
    
public static void main(String args[]){
    
    int[][] numbers = {{45,50,35},
                       {90,80,10}};

    int largest = numbers[0][0];
    for(int i = 0;i<numbers.length;i++){
        for(int j= 0;j<numbers[i].length;j++){
            
            if(numbers[i][j]>largest){
                largest= numbers[i][j];
            }
        }
    }
    System.out.println("largest element = "+largest);
  }
}

