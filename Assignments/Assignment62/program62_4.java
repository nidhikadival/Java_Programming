/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program62_4
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[]) throws Exception
    {
        String FileName = null;
        int count = 0;
        int iRet = 0;
        int n = 0;
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name: ");
        FileName = sobj.nextLine();

        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        fiobj = new FileInputStream(FileName);
        foobj = new FileOutputStream(FileName + "_backup");

        while ((iRet = fiobj.read()) != -1)
        {
            foobj.write(iRet);
        }

        System.out.println("Backup created sucessfully");
        fiobj.close();
        foobj.close();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Output:
//  Enter file name: 
//  Demo.txt
//  Backup created sucessfully 
//
/////////////////////////////////////////////////////////////////////////////////////////////////