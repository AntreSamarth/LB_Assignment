class Logic
{
    void CalculatePower(int base, int exp)
    {
        int iCnt = 0;
        int iResult = 1;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iResult = iResult * base;
        }

        System.out.println("Power is : " + iResult);
    }
}

class LBAssignment19q5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CalculatePower(2, 5);
    }
}