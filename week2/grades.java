import java.util.Scanner;

public class grades {
    
    public void classifyMarks()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks=input.nextInt();
        
        if(marks>=80 && marks<=100)
        {
            System.out.println("Distinction");
        }
        else if(marks>=70 && marks<80)
        {
            System.out.println("merit");
        }
        else if(marks>=60 && marks<70)
        {
            System.out.println("pass");
        }
        else if(marks>=0 && marks<60)
        {
            System.out.println("fail");
        }
        else 
        {
            System.out.println("Invalid marks");
        }
    }
}