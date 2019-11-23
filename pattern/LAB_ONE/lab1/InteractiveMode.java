//import org.apache.commons.codec.digest.DigestUtils;

//import java.io.FileNotFoundException;
import java.util.Scanner;
//import java.io.FileInputStream;
import java.io.IOException;

public class InteractiveMode
{
    boolean IsGood;
    public InteractiveMode (boolean b)
    {
        this.IsGood = b;
    }
    public void interactive() throws IOException {
        while (IsGood == true)
        {
            System.out.println(" press 1 to use md5 \n press 2 to use sha256\n press 3 to exit\n");
            Scanner in = new Scanner(System.in);
            int var = in.nextInt();

            switch (var)
            {
                case 1:
                    try {
                        System.out.println("enter name of a file, please");
                        Scanner inn = new Scanner(System.in);
                        String NameOfFile = inn.nextLine();

                        Hashing hax = new Hashing(NameOfFile);
                        String result1 = hax.Md5Hex();
                        System.out.println(result1);
                    }catch (IOException e)
                    {
                        System.out.println("error!!!");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("enter name of a file, please");
                        Scanner innn = new Scanner (System.in);
                        String NameOfFile2 = innn.nextLine();
                        Hashing hax = new Hashing(NameOfFile2);
                        String result2 = hax.Sha256Hex();
                        System.out.println(result2);
                    }catch (IOException e)
                    {
                        System.out.println("error!!!");
                    }
                    break;
                case 3:
                    IsGood = false;
                    break;
            }
        }
    }
}
