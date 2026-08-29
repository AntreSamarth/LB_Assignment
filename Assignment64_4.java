import java.io.*;
import java.util.*;
import java.text.*;

class Program937
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Enter file name : ");
            String FileName = sobj.nextLine();

            File file = new File(FileName);

            if(file.exists() == false)
            {
                System.out.println("File does not exist");
                return;
            }

            Date date = new Date(file.lastModified());

            System.out.println();
            System.out.println("File Name      : " + file.getName());
            System.out.println("Absolute Path  : " + file.getAbsolutePath());
            System.out.println("File Size      : " + file.length() + " bytes");
            System.out.println("Readable       : " + file.canRead());
            System.out.println("Writable       : " + file.canWrite());
            System.out.println("Hidden         : " + file.isHidden());
            System.out.println("Last Modified  : " + date);
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }

        sobj.close();
    }
}