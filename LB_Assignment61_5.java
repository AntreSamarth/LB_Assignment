import java.util.*;

class Program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first string : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter second string : ");
        String str2 = sobj.nextLine();

        if(str1.length() != str2.length())
        {
            System.out.println("Not Rotation");
        }
        else
        {
            String str3 = str1 + str1;

            if(str3.contains(str2))
            {
                System.out.println("Rotation");
            }
            else
            {
                System.out.println("Not Rotation");
            }
        }
    }
}