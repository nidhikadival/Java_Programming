import java.util.*;

class program74_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Marks[] = new int[5];
        int i = 0;

        boolean Pass = true;
        boolean Invalid = false;

        int iSum = 0;
        float Average = 0.0f;

        System.out.println("Enter marks : "); 
        for(i = 0; i < Marks.length; i++)
        {
            Marks[i] = sobj.nextInt();

            if(Marks[i] < 0 || Marks[i] > 100)
            {
                Invalid = true;
            }

            if(Marks[i] < 35)
            {
                Pass = false;   // Student is Failed
            }

            iSum = iSum + Marks[i];
        }

        if(Invalid == true)
        {
            System.out.println("Invalid Marks."); // Marks should be less than 100
            return;
        }

        if(Pass == false)
        {
            System.out.println("Result : Fail");
            return;
        }

        Average = ((float) iSum / (float) 5);

        System.out.println("Average Marks : "+Average);

        if(Average >= 75.0f)
        {
            System.out.println("Final Result : Distinction");
            return;
        }
        else if(Average >= 60.0f)
        {
            System.out.println("Final Result : First Class");
            return;
        }
        else if(Average >= 50.0f)
        {
            System.out.println("Final Result : Second Class");
            return;
        }
        else if(Average < 50.0f)
        {
            System.out.println("Final Result : Pass");
            return;
        }
        
        sobj.close();
    } 
}

/*

Enter marks : 
70
80
88
65
50
Average Marks : 70.6
Final Result : First Class

Enter marks : 
80
40
30
70
20
Result : Fail
*/