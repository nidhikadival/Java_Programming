/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Required packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program67_4
{
/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : CheckBit
//  Description   : Checks whether bit at first or second position is ON
//  Input         : int, int, int
//  Output        : boolean
//  Author        : Nidhi Girish Kadival
//  Date          : 06/02/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static boolean CheckBit(int iNo, int iPos1, int iPos2)
    {
        int iMask1 = 0;
        int iMask2 = 0;
        int iMask = 0;
        int iResult = 0;

        iMask1 = 1 << (iPos1 - 1);
        iMask2 = 1 << (iPos2 - 1);

        iMask = iMask1 | iMask2;

        iResult = iNo & iMask;

        if(iResult != 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Entry point function of the application
//
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        int iNo = 0;
        int iPos1 = 0;
        int iPos2 = 0;
        boolean bResult = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        iNo = sobj.nextInt();

        System.out.println("Enter first position: ");
        iPos1 = sobj.nextInt();

        System.out.println("Enter second position: ");
        iPos2 = sobj.nextInt();

        bResult = CheckBit(iNo, iPos1, iPos2);

        if(bResult == true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Output:
//  Enter number:
//  10
//  Enter first position:
//  3
//  Enter second position:
//  7
//  TRUE
//
//  Enter number:
//  64
//  Enter first position:
//  2
//  Enter second position:
//  3
//  FALSE
//
/////////////////////////////////////////////////////////////////////////////////////////////////
