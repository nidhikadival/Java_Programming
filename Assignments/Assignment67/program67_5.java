/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Required packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program67_5
{
/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : ToggleBitRange
//  Description   : Toggles all bits in the given range (start to end position)
//  Input         : int, int, int
//  Output        : int
//  Author        : Nidhi Girish Kadival
//  Date          : 06/02/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static int ToggleBitRange(int iNo, int iStart, int iEnd)
    {
        int iMask1 = (1 << iEnd) - 1;
        int iMask2 = (1 << (iStart - 1)) - 1;
        int iMask  = iMask1 ^ iMask2;

        return iNo ^ iMask;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Entry point function of the application
//
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        int iNo = 0, iStart = 0, iEnd = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        iNo = sobj.nextInt();

        System.out.println("Enter start position: ");
        iStart = sobj.nextInt();

        System.out.println("Enter end position: ");
        iEnd = sobj.nextInt();

        iResult = ToggleBitRange(iNo, iStart, iEnd);

        System.out.println("Number after toggling bits: " + iResult);
    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Output:
//  Enter number: 
//  22
//  Enter start position: 
//  2
//  Enter end position: 
//  5
//  Number after toggling bits: 8
//
//  Enter number: 
//  66
//  Enter start position: 
//  2
//  Enter end position: 
//  7
//  Number after toggling bits: 60
//
/////////////////////////////////////////////////////////////////////////////////////////////////
