import java.io.*;
import java.util.*;

class Program938
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Enter directory : ");
            String DirectoryName = sobj.nextLine();

            File folder = new File(DirectoryName);

            if(folder.exists() == false)
            {
                System.out.println("Directory does not exist");
                return;
            }

            if(folder.isDirectory() == false)
            {
                System.out.println("Given path is not a directory");
                return;
            }

            File files[] = folder.listFiles();

            System.out.println();
            System.out.println("Contents : ");
            System.out.println();

            if(files != null)
            {
                for(File file : files)
                {
                    System.out.println(file.getName());
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }

        sobj.close();
    }
}