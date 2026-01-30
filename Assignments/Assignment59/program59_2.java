/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program59_2
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        String FolderName = null;
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter folder name: ");
        FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File fArr[] = fobj.listFiles();

            System.out.println("All Regular Files inside folder are:");

            for(i=0; i<fArr.length; i++)
            {
                if(fArr[i].isFile() && fArr[i].getName().endsWith(".txt"))
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
//  Enter folder name: 
//  Marvellous
//  All Regular Files inside folder are:
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
/////////////////////////////////////////////////////////////////////////////////////////////////