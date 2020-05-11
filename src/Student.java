public class Student {
    private int id;
    private int nextId;
    private String name;
    private String surname;
    private String group;
    private Subject[] subjects;
    private double averageMark;

    Student(int id,int nextId,String name,String surname,String group, Subject[] subject1){
        this.id=id;
        this.nextId=nextId;
        this.group=group;
        this.name=name;
        this.surname=surname;
        this.group=group;
        this.subjects = new Subject[subject1.length];
        for(int i = 0; i < subject1.length; i++)
        {
            subjects[i] = new Subject(subject1[i]);
        }
    }

    public int getId(){
        return  id;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getNextId(){
        return  nextId;
    }

    public void setNextId(int nextId){
        this.nextId=nextId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public String getGroup (){
        return group;
    }

    public void setGroup(String group){
        this.group=group;
    }

    public Subject[] getSubjects()
    {
        return subjects;
    }

    public double averageMark() {
        double sum = 0;
        for (Subject subject : subjects)
        {
            sum+=subject.getMark();
        }
        averageMark=sum/5;
        return averageMark;
    }

    public static class Subject {

        private String nameSubject;
        private Float mark;
        private boolean passed;

        Subject(Subject subject){}

        Subject(String nameSubject){
            this.nameSubject=nameSubject;
        }

        public String getNameSubject(){
            return nameSubject;
        }

        public float getMark(){
            int m;
            m= 2 + (int)(Math.random() * 4);
            mark=(float)m;
            return mark;
        }

        public boolean getPassed(){
            if(this.mark <= 2){
                return false;
            }
            return true;
        }
    }
}
