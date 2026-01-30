/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program63_1
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[]) throws Exception
    {
        String FileNameSrc = null;
        String FileNameDest = null;

        FileReader frobj = null;

        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of source file: ");
        FileNameSrc = sobj.nextLine();

        System.out.println("Enter the name of destination file: ");
        FileNameDest = sobj.nextLine();


        FileInputStream fiobj = new FileInputStream(FileNameSrc);
        BufferedInputStream bin = new BufferedInputStream(fiobj);

        FileOutputStream foobj = new FileOutputStream(FileNameDest);
        BufferedOutputStream bout = new BufferedOutputStream(foobj);

        while ((iRet = bin.read()) != -1)
        {
            bout.write(iRet);
        }

        System.out.println("File copied successfully");

        bin.close();
        bout.close();
}
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Output:
//  Enter the name of source file: 
//  Demo.txt
//  Enter the name of destination file: 
//  New.txt
//  File copied succesfully
//
/////////////////////////////////////////////////////////////////////////////////////////////////s