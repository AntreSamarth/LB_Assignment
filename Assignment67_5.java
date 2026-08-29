import java.io.*;
import java.util.*;

class Program949
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String FileName = sobj.nextLine();

        File file = new File(FileName);

        try
        {
            if(file.exists())
            {
                System.out.println(FileName + " already exists");
            }
            else
            {
                if(file.createNewFile())
                {
                    System.out.println(
                        FileName + " created successfully"
                    );
                }
                else
                {
                    System.out.println("File creation failed");
                }
            }

            System.out.println();
            System.out.println("File name : " + file.getName());
            System.out.println("Absolute path : " +
                               file.getAbsolutePath());
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }

        sobj.close();
    }
}