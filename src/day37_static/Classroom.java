package day37_static;

import java.util.Arrays;

import static day37_static.CydeoStudent.instructors;

public class Classroom {
    public static void main(String[] args) {

        CydeoStudent.schoolInfo();

        CydeoStudent student1 = new CydeoStudent("Mayila", "Toronto", 2);
        System.out.println(student1);
        System.out.println("Instructors: " + Arrays.toString(instructors)); //not recommended, just the class name to access
        System.out.println(Arrays.toString(instructors));
        System.out.println(instructors[1].charAt(instructors[1].length()-1));

        CydeoStudent student2 = new CydeoStudent("Aili", "Ottawa",1);


    }
}
