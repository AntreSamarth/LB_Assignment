import java.io.*;
import java.util.*;

class Program934
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory : ");
        String Path = sobj.nextLine();

        File folder = new File(Path);

        if(folder.exists() == false)
        {
            System.out.println("Directory does not exist");
            return;
        }

        if(folder.isDirectory() == false)
        {
            System.out.println("Path is not a directory");
            return;
        }

        File files[] = folder.listFiles();

        if(files != null)
        {
            for(File f : files)
            {
                if(f.isFile())
                {
                    System.out.println("[FILE] " + f.getName() +
                                       "\t" + f.length() + " bytes");
                }
                else if(f.isDirectory())
                {
                    System.out.println("[DIR]  " + f.getName());
                }
            }
        }

        sobj.close();
    }
}