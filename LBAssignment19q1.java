class Logic
{
    void CheckLeapYear(int Year)
    {
        if((Year % 400 == 0) || ((Year % 4 == 0) && (Year % 100 != 0)))
        {
            System.out.println("Year is Leap");
        }
        else
        {
            System.out.println("Year is not Leap");
        }
    }
}

class LBAssignment19q1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckLeapYear(2024);
    }
}