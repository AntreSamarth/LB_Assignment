import java.util.*;

class Program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        String strRev = "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            strRev = strRev + str.charAt(i);
        }

        if(str.equals(strRev))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not Palindrome String");
        }
    }
}