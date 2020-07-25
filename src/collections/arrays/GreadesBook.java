package collections.arrays;

import java.util.Arrays;

public class GreadesBook {
    public static void main(String[] args) {
        int[][] gradesArray = {{87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 65, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 100},
                {76, 72, 84},
                {87, 93, 73}};

        System.out.println("Minimal grade "+calcMin(gradesArray));
        varArgs();
        processArrays();
    }
    private static int calcMin(int[][] grades){
        int min=100;
        for(int[] row : grades) {
            for(int i: row){
                if(min>i){
                    min=i;
                }
            }
        }
        return min;
    }

    private static void varArgs(){
        double a=0.56;
        double b=1.90;
        double c=3.45;
        double d=5.01;
        System.out.println("Average of 2 elements is " + calcAverage(a,b));
        System.out.println("Average of 3 elements is " + calcAverage(a,b,c));
        System.out.println("Average of 4 elements is " + calcAverage(a,b,c,d));
    }

    private static double calcAverage(double... args){
        /*If we dont know how many arguments we get ,after "double,int,etc" we write "...".
        We need loop "for-each" for that kind of problems, cause in this loop we dont use
        indexes.*/

    double sum=0;
    for(double i:args){
        sum+=i;
    }
    return sum/args.length;
    }

    private static void processArrays(){
        double[] doubleArray={8.9,5.65,8.12,45.0,77.1};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));
        //"Arrays.toString" one love.

        int[] fiiledArray=new int[7];
        Arrays.fill(fiiledArray,7);//Fills our array with 7-s.[7,7,7,...7]
        System.out.println(Arrays.toString(fiiledArray));

        int[] intArray ={1,2,3,4,5,6,7};
        int[] arrayCopy=new int[10];
        System.arraycopy(intArray,0/*copying from main array  starting from which element*/,
                arrayCopy,0/*pasting into second array starting from which element*/,
                intArray.length/*how many elements to copy*/);
        System.out.println(Arrays.toString(arrayCopy));
    }
}

