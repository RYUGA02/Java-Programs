public class Main {
    public static void main(String[] args) {

        int[][] mat = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        int row  = mat.length -1;
        int col  = mat[0].length  -1 ;


        for ( int i  = 0 ; i<= row ;i++ ) {
            System.out.print(mat[i][0]+" ");
        }

        for (int i=0 ;i<=row  ;i++) {
            System.out.print(mat[i][i]+" ");
        }


        for ( int i  = 0 ; i<=row ;i++ ) {
            System.out.print(mat[i][col]+" ");
        }
    }
}