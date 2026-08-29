import java.io.*;
import java.util.*;

class Program934
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Enter file name : ");
            String FileName = sobj.nextLine();

            System.out.println("Enter data : ");
            String Data = sobj.nextLine();

            FileOutputStream fos =
                new FileOutputStream(FileName);

            byte Arr[] = Data.getBytes();

            fos.write(Arr);

            fos.close();

            System.out.println("Data written successfully");
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }

        sobj.close();
    }
}