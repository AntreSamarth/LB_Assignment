class Logic
{
    void SumEvenNumbers(int n)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        System.out.println("Sum of Even Numbers : " + iSum);
    }
}

class LBAssignment20q1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumEvenNumbers(10);
    }
}