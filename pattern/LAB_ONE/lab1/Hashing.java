//import org.apache.commons.codec.digest.DigestUtils;

import org.apache.commons.codec.digest.DigestUtils;

//import java.io.FileNotFoundException;
//import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;





public class Hashing
{

    String fileName = null;

    public Hashing (String NameOfFile)
    {
        this.fileName = NameOfFile;
    }

    String Md5Hex () throws IOException
    {
        return DigestUtils.md5Hex(new FileInputStream(fileName));
    }

    String Sha256Hex () throws IOException
    {
        return DigestUtils.sha256Hex(new FileInputStream(fileName));
    }
}
