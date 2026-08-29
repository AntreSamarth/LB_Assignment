import java.io.*;
import java.util.*;

class Program936
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Enter source file : ");
            String SourceFile = sobj.nextLine();

            System.out.println("Enter destination file : ");
            String DestinationFile = sobj.nextLine();

            FileInputStream fis =
                new FileInputStream(SourceFile);

            FileOutputStream fos =
                new FileOutputStream(DestinationFile);

            byte buffer[] = new byte[1024];

            int bytesread = 0;

            while((bytesread = fis.read(buffer)) != -1)
            {
                fos.write(buffer, 0, bytesread);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully");
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }

        sobj.close();
    }
}