package classwork.chapter14;

import classwork.chapter8.Student;

import java.util.*;

public class CollectionExamples {

    public static void main(String[] args) {

//        List<String> names = new LinkedList<>();
//        names.add("poxos");
//        names.add("petros");
//        names.add("martiros");
//        names.add("poxos");
//
//        for (String name : names) {
//            System.out.println(name);
//        }

//        Set<String> names = new TreeSet<>();
//        names.add("poxos");
//        names.add("Asatur");
//        names.add("valod");
//        names.add("poxos");
//
//        for (String name : names) {
//            System.out.println(name);
//        }


        Map<String, Student> studentMap = new HashMap<>();

        studentMap.put("poxos@mail.com", new Student("poxos","poxosyan",22));
        studentMap.put("poxos1@mail.com", new Student("poxos","poxosyan",22));
        studentMap.put("poxos2@mail.com", new Student("poxos","poxosyan",22));

        Set<String> strings = studentMap.keySet();
        for (String string : strings) {
            System.out.println(studentMap.get(string));
        }




    }

}
