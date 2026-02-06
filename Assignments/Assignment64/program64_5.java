/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program64_5
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
       int iNo = 0;
       int iMask = 0;
       int iResult = 0;

       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter number: "); 
       iNo = sobj.nextInt();

       iMask = 0x80000001;

       iResult = iNo & iMask;

       if(iResult == iMask)
       {
            System.out.println("First and Last bit is ON.");
       }
       else
       {
            System.out.println("First and Last is OFF.");
       }

    }
}