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
//  Function Name : AddColumn
//  Description :   Returns the maximum number present in both diagnols
//  Input :         -
//  Output :        int
//  Author :        Nidhi Girish Kadival
//  Date :          22/02/2026
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public void AddColumn()
    {
        int i = 0, j = 0;
        int iColSum = 0;

        for(i=0; i<iRow; i++)
        {
            iColSum = 0;
            for(j=0; j<iCol; j++)
            {
                iColSum = iColSum + Arr[j][i];
            }
            System.out.print(iColSum+"\t");
        }
    }

}

class program72_4
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

        Matrix mobj = new Matrix(3,3);

        mobj.Accept();

        System.out.println("Summation of all columns :");
        mobj.AddColumn();
        System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Output :
//  Enter the elements of Matrix : 
//  Enter the elements of Row 1
//  3   2   5   9
//  Enter the elements of Row 2
//  4   3   2   2
//  Enter the elements of Row 3
//  8   4   1   5
//  Enter the elements of Row 4
//  3   9   7   5
//  Summation of all columns :
//  18	18	15	25
//
//  Output :
//  Enter the elements of Matrix : 
//  Enter the elements of Row 1
//  1   1   1
//  Enter the elements of Row 2
//  2   2   2
//  Enter the elements of Row 3
//  3   3   3   
//  Summation of all columns :
//  6	6	6
//
/////////////////////////////////////////////////////////////////////////////////////////////////
