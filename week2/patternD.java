import java.util.Scanner;

public class patternD {
    public void grid()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int row=input.nextInt();
        for(int i=row;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}