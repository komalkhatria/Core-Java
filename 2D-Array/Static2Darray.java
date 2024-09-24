public class Static2Darray {
    public static void main(String[] args) {
        //CREATING STATIC 2D ARRAY
        int a[][]= {{2, 4, 1}, {3, 7, 2, 8}, {7, 3, 5}};

        for(int i=0; i<a.length; i++){          //THIS LOOP RUNS THREE TIMES (LENGTH OF ARRAY a)
            for(int j=0; j<a[i].length; j++){       //THIS LOOP RUNS TILL THE LENGTH OF ARRAY a[i]
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
