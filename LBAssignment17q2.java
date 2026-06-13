class Logic
{
    void CheckPallindrome(int num)
    {
        int itemp = num;
        int idigit = 0;
        int ireverse = 0;

        while(num != 0)
        {
            idigit = num % 10;
            ireverse = (ireverse * 10) + idigit;
            num = num / 10;
        }

        if(itemp == ireverse)
        {
            System.out.println("Number is Pallindrome");
        }
        else
        {
            System.out.println("Number is not Pallindrome");
        }
    }
}

class LBAssignment17q2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.CheckPallindrome(121);
    }
}