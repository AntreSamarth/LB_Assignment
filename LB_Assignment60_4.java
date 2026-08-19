import java.util.*;

class Program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        System.out.println("Duplicate characters : ");

        for(int i = 0; i < Arr.length; i++)
        {
            int iCount = 0;

            for(int j = 0; j < Arr.length; j++)
            {
                if(Arr[i] == Arr[j])
                {
                    iCount++;
                }
            }

            boolean bFlag = false;

            for(int k = 0; k < i; k++)
            {
                if(Arr[i] == Arr[k])
                {
                    bFlag = true;
                    break;
                }
            }

            if(iCount > 1 && bFlag == false)
            {
                System.out.print(Arr[i] + " ");
            }
        }
    }
}