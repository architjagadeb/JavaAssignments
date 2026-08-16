import java.util.Scanner;

public class final_value {
    public void solution()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of opperations:");
        int test =input.nextInt();
        System.out.println("Enter the number:");
        int num=input.nextInt();
        input.nextLine();  //to remove the left over enter keys other wise incorrect input will be printed first
        while(test>0)
        {
            System.out.println("Enter the opperation:");
            String opp=input.nextLine();
            
            if(opp.equals("+"))//method to compare strings 
            {
                ++num;
            }
            else if(opp.equals("-"))
            {
                --num;
            }
            else 
            {
                System.out.println("incorrect input");
            }
            test--;
        }
        System.out.println("NUMBER IS :"+num);
    }
}