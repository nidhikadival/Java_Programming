/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program60_4
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        String FolderName = null;
        String Extension = null;
        int i = 0;
        int Size = 0;
        String SmallestFile = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter folder name: ");
        FolderName = sobj.nextLine();

        System.out.println("Enter extension: ");
        Extension = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File fArr[] = fobj.listFiles();
            Size = (int) fArr[0].length();

            for(i=0; i<fArr.length; i++)
            {
                if((fArr[i].isFile()) && (!fArr[i].isHidden()) && (fArr[i].getName().endsWith(Extension)))
                {
                    System.out.println(fArr[i].getName());
                }
            }
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Output:
//  Enter folder name: 
//  Marvellous
//  Enter extension: 
//  .txt
//  C.txt
//  B.txt
//  A.txt
//  D.txt
//
//  Output:
//  Enter folder name: 
//  NewFolder
//  There is no such folder
//
/////////////////////////////////////////////////////////////////////////////////////////////////s