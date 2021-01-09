package classwork.chapter14;

import classwork.chapter8.Student;
import homework.educationCenter.model.Lesson;

public class GenericTest {


    public static void main(String[] args) {

        Student student1 = new Student();
        Lesson lesson1 = new Lesson();

        Storage<Student> studentStorage = new Storage<>();
        Storage<Lesson> lessonStorage = new Storage<>();
        Storage<Integer> numbers = new Storage<>();

        numbers.add(55);

        lessonStorage.add(lesson1);

        studentStorage.add(student1);

//        Object st = new Student();
//
//        Student student = null;
//        if (st instanceof Student) {
//            student = (Student) st;
//        }
//
//        if (student != null) {
//            System.out.println(student.getName());
//        }

    }

}
