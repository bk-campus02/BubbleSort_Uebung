package org.campus02.arrays;

import java.util.Arrays;

public class StudentDemo {

    public static void main(String[] args) {

        int[] numbers = {6, 23, 55, 341, 9, 43};

        String[] strings = {"Test", "String", "Array", "von", "Benjamin" };

        Student[] studenten = {
                new Student(2145435, "Max", "Mustermann"),
                new Student(7465983, "Ingo", "Dieter"),
                new Student(7121361, "Sepp", "Friedrich"),
        };


        System.out.println();

        System.out.println("IntArray vor Sortierung: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Die Sortierung vom IntArray ist: " + Arrays.toString(numbers));

        System.out.println();

        System.out.println("StringArray vor Sortierung: " + Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println("Die Sortierung vom StringArray ist: " + Arrays.toString(strings));

        System.out.println();

        System.out.println("StudentenArray vor Sortierung: " + Arrays.toString(studenten));
        Arrays.sort(studenten);
        System.out.println("Die Sortierung vom StudentArray ist: " + Arrays.toString(studenten));

    }

}
