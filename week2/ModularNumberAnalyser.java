import java.util.Scanner;

public class ModularNumberAnalyser {

    public int readNumber(Scanner input)
    {
        System.out.println("Enter the number:");
        int num=input.nextInt();
        return num;
    }
    public boolean isEven(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        return false;
    }
    public boolean isPositive(int num)
    {
        if(num>=0)
        {
            return true;
        }
        return false;
    }
    public int absoluteValue(int num)
    {
        if(num<0)
            return -num;
        return num;
    }
    public int countDigits(int num)
    {
        if (num==0)
            return 1;
        int count=0;
        int copy=num;
        if(num<0)
            copy=-num;
        while(copy>0)
        {
            count++;
            copy/=10;
        }
        return count;
    }
    public int sumDigits(int num)
    {
        int sum=0;
        int copy=num;
        if(num<0)
            copy=-num;
        while(copy>0)
        {
            int rem=copy%10;
            sum+=rem;
            copy/=10;
        }
        return sum;
    }
    static void printReport(int num,boolean even,boolean positive,int abs,int count,int sum)
    {
        System.out.println("The number is:"+num);
        System.out.println("Even check:"+even);
        System.out.println("Positive check:"+positive);
        System.out.println("Absolute value:"+abs);
        System.out.println("Number of digits is:"+count);
        System.out.println("The sum of the digits is:"+sum);
    }

}