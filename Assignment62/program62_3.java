/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program62_3
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

        System.out.println("Enter no of bytes you want to read: ");
        n = sobj.nextInt();

        File fobj = new File(FileName);

        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        fiobj = new FileInputStream(fobj);
        foobj = new FileOutputStream("New.txt");

        fiobj.skip(fobj.length() - n);

        for(i = 0; i < n; i++)
        {
            iRet = fiobj.read();
            foobj.write(iRet);
        }

        System.out.println("Last "+n+" bytes written sucessfully");
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
//  Enter no of bytes you want to read: 
//  8
//  Last 8 bytes written sucessfull
//
/////////////////////////////////////////////////////////////////////////////////////////////////