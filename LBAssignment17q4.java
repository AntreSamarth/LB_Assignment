class Logic
{
    void findMin(int a, int b)
    {
        int iMin = 0;

        if(a < b)
        {
            iMin = a;
        }
        else
        {
            iMin = b;
        }

        System.out.println("Minimum number is : " + iMin);
    }
}

class LBAssignment17q4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.findMin(20,15);
    }
}