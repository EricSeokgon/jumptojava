package inputoutput;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Project: jumptojava
 * FileName: Test
 * Date: 2016-03-31
 * Time: 오전 12:19
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //final FileOutputStream outputStream = new FileOutputStream("d:/out.txt");
        final FileWriter fw = new FileWriter("d:/out.txt");
        for (int i = 1; i < 11; i++) {
            String data = i + " 번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();
    }
}
