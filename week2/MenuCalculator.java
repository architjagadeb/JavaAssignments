import java.util.Scanner;

public class MenuCalculator {
    public void calculator()
    {
        int choice,num1, num2 ;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("Enter 1-- to add , 2-- subtract , 3-- multiply , 4-- divide  0-- Exit");
            choice =input.nextInt();
            
            if(choice!=0)
            {
                num1 = input.nextInt();
                System.out.println("Enter the 1st number:");
                num2 = input.nextInt();
                System.out.println("Enter the 2nd number:");
                switch(choice)
                {
                    case 1 : System.out.println("The sum of the numbers is :"+(num1+num2));
                             break;
                    case 2 : if(num1>num2)
                        {
                            System.out.println("The difference of the numbers is :"+(num1-num2));
                        }
                        else 
                        {
                            System.out.println("The difference of the numbers is :"+(num2-num1));
                        }
                        break;
                    case 3 : System.out.println("The product of the numbers is:"+(num1* num2));
                            break;
                    case 4: if(num2==0)
                    {
                        System.out.print("Division not possible");
                    }
                    else 
                    {
                        System.out.println("The quitent is:"+((double)num1/num2));
                    }
                    break;
                    default : System.out.println("option not possible");
                }
            }
            else 
            {
                System.out.println("EXIT");
            }
        }
        while(choice!=0);
    }
}