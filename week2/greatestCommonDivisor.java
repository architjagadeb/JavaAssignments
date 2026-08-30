public class greatestCommonDivisor {
    public int gcd(int num1, int num2)
    {
        int gcd=1;
        int copy;
        if(num1>num2)
        {
            copy=num1;
        }
        else 
        {
            copy=num2;
        }
        for(int i=2;i<copy/2;i++ )
        {
            if(num1%i==0 && num2%i==0)
            {
                gcd=i;
            }
        }
        return gcd;
    }
}