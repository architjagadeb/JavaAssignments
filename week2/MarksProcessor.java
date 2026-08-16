import java.util.Scanner ;

public class MarksProcessor {
    int marks =0;
    int sum=0;
    int valid=0;
    int max=0;
    int pass=0;
    int fail=0;
    double average=0.0;
    public boolean IsValid(int marks)
    {
        if(marks>=0 && marks <=100)
        {
            return true ;
        }
        return false;
    }
    public void operations()
    {
        Scanner input=new Scanner(System.in);
        /*int marks =0;
        int sum=0;
        int valid=0;
        int max=0;
        int pass=0;
        int fail=0;*/
        while(marks>=0)
        {
            System.out.print("enter the marks:");
            marks=input.nextInt(); 
            boolean check=IsValid(marks);
            if(check)
            {
                sum+=marks;
                if(marks <=100)
                {
                    valid+=1;
                }
                if(marks>max)
                {
                    max=marks;
                }
                if(marks>=50)
                {
                    pass+=1;
                }
                if(marks<50)
                {
                    fail+=1;
                }
                }   
        }
        average=sum/valid;
        
    }
    public void Result()
    {
        System.out.println("sum:"+sum);
        System.out.println("valid marks:"+valid);
        System.out.println("average"+average);
        System.out.println("Heighest marks:"+max);
        System.out.println("passed subjects:"+pass);
        System.out.println("Failed subjects:"+fail);
    }

}