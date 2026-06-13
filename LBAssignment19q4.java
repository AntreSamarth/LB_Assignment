class Logic
{
    void PrintDigits(int num)
    {
        int iDigit = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            System.out.println(iDigit);

            num = num / 10;
        }
    }
}

class LBAssignment19q4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj. PrintDigits(9876);
    }
}