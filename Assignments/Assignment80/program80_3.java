import java.util.*;

class program80_3
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int R = 0;
        int C = 0;

        System.out.println("Enter no of rows :");
        R = sobj.nextInt();

        System.out.println("Enter no of columns :");
        C = sobj.nextInt();

        int Matrix[][] = new int[R][C];

        int i = 0, j = 0;

        System.out.println("Enter values : ");
        for(i = 0; i<R; i++)
        {
            System.out.print("Row "+(i+1)+": ");
            for(j = 0; j<C; j++)
            {
                Matrix[i][j] = sobj.nextInt();
            }
        }

        if(Matrix[0][0] == -1 || Matrix[R-1][C-1] == -1)
        {
            System.out.println("Path not possible");
            return;
        }

        Matrix[0][0] = 1;

        for(j = 1; j < C; j++)  // Right movement
        {
            if(Matrix[0][j] == 0 && Matrix[0][j-1] == 1)
            {
                Matrix[0][j] = 1;
            }
        }

        for(i = 1; i < R; i++)  // Left movement
        {
            if(Matrix[i][0] == 0 && Matrix[i-1][0] == 1)
            {
                Matrix[i][0] = 1;
            }
        }

        for(i = 1; i < R; i++)
        {
            for(j = 1; j < C; j++)
            {
                if(Matrix[i][j] == 0)
                {
                    if(Matrix[i-1][j] == 1 || Matrix[i][j-1] == 1)
                    {
                        Matrix[i][j] = 1;
                    }
                }
            }
        }

        if(Matrix[R-1][C-1] == 1)
        {
            System.out.println("Path Available");
        }
        else
        {
            System.out.println("Path Not Possible");
        }

        sobj.close();
    }
}

/*

Enter no of rows :
3
Enter no of columns :
3
Enter values : 
Row 1: 0 0 0
Row 2: -1 0 -1 
Row 3: 0 0 0
Path Available

Enter no of rows :
3
Enter no of columns :
3
Enter values : 
Row 1: 0 0 0
Row 2: -1 -1 -1
Row 3: 0 0 0
Path Not Possible

*/