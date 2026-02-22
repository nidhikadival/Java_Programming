/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Function Name : Matrix Constructor
//  Description :   Creates instance of the 2D array
//  Input :         int int
//  Author :        Nidhi Girish Kadival
//  Date :          22/02/2026
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public Matrix(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;
        Arr = new int[iRow][iCol];
    }

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Function Name : Accept
//  Description :   Accepts the values of the elements of the array
//  Input :         -
//  Output :        void
//  Author :        Nidhi Girish Kadival
//  Date :          22/02/2026
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0, j = 0;

        System.out.println("Enter the elements of Matrix : ");
        
        for(i=0; i<iRow ;i++)
        {
            System.out.println("Enter the elements of Row "+(i+1));
            for(j=0; j<iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Function Name : Display
//  Description :   Prints the entire array in rows and columns
//  Input :         -
//  Output :        void
//  Author :        Nidhi Girish Kadival
//  Date :          22/02/2026
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public void Display()
    {
        int i = 0, j = 0;

        System.out.println("Elements of Matrix are : ");
        
        for(i=0; i<iRow ;i++)
        {
            for(j=0; j<iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Function Name : CheckSparse
//  Description :   Returns true if matrix is an Sparse matrix and false if not
//  Input :         -
//  Output :        boolean
//  Author :        Nidhi Girish Kadival
//  Date :          22/02/2026
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean CheckSparse()
    {
        int i = 0, j = 0;
        int iCount = 0;

        for(i=0; i<iRow ;i++)
        {
            for(j=0; j<iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    iCount++;
                }
            }
        }

        if(iCount > ((iRow*iCol)/2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

class program73_5
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        int iRet = 0;
        int iNo = 0;

        boolean bRet = false;

        Matrix mobj = new Matrix(4,4);

        mobj.Accept();

        bRet = mobj.CheckSparse();

        if(bRet == true)
        {
            System.out.println("It is an Sparse Matrix");
        }
        else
        {
            System.out.println("It is not an Sparse Matrix");
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Output :
//  Enter the elements of Matrix : 
//  Enter the elements of Row 1
//  1   2   3   4
//  Enter the elements of Row 2
//  5   6   7   8
//  Enter the elements of Row 3
//  0   0   0   0
//  Enter the elements of Row 4
//  9   8   7   6   
//  It is not an Sparse Matrix
//
//  Output :
//  Enter the elements of Matrix : 
//  Enter the elements of Row 1
//  0   0   0   0
//  Enter the elements of Row 2
//  0   1   1   0
//  Enter the elements of Row 3
//  0   0   0   0
//  Enter the elements of Row 4
//  0   0   0   1
//  It is an Sparse Matrix
//
/////////////////////////////////////////////////////////////////////////////////////////////////
