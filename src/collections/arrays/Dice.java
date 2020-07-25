package collections.arrays;
import java.security.SecureRandom;
//We want to know how many times we get dices exact side .
public class Dice {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();//That is for getting random numbers
        int[] frequency = new int[7];//Array to count frequency
        for (int i = 0; i < 1000; i++) {//We will drop 1000 times
        ++ frequency[1+ random.nextInt(6)];//telling random to get numbers from 1 to 6.
            //"1+ random.nextInt(6)" that is only index.
        }

        for(int i=1;i<frequency.length;i++){//starting from 1 cause we have nothing in 0 index.
            System.out.println("Side "+ i+": "+frequency[i] );
        }
        multiDimArrayLauncher();
    }

    private static void multiDimArrayLauncher(){
        int[][] a ={{1,2},{3,4,5,6},{7,8,9}};

        int [][] b= new int[3][3];//3x3 matrix

        int[][] c= new int[2][];//It has 2 element-arrays , but unknown quantity of elements
        c[0]=new int[2];//First element-array has 2 element.
        c[0]=new int[4];//Second element-array has 4 element.

        for(int i =0; i<a.length; i++){
            for (int j =0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }
    }
}
