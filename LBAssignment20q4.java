class Logic
{
    void FindLargestDigit(int num)
    {
        int iDigit = 0;
        int iLarge = 0;

        while(num != 0)
        {
            iDigit = num % 10;

            if(iDigit > iLarge)
            {
                iLarge = iDigit;
            }

            num = num / 10;
        }

        System.out.println("Largest digit is : " + iLarge);
    }
}

class LBAssignment20q4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.FindLargestDigit(83429);
    }
}