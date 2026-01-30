/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program59_5
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

            System.out.println("Name\t\tAbsolute Path");

            for(i=0; i<fArr.length; i++)
            {
                if(fArr[i].getName().endsWith(".txt"))
                {
                    System.out.println(fArr[i].getName()+"\t\t"+fArr[i].getAbsolutePath());
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
//  Name		    Absolute Path
//  C.txt		    /Users/nidhikadival/Desktop/LB/Assignments/Assignment59/Marvellous/C.txt
//  B.txt		    /Users/nidhikadival/Desktop/LB/Assignments/Assignment59/Marvellous/B.txt
//  A.txt		    /Users/nidhikadival/Desktop/LB/Assignments/Assignment59/Marvellous/A.txt
//  D.txt		    /Users/nidhikadival/Desktop/LB/Assignments/Assignment59/Marvellous/D.txt
//  MarvellousX	    /Users/nidhikadival/Desktop/LB/Assignments/Assignment59/Marvellous/MarvellousX
//
//  Output:
//  Enter folder name: 
//  NewFolder
//  There is no such folder
//
/////////////////////////////////////////////////////////////////////////////////////////////////