package isp.lab6.exercise1;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static <students> void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students s1 = (students) new Student("123", "Mary", "Jane", new HashMap<>());
        ((Student) s1).addGrade(Subject.MATHEMATICS, 90);
        ((Student) s1).addGrade(Subject.ENGLISH, 80);
        ((Student) s1).addGrade(Subject.MATHEMATICS, 75);
        ((Student) s1).addGrade(Subject.BIOLOGY, 50);
        ((Student) s1).addGrade(Subject.PHYSICS, 80);
        ((Student) s1).addGrade(Subject.SPORT, 100);
        ((Student) s1).addGrade(Subject.GEOGRAPHY, 79);
        ((Student) s1).addGrade(Subject.HISTORY, 97);
        ((Student) s1).addGrade(Subject.MATHEMATICS, 93);
        ((Student) s1).addGrade(Subject.LITERATURE, 66);

        students s2 = (students) new Student("124", "Bob", "Mark", new HashMap<>());
        ((Student) s2).addGrade(Subject.BIOLOGY, 85);
        ((Student) s2).addGrade(Subject.MATHEMATICS, 58);
        ((Student) s2).addGrade(Subject.ENGLISH, 83);
        ((Student) s2).addGrade(Subject.HISTORY, 70);
        ((Student) s2).addGrade(Subject.LITERATURE, 90);
        ((Student) s2).addGrade(Subject.HISTORY, 79);
        ((Student) s2).addGrade(Subject.PHYSICS, 80);
        ((Student) s2).addGrade(Subject.SPORT, 90);
        ((Student) s2).addGrade(Subject.GEOGRAPHY, 90);


        students s3 = (students) new Student("122", "Charlie", "Bob", new HashMap<>());
        ((Student) s3).addGrade(Subject.HISTORY, 95);
        ((Student) s3).addGrade(Subject.ENGLISH, 95);
        ((Student) s3).addGrade(Subject.MATHEMATICS, 100);
        ((Student) s3).addGrade(Subject.GEOGRAPHY, 70);
        ((Student) s3).addGrade(Subject.LITERATURE, 40);
        ((Student) s3).addGrade(Subject.PHYSICS, 82);
        ((Student) s3).addGrade(Subject.SPORT, 95);

        Student_Repo repo = new Student_Repo();
        System.out.println("the students are: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}