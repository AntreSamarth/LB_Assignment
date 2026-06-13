class Logic
{
    void CheckPerfect(int num)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt < num; iCnt++)
        {
            if(num % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == num)
        {
            System.out.println(num + " is a Perfect Number");
        }
        else
        {
            System.out.println(num + " is not a Perfect Number");
        }
    }
}

class LBAssignment20q3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPerfect(6);
    }
}