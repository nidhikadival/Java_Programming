import java.util.*;

class program80_2
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int N = 0;
        System.out.println("Enter size of Matrix :");
        N = sobj.nextInt();

        int Matrix[][] = new int[N][N];

        System.out.println("Enter values :");
        int i = 0, j = 0;
        for(i = 0; i < N; i++)
        {
            for(j = 0; j < N; j++)
            {
                Matrix[i][j] = sobj.nextInt();
            }
        }

        int sum = 0;
        for(j = 0; j < N; j++)
        {
            sum = sum + Matrix[0][j];
        }

        boolean flag = true;
        int rowSum = 0;
        int colSum = 0;

        for(i = 0; i < N; i++)
        {
            rowSum = 0;
            for(j = 0; j < N; j++)
            {
                rowSum = rowSum + Matrix[i][j];
            }

            if(rowSum != sum)
            {
                flag = false;
                break;
            }
        }

        for(j = 0; j < N && flag; j++)
        {
            colSum = 0;
            for(i = 0; i < N; i++)
            {
                colSum = colSum + Matrix[i][j];
            }

            if(colSum != sum)
            {
                flag = false;
                break;
            }
        }

        int diag1 = 0;
        for(i = 0; i < N; i++)
        {
            diag1 = diag1 + Matrix[i][i];
        }

        int diag2 = 0;
        for(i = 0; i < N; i++)
        {
            diag2 = diag2 + Matrix[i][N - i - 1];
        }

        if(diag1 != sum || diag2 != sum)
        {
            flag = false;
        }

        if(flag)
        {
            System.out.println("Matrix is Magic Square");
        }
        else
        {
            System.out.println("Matrix is NOT Magic Square");
        }

        sobj.close();
    }
}

/*

Enter size of Matrix :
3
Enter values :
8 1 6
3 5 7
4 9 2
Matrix is Magic Square

Enter size of Matrix :
4
Enter values :
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
Matrix is NOT Magic Square

*/