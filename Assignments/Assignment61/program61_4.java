/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program61_4
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[]) throws Exception
    {
        File fobj1 = null;
        File fobj2 = null;
        File fobj3 = null;

        String InputFile1 = null;
        String InputFile2 = null;
        String OutputFile = null;

        byte Buffer[] = new byte[1024];

        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of input file: ");
        InputFile1 = sobj.nextLine();

        System.out.println("Enter the name of another input file: ");
        InputFile2 = sobj.nextLine();

        System.out.println("Enter the name of output file: ");
        OutputFile = sobj.nextLine();

        fobj1 = new File(InputFile1);
        fobj2 = new File(InputFile2);
        fobj3 = new File(OutputFile);

        if((fobj1.exists()) && (fobj2.exists()))
        {
            FileInputStream fiobj1 = new FileInputStream(fobj1);
            FileInputStream fiobj2 = new FileInputStream(fobj2);
            FileOutputStream foobj = new FileOutputStream(fobj3);

            while((iRet = fiobj1.read(Buffer))!= -1)
            {
                foobj.write(Buffer,0,iRet);
            }

            while((iRet = fiobj2.read(Buffer))!= -1)
            {
                foobj.write(Buffer,0,iRet);
            }
        
            System.out.println("Files copied successfully");

            fiobj1.close();
            fiobj2.close();
            foobj.close();
        }
}
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Enter the name of input file: 
//  Demo.txt
//  Enter the name of another input file: 
//  File.txt
//  Enter the name of output file: 
//  New.txt
//  Files copied successfully
//
/////////////////////////////////////////////////////////////////////////////////////////////////