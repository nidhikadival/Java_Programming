/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program63_3
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String A[]) throws Exception 
    {
        Scanner sobj = new Scanner(System.in);

        int i = 0;
        int ch = 0;

        System.out.println("Enter source directory: ");
        File srcDir = new File(sobj.nextLine());

        System.out.println("Enter destination directory: ");
        File destDir = new File(sobj.nextLine());

        File files[] = srcDir.listFiles();

        for (i = 0; i < files.length; i++) 
        {
            if (files[i].isFile()) 
            {
                FileInputStream fiobj = new FileInputStream(files[i]);

                FileOutputStream foobj = new FileOutputStream(destDir + "/" + files[i].getName());

                while ((ch = fiobj.read()) != -1) {
                    foobj.write(ch);
                }

                fiobj.close();
                foobj.close();
            }
        }

        System.out.println("All files copied successfully.");
    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Output:
//  Enter source directory: 
//  Marvellous
//  Enter destination directory: 
//  MarvellousX
//  All files copied successfully.
//
/////////////////////////////////////////////////////////////////////////////////////////////////

