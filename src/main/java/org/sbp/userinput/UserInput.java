package org.sbp.userinput;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UserInput {

    public static void main(String[] args) {

        //Read and print 3 input from user
        //readByScanner();
        readByBufferedReder();

    }

    //Approach 1
    private static void readByScanner()
    {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int[] ints = new int[3];

        while(count<3) {
            int i = scanner.nextInt();
            ints[count] = i;
            count++;
        }
        scanner.close();

        for(int k=0; k < ints.length; k++){
            System.out.println(ints[k]);
        }
    }

    //Approach 2
    private static void readByBufferedReder() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three number: ");

        int count = 0;
        int[] ints = new int[3];

        while (count < 3 ) {
            int k = 0;
            boolean receivedInt = true;

            while (receivedInt){
                try {
                    k = Integer.parseInt(br.readLine());
                    receivedInt = false;
                    System.out.println("Test1");
                }catch (NumberFormatException nfe){
                    System.out.println("Input is not number. Please enter the number");
                    receivedInt = true;
                }
                catch (IOException ex){
                    System.out.println("Input is not number.");
                    receivedInt = true;
                }

                if(!receivedInt)
                    break;
            }

            ints[count] = k;
            count++;
        }

        for(int k=0; k < ints.length; k++){
            System.out.println(ints[k]);
        }
    }
}