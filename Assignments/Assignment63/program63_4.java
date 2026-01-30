/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program63_4
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;

        System.out.println("Enter directory name: ");
        File dir = new File(sobj.nextLine());

        FileOutputStream foobj = new FileOutputStream("Combined.bin");

        File files[] = dir.listFiles();

        for (int i = 0; i < files.length; i++) 
        {
            if (files[i].isFile())
            {
                FileInputStream fiobj = new FileInputStream(files[i]);

                while ((iRet = fiobj.read()) != -1) 
                {
                    foobj.write(iRet);
                }

                fiobj.close();
            }
        }

        foobj.close();
        System.out.println("All files combined into Combined.bin");
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Output:
//  Enter directory name: Marvellous
//  All files combined into Combined.bin
//
/////////////////////////////////////////////////////////////////////////////////////////////////