/*
Rows -> students
Columns -> subjects
*/
import java.util.*;

class program79_1
{

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int students = 0;
        int subjects = 0;

        System.out.println("Enter no of students :");
        students = sobj.nextInt();

        System.out.println("Enter no of subjects :");
        subjects = sobj.nextInt();

        int Matrix[][] = new int[students][subjects];

        int FailStudent = 0;

        int i = 0, j = 0;
        System.out.println("Enter marks of each student :");
        for(i = 0; i<students; i++)
        {
            for(j = 0; j<subjects; j++)
            {
                Matrix[i][j] = sobj.nextInt();
            
                if((Matrix[i][j] < 0) || (Matrix[i][j] > 100))
                {
                    System.out.println("Invalid Input.");
                    return;
                }

                if(Matrix[i][j] < 35)
                {
                    FailStudent = i;
                }
            }
        }

        if((students < 0) || (subjects < 0))
        {
            System.out.println("Invalid Input.");
            return;
        }

        int StudentMarks = 0;
        int Maximum = 0;
        int Topper = 0;

        System.out.println("Student Totals : ");
        for(i = 0; i<students; i++)
        {
            StudentMarks = 0;
            for(j = 0; j<subjects; j++)
            {
                StudentMarks = StudentMarks + Matrix[i][j];
            }
            System.out.println("Student "+ (i+1)+" : "+StudentMarks);
            
            if(StudentMarks > Maximum)
            {
                Maximum = StudentMarks;
                Topper = i;
            }
        }

        System.out.println("Topper : "+(Topper+1));

        int SubjectMarks = 0;
        int Avg = 0;

        System.out.println("Subject Averages :");
        for(i = 0; i<subjects; i++)
        {
            SubjectMarks = 0;
            Avg = 0;
            for(j = 0; j<students; j++)
            {
                SubjectMarks = SubjectMarks + Matrix[j][i];
            }
            Avg = SubjectMarks/subjects;
            System.out.println("Subject "+ (i+1)+" : "+Avg);
        }

        System.out.println("Students Failed : "+(FailStudent+1));

        sobj.close();
    }
}

/*

Enter no of students :
3
Enter no of subjects :
3
Enter marks of each student :
80 70 60
90 85 88
30 40 50
Student Totals : 
Student 1 : 210
Student 2 : 263
Student 3 : 120
Topper : 2
Subject Averages :
Subject 1 : 66
Subject 2 : 65
Subject 3 : 66
Students Failed : 3

*/