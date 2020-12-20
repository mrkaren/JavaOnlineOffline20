package homework.educationCenter.storage;

import homework.educationCenter.exception.LessonNotFoundException;
import homework.educationCenter.model.Lesson;

public class LessonStorage {

    private Lesson[] lessons = new Lesson[10];
    private int size = 0;

    public void add(Lesson lesson) {
        if (size == lessons.length) {
            extend();
        }
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, tmp, 0, lessons.length);
        lessons = tmp;
    }

    public Lesson getByName(String name) throws LessonNotFoundException {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equalsIgnoreCase(name)) {
                return lessons[i];
            }
        }
        throw new LessonNotFoundException("Lesson with " + name + " does not exists");
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }
    }

    public void printNames() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i].getName());
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void searchByName(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().contains(lessonName)) {
                System.out.println(lessons[i]);
            }
        }
    }
}
