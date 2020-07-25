package collections.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLauncher {
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = new int[8];
        System.out.println("Please enter 8 elements.");

        for(int j=0;j<myArray.length;j++){
            System.out.println("Next element.");
            myArray[j]=scanner.nextInt();
        }
        int[] array=sort(myArray);

        for(int i=0;i<array.length;i++){
            System.out.println("Element # " +i+ " = " + myArray[i]);
        }


    }

    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array.length - 1; y++) {
                if (array[y] > array[y + 1]) {
                    int temp = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = temp;
                }
            }
        }
        return array;
    }

    private static int[] copyArray(int[] array){
        /*int[] myNewArray=new int[array.length];
        for(int i=0;i<array.length;i++){ myNewArray[i]=array[i];*/
        int[] myNewArray= Arrays.copyOf(array,array.length);//It's a copy of our "array" array.
        return myNewArray;
        }
    }

