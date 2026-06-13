class Logic
{
    void productofDigits(int num)
    {
        int iDigit = 0;
        int ipro = 1;

        while(num !=0)
        {
            iDigit = num % 10;
            ipro = ipro * iDigit;
            num = num/10;
        }
        System.out.println("Product of digits: "+ipro);
    }
}

class LBAssignment21q1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.productofDigits(987);
    }
}