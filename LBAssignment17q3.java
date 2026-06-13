class Logic
{
    void findMax(int a, int b)
    {
        int iMax = 0;

        if(a > b)
        {
            iMax = a;
        }
        else
        {
            iMax = b;
        }

        System.out.println("Maximum number is : " + iMax);
    }
}

class LBAssignment17q3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.findMax(20,15);
    }
}