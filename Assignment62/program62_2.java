/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program62_2
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

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name: ");
        FileName = sobj.nextLine();

        System.out.println("Enter no of bytes you want to read: ");
        n = sobj.nextInt();

        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        fiobj = new FileInputStream(FileName);
        foobj = new FileOutputStream("New.txt");

        while ((iRet = fiobj.read()) != -1 && count < n) 
        {
            foobj.write(iRet);
            count++;
        }

        System.out.println(n+" bytes written sucessfully");
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
//  13
//  13 bytes written sucessfully
//
/////////////////////////////////////////////////////////////////////////////////////////////////