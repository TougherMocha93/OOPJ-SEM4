package JavaCourseAKS.Mod3;

class matrixmul{
    public static void main(String[] args) {

        int[][] mat1 = new int[4][4];
        int[][] mat2 = new int[4][4];

        for(int i = 0; i < mat1.length ; i++){
            for(int j = 0; j < mat1[i].length; j++){
                mat1[i][j] = i;
            }
        }

        for(int i = 0; i < mat2.length ; i++){
            for(int j = 0; j < mat2[i].length; j++){
                mat2[i][j] = j;
            }
        }

        prnt(mat1);
        System.out.println();
        prnt(mat2);
        System.out.println();
        prnt(mul(mat1,mat2));
    }

    public static void prnt(int[][] mat){
        for(int i = 0; i < mat.length ; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + "\t") ;
            }
            System.out.println();
        }
    }

    public static int sumrc(int[][] mat1, int[][] mat2, int r, int c){
        int out = 0;
        for(int i = 0; i < mat1.length ; i++){
            out = out + mat1[r][c]*mat2[c][r];
        }
        return out;
    }

    public static int[][] mul(int[][] mat1, int[][] mat2){
        int matx[][] = new int[4][4];
        for(int i = 0; i < matx.length ; i++){
            for(int j = 0; j < matx[i].length; j++){
                matx[i][j] = sumrc(mat1,mat2,i,j);
            }
            //And here
        }
        return matx;
    }
}
