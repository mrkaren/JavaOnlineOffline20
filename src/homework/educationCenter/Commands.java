package homework.educationCenter;

public interface Commands {

    String EXIT = "0";
    String ADD_STUDENT = "1";
    String ADD_LESSON = "2";
    String PRINT_STUDENTS = "3";
    String PRINT_LESSONS = "4";
    String SEARCH_STUDENT_BY_NAME = "5";
    String SEARCH_LESSON_BY_NAME = "6";
    String SEARCH_STUDENTS_BY_LESSON_NAME = "7";
    String CHANGE_STUDENT_LESSON = "8";
    String CHANGE_STUDENT_PHONE = "9";

    static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please input " + ADD_LESSON + " for ADD_LESSON");
        System.out.println("Please input " + PRINT_STUDENTS + " for PRINT_STUDENTS");
        System.out.println("Please input " + PRINT_LESSONS + " for PRINT_LESSONS");
        System.out.println("Please input " + SEARCH_STUDENT_BY_NAME + " for SEARCH_STUDENT_BY_NAME");
        System.out.println("Please input " + SEARCH_LESSON_BY_NAME + " for SEARCH_LESSON_BY_NAME");
        System.out.println("Please input " + SEARCH_STUDENTS_BY_LESSON_NAME + " for SEARCH_STUDENTS_BY_LESSON_NAME");
        System.out.println("Please input " + CHANGE_STUDENT_LESSON + " for CHANGE_STUDENT_LESSON");
        System.out.println("Please input " + CHANGE_STUDENT_PHONE + " for CHANGE_STUDENT_PHONE");
    }

}
