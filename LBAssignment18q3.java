class Logic
{
    void printEvenNumbers(int n)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
            System.out.println(iCnt);
            }
        }
    }
}

class LBAssignment18q3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printEvenNumbers(20);
    }
}