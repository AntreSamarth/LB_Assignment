import java.util.*;

class Program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        str = str.toLowerCase();

        boolean bFlag = true;

        for(char ch = 'a'; ch <= 'z'; ch++)
        {
            if(str.indexOf(ch) == -1)
            {
                bFlag = false;
                break;
            }
        }

        if(bFlag == true)
        {
            System.out.println("Pangram");
        }
        else
        {
            System.out.println("Not Pangram");
        }
    }
}