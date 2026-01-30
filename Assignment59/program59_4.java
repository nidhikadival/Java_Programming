/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program59_4
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
        int FolderCount = 0;
        int FileCount = 0;

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
                if(fArr[i].isFile())
                {
                    FileCount++;
                }
                else
                {
                    FolderCount++;
                }
            }
            System.out.println("No of Folders inside this folder are: "+FolderCount);
            System.out.println("No of Files inside this folder are: "+FileCount);
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
//  No of Folders inside this folder are: 1
//  No of Files inside this folder are: 5
//
//  Output:
//  Enter folder name: 
//  NewFolder
//  There is no such folder
//
/////////////////////////////////////////////////////////////////////////////////////////////////