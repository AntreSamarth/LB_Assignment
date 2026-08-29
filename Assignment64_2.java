import java.io.*;
import java.util.*;

class Program935
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

            FileInputStream fis =
                new FileInputStream(file);

            System.out.println();
            System.out.println("File contents : ");
            System.out.println();

            int ch = 0;

            while((ch = fis.read()) != -1)
            {
                System.out.print((char)ch);
            }

            System.out.println();

            fis.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }

        sobj.close();
    }
}