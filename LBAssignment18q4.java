class Logic
{
    void SumEvenOddDigits(int n)
    {
        int iDigit = 0;
        int iEvenSum = 0;
        int iOddSum = 0;

        while(n != 0)
        {
            iDigit = n % 10;

            if(iDigit % 2 == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit;
            }

            n = n / 10;
        }

        System.out.println("Sum of Even Digits : " + iEvenSum);
        System.out.println("Sum of Odd Digits  : " + iOddSum);
    }
}

class LBAssignment18q4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumEvenOddDigits(123456);
    }
}