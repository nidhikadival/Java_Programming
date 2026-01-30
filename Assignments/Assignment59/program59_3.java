/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program59_3
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

            System.out.println("All Folders inside this folder are:");

            for(i=0; i<fArr.length; i++)
            {
                if(fArr[i].isDirectory())
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
//  All Folders inside this folder are:
//  MarvellousX
//
//  Output:
//  Enter folder name: 
//  NewFolder
//  There is no such folder
//
/////////////////////////////////////////////////////////////////////////////////////////////////