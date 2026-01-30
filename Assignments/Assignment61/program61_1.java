/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program61_1 
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[]) throws Exception
    {
        File fobjsrc = null;
        File fobjdest = null;

        String FileNameSrc = null;
        String FileNameDest = null;

        FileReader frobj = null;

        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of source file: ");
        FileNameSrc = sobj.nextLine();

        System.out.println("Enter the name of destination file: ");
        FileNameDest = sobj.nextLine();

        fobjsrc = new File(FileNameSrc);

        if(fobjsrc.exists())
        {
            fobjdest = new File(FileNameDest);

            fobjdest.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobjsrc);
            FileOutputStream foobj = new FileOutputStream(fobjdest);

            while((iRet = fiobj.read()) != -1)
            {
                foobj.write(iRet);
            }
            System.out.println("File copy succesful");

            fiobj.close();
            foobj.close();
        }
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
//  File copy succesful
//
/////////////////////////////////////////////////////////////////////////////////////////////////s