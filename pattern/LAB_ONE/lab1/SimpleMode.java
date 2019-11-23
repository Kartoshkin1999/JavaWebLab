//import org.apache.commons.codec.digest.DigestUtils;

//import java.io.FileNotFoundException;
//import java.util.Scanner;
//import java.io.FileInputStream;
import java.io.IOException;

public class SimpleMode
{
    String type;
    String[] args;

    public SimpleMode(String[] NewArgs)
    {
        this.type = NewArgs[0];
        this.args = NewArgs;
    }

    public void simple()
    {
        switch (type)
        {
            case("-md5"):
                for (int i = 2; i < args.length; i++)
                {
                    try
                    {
                        String filename = args[i];
                        Hashing hex = new Hashing(filename);
                        String res1 = hex.Md5Hex();
                        System.out.println(res1);
                    }catch (IOException e)
                    {
                        System.out.println("error!!!");
                    }
                }
                break;
            case("-sha256"):
                for (int i = 2; i < args.length; i++)
                {
                    try
                    {
                        String filename = args[i];
                        Hashing hex = new Hashing(filename);
                        String res2 = hex.Sha256Hex();
                        System.out.println(res2);
                    }catch (IOException e)
                    {
                        System.out.println("error!!!");
                    }
                }
                break;
        }
    }
}
