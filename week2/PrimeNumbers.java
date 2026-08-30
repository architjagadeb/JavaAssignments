import java.util.Scanner;
public class PrimeNumbers {
    public void IsPrime()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        int flag =1;
        if(num<2)
            flag=0;
        else if(num==2)
            flag=1;
        else
        {
            for(int i=2;i<=num/2;i++)
            {
                if(num%i==0)
                {
                    flag=0;
                    break;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("It is prime ");
        }
        else if(num<2)
        {
            System.out.println("It is  not prime ");
        }
        else 
        {
            System.out.println("It is composite");
        }
            
    }
}