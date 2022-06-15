import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Arrays;

public class BatchTester {

    public static void main(String args[]) {
        int num = 5;

            try {
                File f = new File("Output.txt");
                FileOutputStream fos = new FileOutputStream(f);
                PrintWriter pw = new PrintWriter(fos);
                while (num > 1) {

                    int[] arr = {54, 63, 14, 6, 21, 5, 94, 2};
                    Arrays.sort(arr);
                    String s = "";
                    for (int i = 0; i < arr.length; i++) {
                        s = s + arr[i] + ",";
                    }

                    pw.write(s);
                    pw.flush();
                    System.out.println("Output Written to file");
                    num--;
                }
                fos.close();
                pw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
    }
}
