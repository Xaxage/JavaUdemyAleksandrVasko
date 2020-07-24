package exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        PrintWriter writer=null;
        do {
            try {//We use it when we know where we can get an exception.
                System.out.println("Please enter numerator.");
                int numerator = scanner.nextInt();//we can get error here,so we "try" them
                System.out.println("Please enter denominator");
                int denominator = scanner.nextInt();//we can get error here,so we "try" them
                //System.out.println(divide(numerator, denominator));//we can get error here,so we "try" them
                writer= new PrintWriter(new FileWriter("out.txt"));//creating new file
                writer.println("Result =" + divide(numerator, denominator));
                /*writer.close();//It is essential cause after working with resources
                this method will close and save it in "out.txt".I think here we can
                delete this field cause anyway block "finally" will be done.*/
                /*saveToFile(divide(numerator, denominator));/*We have to add "catch" block
                 for IO exception.For unchecked exception we don't have to .For example we didn't add
                 catch block for divide's methods "NullPointerException".
                 Because NullPointerException is unchecked.
                 That is the difference between checked and unchecked exceptions.*/
                continueLoop=false;
            } catch (ArithmeticException | InputMismatchException e) {
                //We enter this block if we get one of those exceptions
                System.out.println("Exception : " + e);
                scanner.nextLine();
                System.out.println("Only integer non-zero values are allowed");
            } catch (IOException e) {
                System.out.println("Unable to open file");
                e.printStackTrace();//This field shows us or other devs where we got a problem.
            }finally {//In case we get an exception and we cant call our write.close().
                //In finally it will be done anyway.
                System.out.println("Finally block was called.");
                if (writer != null) {/*If in our "try" block we get an exception , before
                    creating our "writer",Java won't create "writer" and in "finally" we
                    get "NullPointerException".*/
                    writer.close();
                }
            }
        }while(continueLoop);
        System.out.println("Try catch block finished.");

    }
    private static int divide(int numerator,int denominator) throws ArithmeticException,NullPointerException{
        //It means that we can get one of those exceptions in this method.
        return  numerator/denominator;
    }

   /* private static void saveToFile(int res) throws IOException {
        PrintWriter writer= new PrintWriter(new FileWriter("out.txt"));
        //IO (checked) exception.That means that before compiling IDE already tells us about it.
        //We can add "throws IOException" after method , so we dont get error in method .
        writer.println("Result =" + res);
        writer.close();
    }*/
}
