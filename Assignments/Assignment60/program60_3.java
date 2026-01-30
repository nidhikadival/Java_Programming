/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program60_3
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
        int Size = 0;
        String SmallestFile = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter folder name: ");
        FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File fArr[] = fobj.listFiles();
            Size = (int) fArr[0].length();

            for(i=0; i<fArr.length; i++)
            {
                if(fArr[i].isFile() && !fArr[i].isHidden())
                {
                    if(fArr[i].length() < Size)
                    {
                        Size = (int) fArr[i].length();
                        SmallestFile = fArr[i].getName();
                    }
                }
            }
            System.out.println("Smallest File is : "+SmallestFile);
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
//  Smallest File is : A.txt
//
//  Output:
//  Enter folder name: 
//  NewFolder
//  There is no such folder
//
/////////////////////////////////////////////////////////////////////////////////////////////////s