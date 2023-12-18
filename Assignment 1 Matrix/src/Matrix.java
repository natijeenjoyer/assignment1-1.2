public class Matrix {
        public int[][] m1;
        public int[][] m2;
        public int[][] multiple;
        public int[][] addition;

        public int numb;

        public Matrix(int[][] m1, int[][] m2){
                this.m1 = m1;
                this.m2 = m2;

        }

        public void soutarray(int[][] m1, int[][] m2){

                System.out.println("Array 1:");
                for (int i = 0; i < m1.length; i++){
                        for (int j = 0; j < m1.length; j++){
                                System.out.print(m1[i][j] + " ");
                        }
                        System.out.print("\n");
                }

                System.out.println("Array 2");
                for (int i =0; i < m2.length; i++){
                        for (int j = 0; j < m2.length; j++){
                                System.out.print(m2[i][j] + " ");
                        }
                        System.out.print("\n");
                }
        }

        public void multiplearray(int[][]  m1, int[][] m2, int[][] multiple){
                System.out.println("Multiplication is: ");
                for (int i = 0; i < m1.length; i++){
                        for(int j = 0; j < m2.length; j++){
                                multiple[i][j] = m1[i][j] * m2[i][j];
                                System.out.print(multiple[i][j] + " ");
                        }
                        System.out.println();
                }
        }

        public void addarray(int[][] m1, int[][] m2, int[][] addition){
                System.out.println("Addition is: ");
                for (int i = 0; i < m1.length; i++){
                        for(int j = 0; j < m2.length; j++){
                                addition[i][j] = m1[i][j] + m2[i][j];
                                System.out.print(addition[i][j] + " ");
                        }
                        System.out.println();
                }
        }



}