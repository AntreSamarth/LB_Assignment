class Logic
{
    void CheckPrime(int num)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            if(num % iCnt == 0)
            {
                iCount++;
            }
        }

        if(iCount == 2)
        {
            System.out.println(num + " is a Prime Number");
        }
        else
        {
            System.out.println(num + " is not a Prime Number");
        }
    }
}

public class LBAssignment18q1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPrime(11);
    }
}