/**
 * @author Josh Gibb
 * LatticePath.java
 */
public class LatticePath {
    // A method to find the number of paths
    public static long path(int size){
        long[][] grid = new long[size+1][size+1];
        for(int i = 0; i <= size; i++){
            grid[i][0] = 1;
        }
        for(int i = 0; i <= size; i++){
            grid[0][i] = 1;
        }
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                grid[i][j] = grid[i-1][j] + grid[i][j-1];
            }
        }
        return grid[size][size];
    }

    public static void main(String[] args){
        System.out.println(path(20));
    }
}
