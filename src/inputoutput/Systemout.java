package inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Project: jumptojava
 * FileName: Systemout
 * Date: 2016-03-30
 * Time: 오전 9:09
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Systemout {
    public static void main(String[] args) throws IOException {
        final FileOutputStream output = new FileOutputStream("d:/system.out.txt");
        final PrintStream printOut = new PrintStream(output);

        System.setOut(printOut);
        System.out.println("hello world");

        output.close();
    }
}
