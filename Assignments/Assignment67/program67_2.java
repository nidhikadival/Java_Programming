/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Required packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program67_2
{
/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : CommonBits
//  Description   : Counts number of common ON bits in two numbers
//  Input         : int, int
//  Output        : int
//  Author        : Nidhi Girish Kadival
//  Date          : 06/02/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static int CommonBits(int iNo1, int iNo2)
    {
        int iCommon = 0;
        int iCnt = 0;

        iCommon = iNo1 & iNo2;

        while(iCommon != 0)
        {
            iCommon = iCommon & (iCommon - 1);
            iCnt++;
        }

        return iCnt;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Entry point function of the application
//
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        int iNo1 = 0;
        int iNo2 = 0;
        int iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        iNo2 = sobj.nextInt();

        iResult = CommonBits(iNo1, iNo2);

        System.out.println("Number of common ON bits : " + iResult);
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Output:
//
//  Enter first number:
//  10
//  Enter second number:
//  12
//  Number of common ON bits : 1
//
//  Enter first number:
//  15
//  Enter second number:
//  7
//  Number of common ON bits : 3
//
/////////////////////////////////////////////////////////////////////////////////////////////////
