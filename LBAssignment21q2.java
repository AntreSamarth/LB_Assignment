class Logic
{
    void CountEvenOddRange(int n)
    {
        int iCnt = 0;
        int even = 0;
        int odd = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}

class LBAssignment21q2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.CountEvenOddRange(50);
    }
}