import java.util.Scanner;

public class patternB {
    public void grid()
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int row=input.nextInt();
        if(row<0)
        {
            System.out.print("Invalid");
        }
        for(int i=1;i<=row;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}