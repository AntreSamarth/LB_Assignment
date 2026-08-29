import java.io.*;
import java.util.*;

class Program935
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory : ");
        String Path = sobj.nextLine();

        System.out.println("Enter file to search : ");
        String FileName = sobj.nextLine();

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

        boolean bFlag = false;

        if(files != null)
        {
            for(File f : files)
            {
                if(f.isFile() && f.getName().equals(FileName))
                {
                    bFlag = true;

                    System.out.println();
                    System.out.println("File found");
                    System.out.println();

                    System.out.println("Name : " + f.getName());
                    System.out.println("Size : " + f.length() + " bytes");
                    System.out.println("Path : " + f.getAbsolutePath());

                    break;
                }
            }
        }

        if(bFlag == false)
        {
            System.out.println();
            System.out.println(FileName + " not found");
        }

        sobj.close();
    }
}