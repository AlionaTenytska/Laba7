public class Utils {
    public static Student getTheBestStudent(Student[] students)
    {
        Student bestStudent = students[0];
        for(int i = 0; i < students.length;i++)
        {
            if(bestStudent.averageMark() > students[i].averageMark())
            {
                bestStudent = students[i];
            }
        }
        return bestStudent;
    }

    public static String getTheBestSubject(Student[] students)
    {
        double[] summ = new double[students.length];
        int a = 0;
        for (Student student : students)
        {
            for (int i = 0; i < student.getSubjects().length; i++)
            {
                summ[i]+=student.getSubjects()[i].getMark();
            }
        }
        double average = summ[0] / students.length;
        for(int i = 0; i < summ.length; i++)
        {
            if(average < (summ[i] / students.length))
            {
                average = summ[i] / students.length;
                a = i;
            }
        }
        return "Наилучший предмет: "+ students[0].getSubjects()[a].getNameSubject()+ " со средним балом: "+average;
    }
}
