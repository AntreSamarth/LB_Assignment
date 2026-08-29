import java.io.*;
import java.util.*;

class Program936
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String FileName = sobj.nextLine();

        File file = new File(FileName);

        if(file.exists() == false)
        {
            System.out.println("File does not exist");
            return;
        }

        int iCharacters = 0;
        int iWords = 0;
        int iLines = 0;
        int iUppercase = 0;
        int iLowercase = 0;
        int iDigits = 0;
        int iSpaces = 0;

        try
        {
            FileInputStream fis = new FileInputStream(file);

            int iData;
            boolean bWord = false;

            while((iData = fis.read()) != -1)
            {
                char ch = (char)iData;

                iCharacters++;

                if(Character.isUpperCase(ch))
                {
                    iUppercase++;
                }

                if(Character.isLowerCase(ch))
                {
                    iLowercase++;
                }

                if(Character.isDigit(ch))
                {
                    iDigits++;
                }

                if(ch == ' ')
                {
                    iSpaces++;
                }

                if(ch == '\n')
                {
                    iLines++;
                }

                if(Character.isWhitespace(ch))
                {
                    bWord = false;
                }
                else if(bWord == false)
                {
                    iWords++;
                    bWord = true;
                }
            }

            fis.close();

            System.out.println();
            System.out.println("Characters : " + iCharacters);
            System.out.println("Words      : " + iWords);
            System.out.println("Lines      : " + iLines);
            System.out.println("Uppercase  : " + iUppercase);
            System.out.println("Lowercase  : " + iLowercase);
            System.out.println("Digits     : " + iDigits);
            System.out.println("Spaces     : " + iSpaces);
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }

        sobj.close();
    }
}