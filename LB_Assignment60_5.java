import java.util.*;

class Program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            int iCount = 0;
            boolean bFlag = false;

            for(int j = 0; j < i; j++)
            {
                if(Arr[i] == Arr[j])
                {
                    bFlag = true;
                    break;
                }
            }

            if(bFlag == true)
            {
                continue;
            }

            for(int j = 0; j < Arr.length; j++)
            {
                if(Arr[i] == Arr[j])
                {
                    iCount++;
                }
            }

            System.out.println(Arr[i] + " -> " + iCount);
        }
    }
}