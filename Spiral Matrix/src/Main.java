import java.util.List;
import java.util.function.Function;

/**
 * Collins K. Sang
 * $DATE $TIME
 * $PROJECT_NAME
 * $NAME
 * $PRODUCT_NAME
 **/


public class Main {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6,
                7, 8, 9, 10, 11, 12,
                13, 14, 15, 16, 17, 18 };

        int[][] mat = new int[Spiral_matrix.R][Spiral_matrix.C];
        Spiral_matrix.formSpiralMatrix(arr, mat);
        Spiral_matrix.printSpiralMatrix(mat);
    }
}