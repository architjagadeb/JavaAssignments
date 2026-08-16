import java.util.Scanner;

public class patternA {
    public void grid()
    {
        Scanner input =new Scanner(System.in);
        System.out.println("it is an nxn grid     Enter the number of row:");
        int row=input.nextInt();
        if(row<0)
        {
            System.out.print("invalid");
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}