class Logic
{
    void CountFactors(int num)
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

        System.out.println("Total factors are : " + iCount);
    }
}

class LBAssignment21q4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CountFactors(12);
    }
}