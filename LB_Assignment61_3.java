import java.util.*;

class Program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        StringBuffer sb = new StringBuffer("");

        for(int i = 0; i < Arr.length; i++)
        {
            boolean bFlag = false;

            for(int j = 0; j < i; j++)
            {
                if(Arr[i] == Arr[j])
                {
                    bFlag = true;
                    break;
                }
            }

            if(bFlag == false)
            {
                sb.append(Arr[i]);
            }
        }

        System.out.println(sb);
    }
}