class Logic
{
    void displayFactors(int num)
    {
        int iCnt = 0;

        System.out.println("Factors of " + num + " are:");

        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            if(num % iCnt == 0)
            {
                System.out.print(iCnt + " ");
            }
        }

        System.out.println();
    }
}

class LBAssignmnt21q3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.displayFactors(12);
    }
}