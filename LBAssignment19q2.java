class Logic
{
    void DisplayGrade(int Marks)
    {
        if(Marks < 50)
        {
            System.out.println("D Grade");
        }
        else if(Marks < 70)
        {
            System.out.println("C Grade");
        }
        else if(Marks < 80)
        {
            System.out.println("B Grade");
        }
        else if(Marks < 90)
        {
            System.out.println("A Grade");
        }
        else
        {
            System.out.println("A+ Grade");
        }
    }
}

class LBAssignment19q2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.DisplayGrade(95);
    }
}