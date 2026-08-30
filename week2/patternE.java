import java.util.Scanner;

public class patternE {
    public void grid()
    {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int row =input.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}