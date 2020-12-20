package homework.educationCenter;

import homework.educationCenter.exception.LessonNotFoundException;
import homework.educationCenter.model.Lesson;
import homework.educationCenter.model.Student;
import homework.educationCenter.storage.LessonStorage;
import homework.educationCenter.storage.StudentStorage;

import java.util.Date;
import java.util.Scanner;

public class EducationCenter implements Commands {

    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case SEARCH_STUDENT_BY_NAME:
                    System.out.println("please input name");
                    String name = scanner.nextLine();
                    studentStorage.searchByNameOrSurname(name);
                    break;
                case SEARCH_LESSON_BY_NAME:
                    System.out.println("please input name");
                    String lessonName = scanner.nextLine();
                    lessonStorage.searchByName(lessonName);
                    break;
                case SEARCH_STUDENTS_BY_LESSON_NAME:
                    searchStudentsByLesson();
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeStudentLesson();
                    break;
                case CHANGE_STUDENT_PHONE:
                    changeStudentPhone();
                    break;
                default:
                    System.out.println("Wrong Command!!!");
            }
        }

    }

    private static void changeStudentPhone() {
        System.out.println("Please input email");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            System.out.println("Please input new phone");
            String phone = scanner.nextLine();
            student.setPhone(phone);
        } else {
            System.out.println("Student does not exists");
        }
    }

    private static void changeStudentLesson() {
        System.out.println("Please input student's email");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            System.out.println("Please choose new Lesson name");
            lessonStorage.printNames();
            String lessonName = scanner.nextLine();
            Lesson lesson = null;
            try {
                lesson = lessonStorage.getByName(lessonName);
                student.setLesson(lesson);
                System.out.println("Student lesson was changed!");
            } catch (LessonNotFoundException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Student does not exists");

        }
    }

    private static void searchStudentsByLesson() {
        System.out.println("please input lesson name");
        String lessonName = scanner.nextLine();
        Lesson byName = null;
        try {
            byName = lessonStorage.getByName(lessonName);
            studentStorage.searchByLesson(byName.getName());
        } catch (LessonNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addLesson() {
        System.out.println("Please input name,duration,price,lecturerName");
        String lessonDataStr = scanner.nextLine();
        String[] lessonData = lessonDataStr.split(",");
        try {
            String name = lessonData[0];
            try {
                lessonStorage.getByName(name);
                System.out.println("Lesson with " + name + " already exists. Please choose another name");
            } catch (LessonNotFoundException e) {
                int duration = Integer.parseInt(lessonData[1]);
                double price = Double.parseDouble(lessonData[2]);
                String lecturerName = lessonData[3];
                Lesson lesson = new Lesson(name, duration, price, lecturerName);
                lessonStorage.add(lesson);
                System.out.println("Lesson was added!");
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("invalid data");
        } catch (Exception e2) {
            System.out.println("Invalid number");
        }
    }

    private static void addStudent() {
        if (lessonStorage.isEmpty()) {
            System.out.println("Please add lesson first");
            addLesson();
        } else {
            System.out.println("Please select lesson [name] from list");
            lessonStorage.printNames();
            String lessonName = scanner.nextLine();
            Lesson lesson = null;
            try {
                lesson = lessonStorage.getByName(lessonName);
                System.out.println("Please input name,surname,email,phone");
                String studentDataStr = scanner.nextLine();
                String[] studentData = studentDataStr.split(",");
                Student student = new Student(studentData[0], studentData[1],
                        studentData[2], studentData[3], new Date(), lesson);
                studentStorage.add(student);
                System.out.println("Student was added!");
            } catch (LessonNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("invalid data");
            } catch (NumberFormatException e) {
                System.out.println("invalid number");
            }
        }
    }

}
