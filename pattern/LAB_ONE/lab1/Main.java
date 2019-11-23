import org.apache.commons.codec.digest.DigestUtils;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Main

{
    public static void main (String[] args) throws IOException {
        if (args[0].equals("-i"))
        {
        InteractiveMode im = new InteractiveMode(true);
        im.interactive();
        }
        else
        {
          SimpleMode sm = new SimpleMode(args);
        sm.simple();
        }
    }

}
