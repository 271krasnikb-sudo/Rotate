public class Rotate {
   public int[][] rotateArray(int[][] arr){
    
   int[][] rotated = new int[arr.length][arr[0].length];
    for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr[0].length; j++){
            rotated[j][arr.length - 1 - i] = arr[i][j];
        }
    }
   return rotated;
   }
}