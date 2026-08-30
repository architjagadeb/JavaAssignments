import java.util.Scanner ;

public class NumberReversal {
    public void reversed()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        int rev=0;
        if(num<0)
        {
            System.out.println("reversal not possible");
        }
        else 
        {
            while(num>0)
            {
                rev=(rev*10)+(num%10);
                num=num/10;
            }
            System.out.println("The reverse of the number is :"+rev);
        }
    }
}