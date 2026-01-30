/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Required packages
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program61_5
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[]) throws Exception
    {
        String FileName = null;
        File fobj = null;

        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        FileInputStream fiobj = new FileInputStream(fobj);
        FileOutputStream foobj1 = new FileOutputStream("FirstHalf.txt");
        FileOutputStream foobj2 = new FileOutputStream("SecondHalf.txt");

        long fileSize = fobj.length();
        long halfSize = fileSize / 2;
        long bytesCopied = 0;

        byte Buffer[] = new byte[1024];
        
        while((iRet = fiobj.read(Buffer)) != -1)
        {
            if(bytesCopied + iRet <= halfSize)
            {
                foobj1.write(Buffer, 0, iRet);
            }
            else
            {
                int firstPart = (int)(halfSize - bytesCopied);

                if(firstPart > 0)
                {
                    foobj1.write(Buffer, 0, firstPart);
                }

                foobj2.write(Buffer, firstPart, iRet - firstPart);
            }

            bytesCopied += iRet;
        }

        fiobj.close();
        foobj1.close();
        foobj2.close();

        System.out.println("File split successfully");
    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Testcases successfully handled by the application
//
//  Enter file name:
//  New.txt
//  File split successfully
//
/////////////////////////////////////////////////////////////////////////////////////////////////
