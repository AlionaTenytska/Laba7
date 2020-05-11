
import java.util.ArrayList;
import java.util.List;

public class Main {

    public enum Subjects {
        JAVA,
        ТППС,
        WEB,
        C,
        ММДО;
    }

    public static void main(String[] args) {

        P p = new P();

        Student[] students = new Student[5];

        Subjects[] subjects = Subjects.values();
        p.print("Список предметов:\n");
        for (Subjects s : subjects) {
            System.out.println(s);
        }
        Student.Subject[] name_subj = new Student.Subject[subjects.length];
        List<String> list_subj = new ArrayList<String>();

        for (Subjects s : subjects)
        {
            list_subj.add(s.toString());
        }

        for (int i = 0; i < subjects.length; i++) {
            name_subj[i] = new Student.Subject(list_subj.get(i));
        }

        students[0] = new Student(1, 2, "Алена", "Tеницкая", "КБ-71", name_subj);
        students[1] = new Student(2, 3, "Игорь", "Новиков", "КБ-71",name_subj);
        students[2] = new Student(3, 4, "Дмитрий", "Смирнов", "КБ-71",name_subj);
        students[3] = new Student(4, 5, "Елена", "Октябрская", "КБ-71",name_subj);
        students[4] = new Student(5, 6, "Мария", "Остапенко", "КБ-71",name_subj);

        for(Student student : students){

            p.println("Студент номер - "+student.getId());
            p.println("Имя: "+student.getName());
            p.println("Фамилия: "+student.getSurname());
            p.println("Группа: "+student.getGroup());
            for(Student.Subject subject: name_subj){
                p.println("Название предмета - "+subject.getNameSubject());
                p.println("Оценка - "+subject.getMark());
                p.println("Статус ( сдан или нет)  - "+subject.getPassed());
            }
            p.print("*****************************************\n");

        }

        for(Student student : students){
            p.println("Средняя оценка студента "+student.getId() );
            p.println("Средняя оценка:"+student.averageMark());
        }

        Student bestStudent = Utils.getTheBestStudent(students);

        p.println("Наилучший студент: " + bestStudent.getName() +" "+ bestStudent.getSurname() + " со средним балом - " +bestStudent.averageMark());

        String bestSubject = Utils.getTheBestSubject(students);

        p.println(bestSubject);

    }
}
