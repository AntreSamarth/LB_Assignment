class Logic
{
    void CheckDivisible(int num)
    {
        if((num % 5 == 0) && (num % 11 == 0))
        {
            System.out.println("Number is Divisible by 5 and 11");
        }
        else
        {
            System.out.println("Number is Not Divisible by 5 and 11");
        }
    }
}

class LBAssignment19q3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckDivisible(55);
    }
}