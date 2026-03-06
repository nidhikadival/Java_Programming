import java.util.*;

class program78_3
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Steps[] = new int[7];

        int Goal = 0;

        int i = 0;

        System.out.println("Enter your Goal :");
        Goal = sobj.nextInt();

        System.out.println("Enter steps of each day :");
        for(i = 0; i < 7; i++)
        {
            Steps[i] = sobj.nextInt();
        }

        int Max = 0;
        Max = Steps[0];

        for(i = 0; i < 7; i++)
        {
            if(Steps[i] > Max)
            {
                Max = Steps[i];
            }
        }

        int sum = 0;
        int Count = 0;

        for(i = 0; i < 7; i++)
        {
            sum = sum + Steps[i];
            Count++;

            if(sum >= Goal)
            {
                break;
            }
        }

        if(sum >= Goal)
        {
            System.out.println("Goal Achived in days : " + Count);
        }
        else
        {
            System.out.println("Goal not reached");
        }

        System.out.println("Maximum steps in week : " + Max);

        
        sobj.close();
    }
}

/*

Enter your Goal :
50
Enter steps of each day :
12
30
24
56
29
45
30
Goal Achived in days :  3
Maximum steps in week : 56

*/