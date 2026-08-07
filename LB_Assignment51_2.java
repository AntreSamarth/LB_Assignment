import java.io.*;
import java.util.*;

class Program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        String DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File Arr[] = fobj.listFiles();

            try
            {
                FileWriter fw = new FileWriter("Marvellous.txt");

                for(int i = 0; i < Arr.length; i++)
                {
                    if(Arr[i].isFile())
                    {
                        fw.write(Arr[i].getName());
                        fw.write("\n");
                    }
                }

                fw.close();
                System.out.println("File created successfully");
            }
            catch(IOException e)
            {
                System.out.println("Unable to create file");
            }
        }
        else
        {
            System.out.println("Directory not found");
        }
    }
}