package n3exercici1;

public class Student {
    private String name;
    private int age;
    private String course;
    private double mark;

    public Student(String name, int age, String course,  double mark) {
        this.name = name;
        this.age = age;
        this.course = course.toUpperCase();
        this.mark = mark;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public double getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Nom='" + name + '\'' +
                ", edat=" + age +
                ", curs='" + course + '\'' +
                ", nota=" + mark;
    }
}
