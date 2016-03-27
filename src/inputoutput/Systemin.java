package inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Project: jumptojava
 * FileName: Systemin
 * Date: 2016-03-28
 * Time: 오전 1:06
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Systemin {
    public static void main(String[] args) throws IOException {
        final InputStreamReader r = new InputStreamReader(System.in);
        final BufferedReader b = new BufferedReader(r);

        final String userInput = b.readLine();
        System.out.println("user input: " + userInput);
    }

}
