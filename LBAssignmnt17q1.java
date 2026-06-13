class Logic
{
    void SumOfDigits(int num)
    {
        int digit = 0;
        int sum = 0;

        while(num != 0)
        {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Sum of digits is : " + sum);
    }
}

class LBAssignmnt17q1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.SumOfDigits(1234);
    }
}