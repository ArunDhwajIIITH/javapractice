package org.sbp.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputStringAfterInt {

    public static void main(String[] args) {

        /* Input format
        =====================

        There are three lines of input:

        The first line contains an integer.
        The second line contains a double.
        The third line contains a String.

        Output Format
        ================

        There are three lines of output:

        On the first line, print String: followed by the unaltered String read from stdin.
        On the second line, print Double: followed by the unaltered double read from stdin.
        On the third line, print Int: followed by the unaltered integer read from stdin.

        Note: Here the normal sc.nextInt() and sc.nextLine() will not work.
        Reason: nextInt, one read the next, not till the end of line.
        As a safe side always, read the whole line, then parse it, to int, double, float, etc.
        */
        readByScanner();
    }

    //Approach 1
    private static void readByScanner()
    {
        Scanner sc = new Scanner(System.in);
        // sc.nextInt() ==> It will not give the expected

        int i = Integer.parseInt(sc.nextLine());
        Double d = Double.parseDouble(sc.nextLine());
        String str = sc.nextLine();
        sc.close();

        System.out.println("String: "+str);
        System.out.println("Double: "+d);
        System.out.println("Int: "+i);

    }
}