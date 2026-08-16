import java.util.Scanner;

public class leapYear {
    public void isLeapYear()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=input.nextInt();

        if(year%400 == 0 || (year%4==0 && year%100 !=0))
        {
            System.out.println("It is a leap year");
        }
        else 
        {
            System.out.println("It is not a leap year");
        }
    }
}